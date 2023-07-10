package com.example.MyBookShopApp.service;
import com.example.MyBookShopApp.data.Genre;
import com.example.MyBookShopApp.repository.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GenresService {

    private GenresRepository genresRepository;

    @Autowired
    public GenresService (GenresRepository genresRepository) {
        this.genresRepository = genresRepository;
    }

    public List<Genre> getGenresAll() {
        return genresRepository.getGenresListData();
    }

    //Метод собирает список дочерних Genre для каждого Genre
    public List<Genre> getGenresListWithChild() {

        List<Genre> genresList = getGenresAll();

        for(Genre genre : genresList) {
            List<Genre> genresChildList = new ArrayList<>();

            for(int i = 0; i < genresList.size(); i++) {
                Genre genreChild = genresList.get(i);
                if(genreChild.getParent_id() == genre.getId()) {
                    genresChildList.add(genreChild);
                }
            }
            genre.setChild_id(genresChildList);
        }
        return genresList;
    }
}
