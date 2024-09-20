using classicalfinaldemo.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace classicalfinaldemo.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class OfferController : ControllerBase
    {
        private readonly classicalfinaldemoContext _context;
        public OfferController(classicalfinaldemoContext context)
        {
            _context = context;
        }
        [HttpGet]
        public async Task<ActionResult<List<OfferTable>>> GetOffer()
        {
            return Ok(await _context.OfferTables.ToListAsync());
        }
    }
}
