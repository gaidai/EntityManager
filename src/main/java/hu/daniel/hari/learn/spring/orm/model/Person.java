package hu.daniel.hari.learn.spring.orm.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Person")
@Entity
public class Person implements Serializable {

	@Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
        private String country;

	public Person() {
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

    public Person(Integer id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", country=" + country + '}';
    }
	
}
