package dao;

import database.Database;
import model.Model;
import service.Service;

import java.security.Provider;
import java.util.*;
import java.util.stream.Collectors;

public class ServiceImpl implements Service {
    Database database = new Database();


    @Override
    public List<Model> addModel(Model model) {
        database.getModels().add(model);
        return List.of(model);

    }

    @Override
    public List<Model> getAllModel() {
        return database.getModels();
    }

    @Override
    public void deleteModelsById(Long id) {
        synchronized (database.getModels()) {
            Iterator<Model> iterator = database.getModels().iterator();
            while (iterator.hasNext()) {
                Model m = iterator.next();
                if (m.getArticle() == id) {
                    iterator.remove();

//        for (int i = 0; i < database.getModels().size(); i++) {
//            if (model.getId() == id) {
//                System.out.println(database.getModels().get(0));
//                this.database.getModels().remove(id);
//                System.out.println("модел ийгиликтуу очурулду!");
//                 }else{
//                System.out.println("мындай модел жок!!!");
                }
            }
        }
    }
    @Override
    public Model searchArticle(int article) {
        for (Model m : database.getModels()) {
            if (m.getArticle() == article) {
                return m;
            }
        }
        return null;
    }

    @Override
    public Model categoryChoice(String cotegory) {
        for (Model m : database.getModels()) {
            if (m.getCategory().equals(cotegory)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public Model sortByPrice() {
       database.getModels().stream().sorted(Comparator.comparing(Model::getPrice)).forEach(System.out::println);
        return (Model) database.getModels();
    }
}
