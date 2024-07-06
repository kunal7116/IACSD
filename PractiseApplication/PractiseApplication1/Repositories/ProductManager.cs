using PractiseApplication1.Models;

namespace PractiseApplication1.Repositories
{
    public class ProductManager : IProductManager
    {
        public ProductManager() { }
        public void delete(int id)
        {
            using(var context = new CollectionContext())
            {
                context.Product.Remove(context.Product.Find(id));
                context.SaveChanges();                                
            }
        }

        public List<Products> GetAll()
        {
          using (var context = new CollectionContext())
            {
                var products = from p 
                               in context.Product
                               select p;
                return products.ToList<Products>();
            }
        }

        public Products GetById(int id)
        {
          using( var context = new CollectionContext())
            {
                return context.Product.Find(id);
                
            }
        }


        public void Insert(Products product)
        {
            using ( var context = new CollectionContext())
            {
                context.Product.Add(product);
                context.SaveChanges();
            }
        }

        public void Update(Products product)
        {
           using (var context = new CollectionContext())
            {
                var prod =  context.Product.Find(product.Id);
                prod.Title= product.Title;
                prod.Description= product.Description;
                prod.UnitPrice= product.UnitPrice;
                prod.ImageUrl= product.ImageUrl;
                prod.Quantity= product.Quantity;
                context.SaveChanges();
            }
        }
    }
}
