using Microsoft.AspNetCore.Mvc;
using PractiseApplication1.Models;
using PractiseApplication1.Services;

namespace PractiseApplication1.Controllers
{
    public class ProductController : Controller
    {
        private IProductService productService;
        public ProductController(IProductService productService)
        {
            this.productService = productService;
        }
        public IActionResult Index()
        {
            return View();
        }

        public IActionResult GetAllProduct()
        {
            List<Products> product = productService.GetAll();
           // ViewData["catalog"] = (product);
            return Json(product);
        }

        [HttpGet]
        public IActionResult AddProduct()
        {
            return View();
        }

        [HttpPost]
        public IActionResult AddProduct(string title, string description, double unitPrice, string? imageUrl, int quantity)
        {
            Products product = new Products(title, description, unitPrice, imageUrl, quantity);
            productService.Insert(product);
            return View();
            // return RedirectToAction("AddProduct");
        }

        [HttpGet]
        public IActionResult DeleteProduct()
        {
            return View();
        }

        [HttpPost]
        public IActionResult DeleteProduct(int id)
        {
            productService.delete(id);
            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public IActionResult UpdateProduct()
        {
            return View();
        }

        [HttpPost]
          public  IActionResult UpdateProduct(int id, string title, string description, double unitPrice, string? imageUrl, int quantity)
        {
            Products product = new Products(id,title, description, unitPrice, imageUrl, quantity);
            productService.Update(product);
            return RedirectToAction("Index","Home");
        }
        
        [HttpGet]   
        public IActionResult GetById()
        {
        return View(); 
        }

        [HttpPost]
        public IActionResult GetById(int id)
        {
           Products prod = productService.GetById(id);
            ViewData["catalog1"] = (prod);
            return View();
           
        }
        
    }

}
