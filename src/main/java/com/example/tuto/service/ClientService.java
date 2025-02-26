package com.example.tuto.service;

import com.example.tuto.dao.ClientDao;
import com.example.tuto.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ClientService {

    private ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public void creer(Client client) {
        this.clientDao.save(client);
    }
}
