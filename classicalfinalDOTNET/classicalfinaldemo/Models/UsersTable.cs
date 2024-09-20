using System;
using System.Collections.Generic;

namespace classicalfinaldemo.Models
{
    public partial class UsersTable
    {
        public UsersTable()
        {
            AppointmentTables = new HashSet<AppointmentTable>();
            NotificationTables = new HashSet<NotificationTable>();
            VehicalTables = new HashSet<VehicalTable>();
        }

        public int Id { get; set; }
        public string? City { get; set; }
        public string? Email { get; set; }
        public string? FirstName { get; set; }
        public string? LastName { get; set; }
        public string? Password { get; set; }
        public string? PhoneNo { get; set; }
        public int Pincode { get; set; }
        public string? Role { get; set; }
        public string? State { get; set; }
        public string? UserName { get; set; }

        public virtual ICollection<AppointmentTable> AppointmentTables { get; set; }
        public virtual ICollection<NotificationTable> NotificationTables { get; set; }
        public virtual ICollection<VehicalTable> VehicalTables { get; set; }
    }
}
