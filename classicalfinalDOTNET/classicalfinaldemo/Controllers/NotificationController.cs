using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace classicalfinaldemo.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class NotificationController : ControllerBase
    {
        private readonly classicalfinaldemoContext _context;
        public NotificationController(classicalfinaldemoContext context)
        {
            _context = context;
        }
        [HttpGet]
        public async Task<ActionResult<List<NotificationTable>>> GetUser()
        {
            return Ok(await _context.NotificationTables.ToListAsync());
        }
    }
}
