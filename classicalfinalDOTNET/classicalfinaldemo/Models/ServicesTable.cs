using System;
using System.Collections.Generic;

namespace classicalfinaldemo.Models
{
    public partial class ServicesTable
    {
        public ServicesTable()
        {
            AppointmentTables = new HashSet<AppointmentTable>();
            HistroyTables = new HashSet<HistroyTable>();
        }

        public int Id { get; set; }
        public float Price { get; set; }
        public string? ServiceName { get; set; }

        public virtual ICollection<AppointmentTable> AppointmentTables { get; set; }
        public virtual ICollection<HistroyTable> HistroyTables { get; set; }
    }
}
