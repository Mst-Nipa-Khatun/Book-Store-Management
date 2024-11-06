package com.bookStore.service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {
    @Autowired
    private MyBookRepository MyBookRepository;

    public void saveMyBooks(MyBookList book){
        MyBookRepository.save(book);
    }
    public List<MyBookList> getMyBookList(){
        return MyBookRepository.findAll();
    }
    public void deleteById(int id){
        MyBookRepository.deleteById(id);
    }
}

