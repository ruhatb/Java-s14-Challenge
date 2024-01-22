package com.hamburger;

import java.util.Arrays;

public class Hamburger {
    private String name;
    private String meat;

    private int price;

    private BreadRolType breadRolType;

    private Addition[] ekleme;

    public Hamburger(String name, String meat, BreadRolType breadRolType) {
        this.name = name;
        this.meat = meat;
        this.breadRolType = breadRolType;
        this.ekleme= new Addition[5];
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public BreadRolType getBreadRolType() {
        return breadRolType;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRolType=" + breadRolType +
                ", ekleme=" + Arrays.toString(ekleme) +
                '}';
    }

    public Addition[] getEkleme() {
        return ekleme;
    }

    public void add(String name,int price){
        for (int i = 0; i< ekleme.length; i++){
            if(ekleme[i] == null){
                ekleme[i] = new Addition(name,price);
            break;
            }
        }
    }

 public void itemizeHamburger(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name :" + name + "\n");
        builder.append("Meat :" + meat + "\n");
        builder.append("BreadRolType :" + breadRolType +"\n");


        for(Addition addition: ekleme ){
            if(addition != null){
                builder.append("Addition:" + addition.getName() + "\n");
                price = price + addition.getPrice();
            }
        }

     System.out.println(builder);
     System.out.println("total price:"+ price);
 }



}
