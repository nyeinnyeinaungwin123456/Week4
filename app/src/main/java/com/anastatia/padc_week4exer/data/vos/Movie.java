package com.anastatia.padc_week4exer.data.vos;

/**
 * Created by Nyein Nyein on 6/30/2016.
 */
public class Movie {

    String name, township, time;
    Integer image1, image2;

    public Movie() {

    }

    public Movie(String name, String township, String time, Integer image1, Integer image2)
    {
        this.name = name;
        this.township = township;
        this.time = time;
        this.image1 = image1;
        this.image2 = image2;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getTownship()
    {
        return township;
    }

    public void setTownship(String township)
    {
        this.township = township;
    }

    public String getTime()
    {
        return time;
    }

    public void setTime(String time)
    {
        this.time = time;
    }

    public Integer getImage1()
    {
        return image1;
    }

    public void setImage1(Integer image1)
    {
        this.image1 = image1;
    }

    public Integer getImage2()
    {
        return image2;
    }

    public void setImage2(Integer image2)
    {
        this.image2 = image2;
    }

}
