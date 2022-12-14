package com.example.compuExpress.services;

import com.example.compuExpress.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends Base, ID extends Serializable> {

    public List<E> findAll() throws Exception;
    public Page<E> findAll(Pageable pageable) throws Exception;
    public E findById(ID id) throws Exception;
    public E save(E entity) throws Exception;
    public E update(ID id, E entity) throws Exception;
    public Boolean delete(ID id) throws Exception;


    /* Search con Filtros */

    List<E> search(String filtro) throws Exception;

    Page<E> search(String filtro, Pageable pageable) throws Exception;


}
