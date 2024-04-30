package com.example.apiserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.apiserver.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
