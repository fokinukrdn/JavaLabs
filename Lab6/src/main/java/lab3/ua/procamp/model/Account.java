package lab3.ua.procamp.model;

//import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

//@NoArgsConstructor
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode(of = "email")
public class Account {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthday;
    private Sex sex;
    private LocalDate creationDate;
    private BigDecimal balance = BigDecimal.ZERO;

    public Account(Long id, String firstName, String lastName, String email, LocalDate birthday, Sex sex, LocalDate creationDate, BigDecimal balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birthday = birthday;
        this.sex = sex;
        this.creationDate = creationDate;
        this.balance = balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getSex() {
        return sex;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}

