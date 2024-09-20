using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace classicalfinaldemo.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class HistoryController : ControllerBase
    {
        private readonly classicalfinaldemoContext _context;
        public HistoryController(classicalfinaldemoContext context)
        {
            _context = context;
        }
        [HttpGet]
        public async Task<ActionResult<List<HistroyTable>>> GetHistroy()
        {
            return Ok(await _context.HistroyTables.ToListAsync());
        }
    }
}
