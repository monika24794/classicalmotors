using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace classicalfinaldemo.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class InvoiceController : ControllerBase
    {

        private readonly classicalfinaldemoContext _context;
        public InvoiceController(classicalfinaldemoContext context)
        {
            _context = context;
        }
        [HttpGet]
        public async Task<ActionResult<List<InvoiceTable>>> GetUser()
        {
            return Ok(await _context.InvoiceTables.ToListAsync());
        }
    }
}
