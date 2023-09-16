@Controller
@RequestMapping("/salesman")
public class SalesmanController {

    @Autowired
    private ProductService productService;

    @Autowired
    private SalesBillService salesBillService;

    @GetMapping("/generate-sales-bill")
    public String generateSalesBill(Model model) {
        // Load product information from the database
        List<Product> productList = productService.getAllProducts();
        
        // Initialize a new SalesBill object or DTO
        SalesBill salesBill = new SalesBill();
        
        model.addAttribute("productList", productList);
        model.addAttribute("salesBill", salesBill);
        
        return "sales-bill"; // Return the Thymeleaf template for generating sales bills
    }

    @PostMapping("/generate-sales-bill")
    public String generateSalesBillPost(@ModelAttribute("salesBill") SalesBill salesBill) {
        // Process the submitted sales bill data, calculate total cost, and store it in the database
        salesBillService.generateSalesBill(salesBill);
        
        // Redirect to a success page or display a confirmation message
        return "redirect:/salesman/success"; // You can create a success page or route
    }
}
