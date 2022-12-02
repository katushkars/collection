import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Passport {
    private final int numberPassport;
    private String surname;
    private String firstname;
    private String middleName;
    private String birthDate;


    public Passport(int numberPassport, String surname, String firstname, String middleName, String birthDate) {
        this.numberPassport = numberPassport;
        this.surname = surname;
        this.firstname = firstname;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return numberPassport == passport.numberPassport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport);
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return "Passport{" +
                "numberPassport=" + numberPassport +
                ", surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';

    }

}

