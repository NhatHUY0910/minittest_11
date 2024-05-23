package com.minitest_11.model;

import javax.persistence.*;

@Entity
@Table(name = "computers")
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private String name;
    private String producer;

    @ManyToOne
    @JoinColumn(name = "producer_id")
    private Type type;

    public Computer() {}

    public Computer(String code, String name, String producer) {
        this.code = code;
        this.name = name;
        this.producer = producer;
    }

    public Computer(String code, String name, String producer, Type type) {
        this.code = code;
        this.name = name;
        this.producer = producer;
        this.type = type;
    }

    public Computer(Long id, String code, String name, String producer, Type type) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.producer = producer;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Computer[id=%d, code=%s, name=%s, producer=%s]", id, code, name, producer);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
