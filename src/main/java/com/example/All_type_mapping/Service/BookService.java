package com.example.All_type_mapping.Service;

import com.example.All_type_mapping.Model.Book;
import com.example.All_type_mapping.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepo bookRepo;


    public String addbook(Book mybook) {
        bookRepo.save(mybook);
        return "added";
    }

    public List<Book> getallbooks() {
        return bookRepo.findAll();
    }

    public String updatebookbyid(Long id, String title) {
        Book mybook=bookRepo.findById(id).orElse(null);
        if(mybook!=null){
            mybook.setBookTitle(title);
           bookRepo.save(mybook);
           return "update";

        }else{
          return   null;
        }
    }

    public String deletebyid(Long id) {
        bookRepo.deleteById(id);
        return "deleted";
    }
}
