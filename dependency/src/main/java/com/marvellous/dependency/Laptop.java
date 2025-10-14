package com.marvellous.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    //Field Injection characters
    @Autowired
    Hardisk hobj;

    @Autowired
    RAM robj;

    @GetMapping("Laptop")
    public String LaptopInformation()
    {
        String h = hobj.GetHardisk();
        String r = robj.GetRAM();

        String data = "Laptop configuration : "+h+" & "+r;

        return data;
    }

}
