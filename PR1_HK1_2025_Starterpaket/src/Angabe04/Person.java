package Angabe04;

public class Person {
    private int id;
    private String vorname;
    private String nachname;
    private int alter;
    private String email;

    public Person(int id, String vorname, String nachname, int alter, String email) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public String getEmail() {
        return email;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s %s | Alter: %d | Email: %s",
                id, vorname, nachname, alter, email);
    }
}

