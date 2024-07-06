using PractiseApplication1.Models;

namespace PractiseApplication1.Services
{
    public interface IProductService
    {
        List<Products> GetAll();
        Products GetById(int id);
        void Insert(Products product);
        void Update(Products product);
        void delete(int id);
    }
}
