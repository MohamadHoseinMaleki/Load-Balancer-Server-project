package com.example.demo.model;

import com.example.demo.enumation.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    @NotEmpty(message = "Ip Address cannot be empty or null")
    private String IpAddress;
    private String name;
    private String memory;
    private String type;
    private String imageUrl;
    private Status status;
}
