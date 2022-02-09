package com.ntnu.library;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private List<Author> authorList;

    public AuthorController(){

    }
    public void fillAuthorListWithTestData(){
        authorList.add(new Author(1, "Stephen", "King", 1956));
        authorList.add(new Author(2, "Karl", "Larsson", 1942));
        authorList.add(new Author(3, "Siw", "Flataaker", 1983));
        authorList.add(new Author(4, "Bjørnar", "Ytterberg", 1958));
    }
}
