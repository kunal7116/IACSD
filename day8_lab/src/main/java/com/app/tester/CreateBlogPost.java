package com.app.tester;

import org.hibernate.SessionFactory;

import com.app.dao.BlogPostDao;
import com.app.dao.BlogPostDaoImpl;
import com.app.entities.BlogPost;
import com.app.entities.Category;

import static com.app.utils.HibernateUtils.getFactory;

import java.util.Scanner;

public class CreateBlogPost {

	public static void main(String[] args) {
		try(SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)){
			//create Blog post dao instance
			BlogPostDao bp= new BlogPostDaoImpl();
			System.out.println("Enter the Post Details-");
			System.out.println("Enter the title");
			String tit = sc.next();
			System.out.println("Enter the Description");
			String desc = sc.next();
			System.out.println("Enter the content");
			String cont = sc.next();
			System.out.println("Enter the Category id and author id");
			Long authId =(long) sc.nextInt();
			Long catId =(long) sc.nextInt();
			BlogPost post = new BlogPost(tit,desc,cont);
			bp.createNewBlog(post, authId, catId);
		}

	}

}
