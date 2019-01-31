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
}
