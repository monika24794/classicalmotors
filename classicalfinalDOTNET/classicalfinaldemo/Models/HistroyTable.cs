using System;
using System.Collections.Generic;

namespace classicalfinaldemo.Models
{
    public partial class HistroyTable
    {
        public int Id { get; set; }
        public DateTime? Date { get; set; }
        public string? Notes { get; set; }
        public int Rateing { get; set; }
        public string? Status { get; set; }
        public int? AppointmentId { get; set; }
        public int? Serviceid { get; set; }

        public virtual AppointmentTable? Appointment { get; set; }
        public virtual ServicesTable? Service { get; set; }
    }
}
