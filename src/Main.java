import dao.ServiceImpl;
import enums.Category;
import model.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        Model model = new Model(1,"Samsung",214,50000, LocalDate.of(2012,07,12), Category.PHONE,12413);
        Model model1 = new Model(2,"Iphone",365,423452,LocalDate.of(2023,12,3),Category.PHONE,2354);
        Model model2 = new Model(6,"Lenovo",528,46000,LocalDate.of(2022,12,9),Category.LAPTOP,2454);
        List<Model>models = new ArrayList<>(List.of(model,model1,model2));

        System.out.println(models);
        System.out.println(service.addModel(model));
        System.out.println(service.getAllModel());
        service.deleteModelsById(6L);
        System.out.println(service.searchArticle(12413));
        System.out.println(service.categoryChoice("LAPTOP"));
      //  System.out.println(service.sortByPrice());

    }

    }