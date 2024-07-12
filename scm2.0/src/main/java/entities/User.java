package entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "User")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private String userId;

    @Column(name="user_name",nullable=false)
    private String name;

    private String email;
    private String password;

    @Column(columnDefinition="TEXT")
    private String profilePic;

    @Column(length = 255)
    private String phoneNumber;

    //information
    private boolean enabled = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    //self,google,facebook,twitter,linkdin,github
    private providers provider = providers.SELF;
    private String provideUserId;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<contact> contacts = new ArrayList<>();
 
   
}
