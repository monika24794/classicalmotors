using System;
using System.Collections.Generic;

namespace classicalfinaldemo.Models
{
    public partial class AppointmentTable
    {
        public AppointmentTable()
        {
            HistroyTables = new HashSet<HistroyTable>();
        }

        public int Id { get; set; }
        public DateTime? Date { get; set; }
        public string? Status { get; set; }
        public TimeOnly? Time { get; set; }
        public int? Serviceid { get; set; }
        public int? Userid { get; set; }

        public virtual ServicesTable? Service { get; set; }
        public virtual UsersTable? User { get; set; }
        public virtual ICollection<HistroyTable> HistroyTables { get; set; }
    }
}
