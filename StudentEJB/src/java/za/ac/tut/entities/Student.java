
package za.ac.tut.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="student_number")
    private String StudentNumber;
    @Column(name="name")
    private String name;
    @Column(name="surname")
    private String surname;
    
    @Lob
    private byte[] photo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    public Student() {
    }

    public Student(String StudentNumber, String name, String surname, byte[] photo, Date createAt) {
        this.StudentNumber = StudentNumber;
        this.name = name;
        this.surname = surname;
        this.photo = photo;
        this.createAt = createAt;
    }

    public String getStudentNumber() {
        return StudentNumber;
    }

    public void setStudentNumber(String StudentNumber) {
        this.StudentNumber = StudentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    
}
