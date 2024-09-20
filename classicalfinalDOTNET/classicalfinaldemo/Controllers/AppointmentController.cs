using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;

namespace classicalfinaldemo.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class AppointmentController : ControllerBase
    {
        private readonly classicalfinaldemoContext _context;
        public AppointmentController(classicalfinaldemoContext context)
        {
            _context = context;
        }
        [HttpGet]
        public async Task<ActionResult<List<AppointmentTable>>> GetUser()
        {
            return Ok(await _context.AppointmentTables.ToListAsync());
        }
    }
}

