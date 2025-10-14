package com.marvellousinfosystem.frist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    @GetMapping("LaptopDetails")
    public String DisplayLaptopDetails()
    {
        return "Its core i7 2nd Gen laptop";
    }

}
