package com.example.MyBookShopApp.service;
import com.example.MyBookShopApp.data.Genre;
import com.example.MyBookShopApp.repository.GenresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GenresService {

    private GenresRepository genresRepository;

    @Autowired
    public GenresService (GenresRepository genresRepository) {
        this.genresRepository = genresRepository;
    }

    public List<Genre> getGenresList() {
        return genresRepository.getGenresListData();
    }
}
