using PractiseApplication1.Models;
using PractiseApplication1.Repositories;

namespace PractiseApplication1.Services
{
    public class ProductService : IProductService
    {
        private IProductManager productManager = new ProductManager();
        public void delete(int id)
        {
            productManager.delete(id);
        }

        public List<Products> GetAll()
        {
            return productManager.GetAll();
        }
        public Products GetById(int id)
        {
           return productManager.GetById(id);
        }
        
        public void Insert(Products product)
        {
           productManager.Insert(product);
        }

        public void Update(Products product)
        {
            productManager.Update(product);
        }
    }
}
