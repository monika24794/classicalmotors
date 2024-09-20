using System;
using System.Collections.Generic;

namespace classicalfinaldemo.Models
{
    public partial class VehicalTable
    {
        public int Id { get; set; }
        public string? Liecenceplate { get; set; }
        public string? Model { get; set; }
        public string? Type { get; set; }
        public int? Userid { get; set; }

        public virtual UsersTable? User { get; set; }
    }
}
