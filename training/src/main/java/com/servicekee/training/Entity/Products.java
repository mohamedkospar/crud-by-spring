package com.servicekee.training.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document("products")
public class Products {

    @Id
    String id ;
    String info ;
    String name ;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss" , timezone = JsonFormat.DEFAULT_LOCALE)

    private Date timeStamp = new Date(System.currentTimeMillis());


}
