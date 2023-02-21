package com.example.demo.service;

import com.example.demo.model.Server;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.SecondaryTable;

import java.util.Collection;
import java.util.Set;

public interface ServerService {
    Server creat (Server server);
    Collection<Server> list(int limit);
    Server get (long id);
    Server update (Server server);
    Boolean delete (Long id);

}
