package com.example.All_type_mapping.Controller;

import com.example.All_type_mapping.Model.Book;
import com.example.All_type_mapping.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;


    @PostMapping("books")

    public String addbook(@RequestBody Book mybook){
       return  bookService.addbook(mybook);
    }

   @GetMapping("books")
    public List<Book> getallbooks(){
        return bookService.getallbooks();
   }

   @PutMapping("book/id/{id}")
    public String updatebookbyid(@PathVariable Long id,@RequestParam String title ){
        return bookService.updatebookbyid(id,title);
   }

   @DeleteMapping("book/id/{id}")
    public String deletebyid(@PathVariable Long id){
        return bookService.deletebyid(id);
   }
}
