package com.app.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import static com.app.utils.HibernateUtils.getFactory;

import com.app.entities.BlogPost;
import com.app.entities.Category;
import com.app.entities.User;

public class BlogPostDaoImpl implements BlogPostDao {

	@Override
	public String createNewBlog(BlogPost post, Long categoryId, Long authorId) {
		//1. GetSession from sessionFactory(get current session)
		Session session=getFactory().getCurrentSession();
		//2. begin a tx
		Transaction tx=session.beginTransaction();
		try {
			//1.get category from it's id
			Category cat = session.get(Category.class, categoryId);
			//2.get author from it's id
			User author = session.get(User.class, authorId);
			//null checking -- if not null
			if(cat!=null && author !=null) {
			//establish ass between post --> author n post --> category
			//setter
				post.setChosenCategory(cat);
				post.setAuthor(author);
			//since no cascading yet -- explicitly persist post.
				session.persist(post);
		}
			tx.commit();
		}
			catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
				//re throw the exception of the caller
			throw e;
			}
		}
		return null;
		
	}

}
