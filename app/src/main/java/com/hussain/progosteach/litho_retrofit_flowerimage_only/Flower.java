package com.hussain.progosteach.litho_retrofit_flowerimage_only;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

import org.json.JSONObject;

/**
 * Created by Hussain Sherwani on 17-May-17
 * hussain.ahmed@progos.org .
 */

public class Flower {

    private String category;

    private String price;

    private String instructions;

    private String photo;

    private String name;
    private  String productId;
    public  Flower(){}

    public Flower(String category, String price, String instructions, String photo, String name, String productId) {
        this.category = category;
        this.price = price;
        this.instructions = instructions;
        this.photo = photo;
        this.name = name;
        this.productId = productId;
    }

    /*  public Flower(JsonObject json){
            this.category = json.get("category").getAsString();
            this.price = json.get("price").getAsString();
            this.instructions = json.get("instructions").getAsString();
            this.photo = json.get("photo").getAsString();
            this.name = json.get("name").getAsString();
            this.productId = json.get("productId").getAsString();
        }
    */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
