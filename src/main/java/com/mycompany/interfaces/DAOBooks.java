package com.mycompany.interfaces;

import com.mycompany.models.Books;
import java.util.List;

public interface DAOBooks {
    public void registrar(Books book) throws Exception;
    public void modificar(Books book) throws Exception;
    public void eliminar(int bookId) throws Exception;
    public List<Books> listar(String title) throws Exception;
    public Books getBookById(int bookId) throws Exception;
}
