package user;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Stududent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "registration_no")
    private String registrationNo;

    @Column(name = "is_active")
    private Boolean isActive;

    public Stududent() {

    }

    public Stududent(String name, String registrationNo, Boolean isActive) {
        this.setName(name);
        this.setRegistrationNo(registrationNo);
        this.setActive(isActive);
    }

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

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
