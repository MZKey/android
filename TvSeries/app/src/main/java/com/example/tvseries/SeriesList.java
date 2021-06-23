package com.example.tvseries;

import java.util.ArrayList;
import java.util.List;

public class SeriesList {
    List<String> getListTv(String spinner) {
        List<String> list = new ArrayList<>();

        if (spinner.equals("Комедии")){
            list.add("Друзья");
        } if (spinner.equals("Фэнтэзи")){
            list.add("Игра престолов");
        } if (spinner.equals("Ужасы")){
            list.add("Ходячие мертвецы");
        } if (spinner.equals("Фантастика")){
            list.add("Футурама");
        } if (spinner.equals("Криминал")){
            list.add("Во все тяжкие");
        }
        return list;
    }
}
