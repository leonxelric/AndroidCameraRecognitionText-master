package dev.edmt.androidcamerarecognitiontext;

public class FakePlace {
    private String place;
    private String name;
    private String num;
    private String price;
    private String rate;
    private String address;

    public FakePlace(String s)
    {
        place = s;
    }

    public void setInfo() {
        if(place.equals("LEGAL SEA FOODS"))
        {
            name = "Legal Sea Foods";
            num = "617-864-3400";
            price = "$$";
            rate = "4.0 stars";
            address = "355 Main Street, Cambridge MA";
        }
        else if(place.equals("McDonald's") || (place.equals("MCDonalds")) || (place.equals("McDonalds")) || (place.equals("MCDonald's")))
        {
            name = "McDonalds";
            num = "617-497-3926";
            price = "$";
            rate = "3.5 stars";
            address = "463 Massacusets Avenue, Cambridge MA";
        }
    }

    public String getName()
    {
        return name;
    }

    public String getNum()
    {
        return num;
    }

    public String getRate()
    {
        return rate;
    }

    public String getAddress()
    {
        return address;
    }

    public String getPrice()
    {
        return price;
    }
}
