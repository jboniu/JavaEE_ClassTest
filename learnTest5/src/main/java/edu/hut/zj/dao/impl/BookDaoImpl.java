package edu.hut.zj.dao.impl;

import edu.hut.zj.dao.BookDao;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookDaoImpl implements BookDao {
    public String autName;
    public Set sets;
    public List lists;
    public Map maps;

    public void setAutName(String autName) {
        this.autName = autName;
    }

    public void setSets(Set sets) {
        this.sets = sets;
    }

    public void setLists(List lists) {
        this.lists = lists;
    }

    public void setMaps(Map maps) {
        this.maps = maps;
    }
    @Override
    public void isBook(String autName) {
        System.out.println("Author:"+autName);
        System.out.println("<set>example:"+sets.toString());
        System.out.println("<list>example:"+lists.toString());
        System.out.println("<map>example:"+maps.toString());
    }



}
