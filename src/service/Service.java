package service;

import database.Database;
import model.Model;

import java.util.List;

public interface Service {
    List<Model> addModel(Model model);
    List<Model> getAllModel();
    void deleteModelsById(Long id);
    Model searchArticle(int article);
    Model categoryChoice(String cotegory);
    Model sortByPrice();
}
