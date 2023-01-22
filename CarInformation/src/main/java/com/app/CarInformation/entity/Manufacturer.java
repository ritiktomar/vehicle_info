package com.app.CarInformation.entity;
import javax.persistence.*;


@Entity
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "code")
    private int code;
    
    @Column(name = "name")
    private String name;
    
    public Manufacturer(){}
    
    public Manufacturer(int code, String name) {
        this.code = code;
        this.name = name;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    // getters and setters
    
}