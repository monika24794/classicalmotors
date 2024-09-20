using classicalfinaldemo.Models;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
 

namespace classicalfinaldemo.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class AdminController : ControllerBase
    {
        private readonly classicalfinaldemoContext _context;
        public AdminController(classicalfinaldemoContext context)
        {
            _context = context;
        }
        [HttpGet]
        public async Task<ActionResult<List<UsersTable>>>GetUser()
        {
            return Ok(await _context.UsersTables.ToListAsync());
        }
    }
}
