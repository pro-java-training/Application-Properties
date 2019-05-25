package com.codve.Bean;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

@Data
@Slf4j
@Component
@PropertySource("classpath:data.properties")
public class DataSource5 {

    private String filename;

    private Hashtable<Integer, Book> books;

    public DataSource5( @Value("${filename}") String filename) {
        this.filename = filename;
        log.info(this.filename);

        Resource resource = new ClassPathResource(this.filename);
        books = new Hashtable<>();
        try {
            String filePath = resource.getFile().getPath();

            ObjectMapper objectMapper = new ObjectMapper();
            ArrayList<Book> bookList = objectMapper.readValue(new File(filePath), new TypeReference<List<Book>>(){});
            for (Book book : bookList) {
                books.put(book.getId(), book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBooks() {
        String result = "";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            result = objectMapper.writeValueAsString(books);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
