package com.bookStore.service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBookListService {
    @Autowired
    private MyBookRepository MyBookRepository;

    public void saveMyBooks(MyBookList book){
        MyBookRepository.save(book);
    }
}

