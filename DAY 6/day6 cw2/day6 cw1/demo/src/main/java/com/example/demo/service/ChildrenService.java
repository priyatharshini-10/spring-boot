package com.example.demo.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Children;
import com.example.demo.repository.ChildrenRepo;

@Service
public class ChildrenService {

    @Autowired
    private ChildrenRepo childrenRepo;

    public ResponseEntity saveChildrenDetail(Children children) {

        Children c = new Children();
        try {
            c = childrenRepo.save(children);
            return new ResponseEntity<>(c, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(c, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public List<Children> getSortedList(String field) {

        return childrenRepo.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    public List<Children> getPageList(int offset,int size){
 
        Page<Children> p = childrenRepo.findAll(PageRequest.of(offset,size));
        return p.getContent();
    }

    public List<Children> getPageSortList(int offset,int size,String field){
 
        Page<Children> p = childrenRepo.findAll(PageRequest.of(offset,size,Sort.Direction.DESC,field));
        return p.getContent();
    }
}