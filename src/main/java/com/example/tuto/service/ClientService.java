package com.example.tuto.service;

import com.example.tuto.dao.ClientDao;
import com.example.tuto.entities.Client;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private ClientDao clientDao;

    public ClientService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public void creer(Client client) {
        Client clientByEmail = this.clientDao.findByEmail(client.getEmail());
        if (clientByEmail == null) {
            this.clientDao.save(client);
        }
    }

    public List<Client> rechercher() {
        return this.clientDao.findAll();
    }

    public Client lire(int id) {
        Optional<Client> optionalClient = this.clientDao.findById(id);
        if (optionalClient.isPresent()) {
            return optionalClient.get();
        }
        return null;
    }
}
