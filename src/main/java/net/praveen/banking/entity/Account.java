package net.praveen.banking.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Account implements Serializable {
    private static final long serialVersionUID = 1307525040224585678L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String accountNumber;
    private double balance;
    private String account_type = "Saving";
    private String branch = "NIT";
    private String ifsc_code = "NIT001";
    private String pin;
    private String accountstatus;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
