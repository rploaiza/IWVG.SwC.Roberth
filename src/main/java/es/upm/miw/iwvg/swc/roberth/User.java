package es.upm.miw.iwvg.swc.roberth;

public class User {
    private int number;

    private String name;

    private String familyName;

    private int postalCode;

    private String email;

    public User(int number, String name, String familyName, int postalCode, String email) {
        this.number = number;
        this.name = this.format(name);
        this.familyName = this.format(familyName);
        this.postalCode = postalCode;
        this.email = this.format(email);
    }

    private String format(String string) {
        return string.trim().substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public int getPostalCode() {
        return this.postalCode;
    }

    public String getEmail() {
        return this.email;
    }

}
