package business.service;

import java.util.Map;

public class MyService {

    public void inert(Map map) {
        System.out.println("insert " + map);
    }

    public void update(Map map) {
        System.out.println("update " + map);
    }

    public void delete(Map map) {
        System.out.println("delete " + map);
    }

    public void findById(String id) {
        System.out.println("findById " + id);
    }

    public void findAll(Map map) {
        System.out.println("findAll " + map);
    }
}
