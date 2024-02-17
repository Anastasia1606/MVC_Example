package org.example.service;

import org.example.model.User;

import java.util.List;

public interface DataService<E> {
    E create(User user);
    List<E> read();
}
