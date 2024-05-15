package baum.kantin.kantinmanager.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String roomNumber;
    private String email;
    private String password;
    private String imageUrl;
    private String jobTitle;
    private Long phoneNumber;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

    public Employee(String name, String roomNumber, String email, Long phoneNumber, String employeeCode, String password, String imageUrl, String jobTitle) {
        this.name = name;
        this.roomNumber = roomNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.employeeCode = employeeCode;
        this.password = password;
        this.imageUrl = imageUrl;
        this.jobTitle = jobTitle;
    }
    public Employee(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
