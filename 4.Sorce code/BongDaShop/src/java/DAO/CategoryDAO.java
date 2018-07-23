/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Category;
import com.sun.xml.ws.tx.at.v10.types.PrepareResponse;
import connect.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CategoryDAO {
    // get danh sach danh muc
    public  ArrayList<Category> getListCategorys() throws SQLException{
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM category";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Category> list = new ArrayList<>();
        while(rs.next()){
            Category category = new Category();
            category.setCategoryID( rs.getLong("category_id"));
            category.setCategoryName(rs.getString("category_name"));
            list.add(category);
        }
        return list;
    }
    public static void main(String[] args) throws SQLException {
        CategoryDAO  dao = new CategoryDAO();
        for(Category ds : dao.getListCategorys()){
            System.out.println(ds.getCategoryID() + " - " + ds.getCategoryName());
        }
    }
}
