package com.petshopspringboot.petshopspring.model;


import javax.persistence.*;

@Entity
@Table(name="shop")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int _ID;


    private String _name;
    private String _sex;
    private int _age;
    private double _price;
    private String _type;

    public String getType()
    {
        return _type;
    }

    public void setType(String value)
    {
        _type = value;
    }

    public int getID()
    {
        return _ID;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String value)
    {
        _name = value;
    }

    public String getSex()
    {
        return _sex;
    }

    public void setSex(String value)
    {
        _sex = value;
    }

    public int getAge()
    {
        return _age;
    }

    public void setAge(int value)
    {
        _age = value;
    }

    public double getPrice()
    {
        return _price;
    }

    public void setPrice(double value)
    {
        _price = value;
    }
}
