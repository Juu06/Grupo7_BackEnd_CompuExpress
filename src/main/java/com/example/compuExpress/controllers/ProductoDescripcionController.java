package com.example.compuExpress.controllers;

import com.example.compuExpress.entities.ProductoDescripcion;
import com.example.compuExpress.services.ProductoDescripcionServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/productodescripciones")
public class ProductoDescripcionController extends BaseControllerImpl<ProductoDescripcion, ProductoDescripcionServiceImpl> {


}