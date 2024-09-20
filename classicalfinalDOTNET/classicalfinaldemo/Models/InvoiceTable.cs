using System;
using System.Collections.Generic;

namespace classicalfinaldemo.Models
{
    public partial class InvoiceTable
    {
        public int Id { get; set; }
        public DateTime? Issued { get; set; }
        public string? Number { get; set; }
        public string? Status { get; set; }
        public double TotalAmount { get; set; }
    }
}
