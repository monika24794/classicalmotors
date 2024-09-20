using classicalfinaldemo.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace classicalfinaldemo.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class VehicalController : ControllerBase
    {
        private readonly classicalfinaldemoContext _context;
        public VehicalController(classicalfinaldemoContext context)
        {
            _context = context;
        }
        [HttpGet]
        public async Task<ActionResult<List<VehicalTable>>> GetUser()
        {
            return Ok(await _context.VehicalTables.ToListAsync());
        }
    }
}
