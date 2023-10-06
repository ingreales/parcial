package Problema2;

import java.io.Serializable;

public class CentroComercialDTO implements Serializable {

    public Integer id;

    private  String mall;

    private String city;

    private  String Address;

    public CentroComercialDTO(Integer id, String mall, String city, String address) {
        this.id = id;
        this.mall = mall;
        this.city = city;
        Address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMall() {
        return mall;
    }

    public void setMall(String mall) {
        this.mall = mall;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "CentroComercialDTO{" +
                "id=" + id +
                ", mall='" + mall + '\'' +
                ", city='" + city + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
