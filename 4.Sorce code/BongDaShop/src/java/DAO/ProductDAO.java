/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Product;
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
public class ProductDAO {
    // get danh sách sản phẩm dựa vào mã danh mục
    public ArrayList<Product> getListProductBycategory(long category_id) throws SQLException{
        Connection connection = DBConnect.getConnection();
        String sql = "SELECT * FROM product WHERE category_id = '"+ category_id +"'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Product> list = new ArrayList<>();
        while(rs.next()){
            Product product = new Product();
            product.setProductID(rs.getLong("product_id"));
            product.setProductName(rs.getString("product_name"));
            product.setProductImage(rs.getString("product_image"));
            product.setProductPrice(rs.getDouble("product_price"));
            product.setProductQuantity(rs.getInt("product_quantity"));
            product.setProductDescription(rs.getString("product_description"));
            list.add(product);
            
        }
        return list;
    }
    public static void main(String[] args) throws SQLException {
        ProductDAO dao = new ProductDAO();
        for(Product p : dao.getListProductBycategory(1)){
            System.out.println(p.getProductID() + " - " + p.getProductName());
        }
    }
            

}
