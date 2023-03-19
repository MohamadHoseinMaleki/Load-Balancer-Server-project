package com.example.demo.service.implemention;

import com.example.demo.enumation.Status;
import com.example.demo.model.Server;
import com.example.demo.repo.ServerRepo;
import com.example.demo.service.ServerService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOError;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;
@RequiredArgsConstructor
@Service
@Transactional
@Slf4j

public class ServerServiceImp implements ServerService {
    private final ServerRepo serverRepo;
    @Override
    public Server creat(Server server) {
        log.info("new server :{} ", server.getName());
        server.setImageUrl(setServerImageUrl());
        return serverRepo.save(server);
    }
    public Server ping(String ipAddress)throws IOException{
        log.info("Pinging server Ip: {}",ipAddress);
        Server server=serverRepo.findByIpAddress(ipAddress);
        InetAddress address=InetAddress.getByName(ipAddress);
        server.setStatus(address.isReachable(10000) ? Status.SERVER_UP : Status.SERVER_DOWN);
        serverRepo.save(server);
        return server;
    }
    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(long id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }

    private String setServerImageUrl(){
        return null;
    }

}
