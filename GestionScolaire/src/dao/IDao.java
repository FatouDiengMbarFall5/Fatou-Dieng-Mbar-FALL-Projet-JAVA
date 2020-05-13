/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;


/**
 *
 * @author Fatoo FaLL
 */
public interface IDao<T> {
    public int create(T obj);
    public ArrayList<T> selectAll();
    public T selectById(int id);
    public T selectByNumero(String numero);
}
