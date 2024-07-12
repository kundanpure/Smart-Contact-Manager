package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "contact")
public class contact {

    @Id
    private String name;

    private String email;
    private String phoneNumber;
    private String address;
    private String picture;

    @Column(length=1000)
    private String description;

    private String websiteLink;
    private String linkedInLink; // Corrected variable name to follow Java naming conventions

    @ManyToOne
    private User user;

     @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<SocailLink> links=new ArrayList<>();
    // Constructors, getters, and setters as needed
    // Ensure you have appropriate annotations and methods for JPA compatibility
}
