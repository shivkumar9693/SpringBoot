package com.springcore.AutoWire;

public class Emp {
    private Address address;

    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }
    // Default constructor (needed by Spring)
    public Emp() {
    }
    public Emp(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "address=" + address +
                '}';
    }

}
