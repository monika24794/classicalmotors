using System;
using System.Collections.Generic;

namespace classicalfinaldemo.Models
{
    public partial class NotificationTable
    {
        public int Id { get; set; }
        public DateTime? CreatedAt { get; set; }
        public ulong IsRead { get; set; }
        public string? Message { get; set; }
        public string? Title { get; set; }
        public int? IdUser { get; set; }

        public virtual UsersTable? IdUserNavigation { get; set; }
    }
}
