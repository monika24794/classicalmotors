using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;
using Microsoft.EntityFrameworkCore.Metadata;

namespace classicalfinaldemo.Models
{
    public partial class classicalfinaldemoContext : DbContext
    {
        public classicalfinaldemoContext()
        {
        }

        public classicalfinaldemoContext(DbContextOptions<classicalfinaldemoContext> options)
            : base(options)
        {
        }

        public virtual DbSet<AppointmentTable> AppointmentTables { get; set; } = null!;
        public virtual DbSet<HistroyTable> HistroyTables { get; set; } = null!;
        public virtual DbSet<InvoiceTable> InvoiceTables { get; set; } = null!;
        public virtual DbSet<NotificationTable> NotificationTables { get; set; } = null!;
        public virtual DbSet<OfferTable> OfferTables { get; set; } = null!;
        public virtual DbSet<ServicesTable> ServicesTables { get; set; } = null!;
        public virtual DbSet<UsersTable> UsersTables { get; set; } = null!;
        public virtual DbSet<VehicalTable> VehicalTables { get; set; } = null!;

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            if (!optionsBuilder.IsConfigured)
            {
#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see http://go.microsoft.com/fwlink/?LinkId=723263.
                optionsBuilder.UseMySql("server=Localhost;user=root;password=password;database=classicalfinaldemo", Microsoft.EntityFrameworkCore.ServerVersion.Parse("8.0.33-mysql"));
            }
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.UseCollation("utf8mb4_0900_ai_ci")
                .HasCharSet("utf8mb4");

            modelBuilder.Entity<AppointmentTable>(entity =>
            {
                entity.ToTable("appointment_table");

                entity.HasIndex(e => e.Serviceid, "FK3lhxcc34q6io54wlrdpv30v3h");

                entity.HasIndex(e => e.Userid, "FKga7gkn39t0ohx6itfs7eg3brt");

                entity.Property(e => e.Id).HasColumnName("id");

                entity.Property(e => e.Date)
                    .HasMaxLength(6)
                    .HasColumnName("date");

                entity.Property(e => e.Serviceid).HasColumnName("serviceid");

                entity.Property(e => e.Status)
                    .HasMaxLength(255)
                    .HasColumnName("status");

                entity.Property(e => e.Time)
                    .HasMaxLength(6)
                    .HasColumnName("time");

                entity.Property(e => e.Userid).HasColumnName("userid");

                entity.HasOne(d => d.Service)
                    .WithMany(p => p.AppointmentTables)
                    .HasForeignKey(d => d.Serviceid)
                    .HasConstraintName("FK3lhxcc34q6io54wlrdpv30v3h");

                entity.HasOne(d => d.User)
                    .WithMany(p => p.AppointmentTables)
                    .HasForeignKey(d => d.Userid)
                    .HasConstraintName("FKga7gkn39t0ohx6itfs7eg3brt");
            });

            modelBuilder.Entity<HistroyTable>(entity =>
            {
                entity.ToTable("histroy_table");

                entity.HasIndex(e => e.AppointmentId, "FK256ilaajpu0tu4vfmq1g8fes7");

                entity.HasIndex(e => e.Serviceid, "FKmyn3j6xjuh3uubi7fbh9u5d3n");

                entity.Property(e => e.Id).HasColumnName("id");

                entity.Property(e => e.AppointmentId).HasColumnName("appointment_id");

                entity.Property(e => e.Date)
                    .HasMaxLength(6)
                    .HasColumnName("date");

                entity.Property(e => e.Notes)
                    .HasMaxLength(255)
                    .HasColumnName("notes");

                entity.Property(e => e.Rateing).HasColumnName("rateing");

                entity.Property(e => e.Serviceid).HasColumnName("serviceid");

                entity.Property(e => e.Status)
                    .HasMaxLength(255)
                    .HasColumnName("status");

                entity.HasOne(d => d.Appointment)
                    .WithMany(p => p.HistroyTables)
                    .HasForeignKey(d => d.AppointmentId)
                    .HasConstraintName("FK256ilaajpu0tu4vfmq1g8fes7");

                entity.HasOne(d => d.Service)
                    .WithMany(p => p.HistroyTables)
                    .HasForeignKey(d => d.Serviceid)
                    .HasConstraintName("FKmyn3j6xjuh3uubi7fbh9u5d3n");
            });

            modelBuilder.Entity<InvoiceTable>(entity =>
            {
                entity.ToTable("invoice_table");

                entity.Property(e => e.Id).HasColumnName("id");

                entity.Property(e => e.Issued)
                    .HasMaxLength(6)
                    .HasColumnName("issued");

                entity.Property(e => e.Number)
                    .HasMaxLength(255)
                    .HasColumnName("number");

                entity.Property(e => e.Status)
                    .HasMaxLength(255)
                    .HasColumnName("status");

                entity.Property(e => e.TotalAmount).HasColumnName("total_amount");
            });

            modelBuilder.Entity<NotificationTable>(entity =>
            {
                entity.ToTable("notification_table");

                entity.HasIndex(e => e.IdUser, "FKi0qfjtt340c7xtxi38615mbed");

                entity.Property(e => e.Id).HasColumnName("id");

                entity.Property(e => e.CreatedAt)
                    .HasMaxLength(6)
                    .HasColumnName("created_at");

                entity.Property(e => e.IdUser).HasColumnName("id_user");

                entity.Property(e => e.IsRead)
                    .HasColumnType("bit(1)")
                    .HasColumnName("is_read");

                entity.Property(e => e.Message)
                    .HasMaxLength(255)
                    .HasColumnName("message");

                entity.Property(e => e.Title)
                    .HasMaxLength(255)
                    .HasColumnName("title");

                entity.HasOne(d => d.IdUserNavigation)
                    .WithMany(p => p.NotificationTables)
                    .HasForeignKey(d => d.IdUser)
                    .HasConstraintName("FKi0qfjtt340c7xtxi38615mbed");
            });

            modelBuilder.Entity<OfferTable>(entity =>
            {
                entity.ToTable("offer_table");

                entity.Property(e => e.Id).HasColumnName("id");

                entity.Property(e => e.Discription)
                    .HasMaxLength(255)
                    .HasColumnName("discription");

                entity.Property(e => e.End).HasColumnName("end");

                entity.Property(e => e.Name)
                    .HasMaxLength(255)
                    .HasColumnName("name");

                entity.Property(e => e.Start).HasColumnName("start");
            });

            modelBuilder.Entity<ServicesTable>(entity =>
            {
                entity.ToTable("services_table");

                entity.Property(e => e.Id).HasColumnName("id");

                entity.Property(e => e.Price).HasColumnName("price");

                entity.Property(e => e.ServiceName)
                    .HasMaxLength(255)
                    .HasColumnName("service_name");
            });

            modelBuilder.Entity<UsersTable>(entity =>
            {
                entity.ToTable("users_table");

                entity.HasIndex(e => e.Email, "UKk9gbvc9xvagimmj1y060txmha")
                    .IsUnique();

                entity.Property(e => e.Id).HasColumnName("id");

                entity.Property(e => e.City)
                    .HasMaxLength(255)
                    .HasColumnName("city");

                entity.Property(e => e.Email).HasColumnName("email");

                entity.Property(e => e.FirstName)
                    .HasMaxLength(255)
                    .HasColumnName("first_name");

                entity.Property(e => e.LastName)
                    .HasMaxLength(255)
                    .HasColumnName("last_name");

                entity.Property(e => e.Password)
                    .HasMaxLength(255)
                    .HasColumnName("password");

                entity.Property(e => e.PhoneNo)
                    .HasMaxLength(255)
                    .HasColumnName("phone_no");

                entity.Property(e => e.Pincode).HasColumnName("pincode");

                entity.Property(e => e.Role)
                    .HasColumnType("enum('EMPLOYEE','USER')")
                    .HasColumnName("role");

                entity.Property(e => e.State)
                    .HasMaxLength(255)
                    .HasColumnName("state");

                entity.Property(e => e.UserName)
                    .HasMaxLength(255)
                    .HasColumnName("user_name");
            });

            modelBuilder.Entity<VehicalTable>(entity =>
            {
                entity.ToTable("vehical_table");

                entity.HasIndex(e => e.Userid, "FKp094unolf8deeaeu9u0b9128u");

                entity.Property(e => e.Id).HasColumnName("id");

                entity.Property(e => e.Liecenceplate)
                    .HasMaxLength(255)
                    .HasColumnName("liecenceplate");

                entity.Property(e => e.Model)
                    .HasMaxLength(255)
                    .HasColumnName("model");

                entity.Property(e => e.Type)
                    .HasMaxLength(255)
                    .HasColumnName("type");

                entity.Property(e => e.Userid).HasColumnName("userid");

                entity.HasOne(d => d.User)
                    .WithMany(p => p.VehicalTables)
                    .HasForeignKey(d => d.Userid)
                    .HasConstraintName("FKp094unolf8deeaeu9u0b9128u");
            });

            OnModelCreatingPartial(modelBuilder);
        }

        partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
    }
}
