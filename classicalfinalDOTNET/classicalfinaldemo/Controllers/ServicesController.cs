using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace classicalfinaldemo.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class ServicesController : ControllerBase
    {
        private readonly classicalfinaldemoContext _context;
        public ServicesController(classicalfinaldemoContext context)
        {
            _context = context;
        }
        [HttpGet]
        public async Task<ActionResult<List<ServicesTable>>> GetServices()
        {
            return Ok(await _context.ServicesTables.ToListAsync());
        }
    }
}
