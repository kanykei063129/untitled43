package database;

import model.Model;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Model>models = new ArrayList<>();

    public Database(List<Model> models) {
        this.models = models;
    }
    public Database(){

    }

    public List<Model> getModels() {
        return models;
    }

    public void setModels(List<Model> models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "Database{" +
                "models=" + models +
                '}';
    }
}
