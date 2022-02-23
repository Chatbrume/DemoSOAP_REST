package com.objis.demo.rest.tp8;

public class Employ
{
    private String lastname;
    private String firstname;

    public Employ(String lastname, String firstname) {
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void poserConges()
    {
        System.out.println("L'employer "+this.firstname+" "+this.lastname+" a poser un conges !");
    }

    @Override
    public String toString() {
        return "Employ{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                '}';
    }
}
