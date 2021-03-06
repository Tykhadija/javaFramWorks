package service;

import dao.IClientDao;
import models.Client;

public class ClientServiceImp implements IClientService{

    private IClientDao dao;

    public void setDao(IClientDao dao){
        this.dao=dao;
    }
    public ClientServiceImp() {
        System.out.println("call Service class");
    }
    @Override
    public Client save(Client c){
        return dao.save(c);
    }
    @Override
    public  Client modify(Client c){
        return  dao.update(c);
    }
    @Override
    public void  removeById(long id){
        dao.deleteById(id);
    }
    @Override
    public Client getById(long id){
        return dao.findById(id);
    }
}
