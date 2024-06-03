package vn.edu.iuh.fit.backEnd.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.backEnd.converters.EmployeeStatusConverter;
import vn.edu.iuh.fit.backEnd.enums.EmployeeStatus;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;

    @Column(name = "full_name", length = 150, nullable = false)
    private String name;
    @Column(name = "dob", nullable = false)
    private LocalDateTime dob;
    @Column(name = "email", unique = true, length = 150)
    private String email;
    @Column(name = "phone", length = 15, nullable = false)
    private String phone;
    @Column(name = "address", length = 250, nullable = false)
    private String address;
    @Column(name = "status", nullable = false)
    @Convert(converter = EmployeeStatusConverter.class)
    private EmployeeStatus status;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Order> lstOrder;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public Employee() {
    }

    public Employee(long id, String name, LocalDateTime dob, String email, String phone, String address, EmployeeStatus status) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", lstOrder=" + lstOrder +
                '}';
    }
}
