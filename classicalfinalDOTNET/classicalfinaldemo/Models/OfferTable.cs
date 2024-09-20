using System;
using System.Collections.Generic;

namespace classicalfinaldemo.Models
{
    public partial class OfferTable
    {
        public int Id { get; set; }
        public string? Discription { get; set; }
        public DateTime? End { get; set; }
        public string? Name { get; set; }
        public DateTime? Start { get; set; }
    }
}
