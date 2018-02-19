package com.example.demo.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.GetImgService;

@Controller
public class SampleController {
    @RequestMapping("/")
    public String index(Model model) throws IOException {
        model.addAttribute("name", "hoge");

        GetImgService getImg = new GetImgService();
        List<String> pictures = new ArrayList<>();
        pictures = getImg.pickup(true);
        model.addAttribute("photoList", pictures);
        return "sample/index";
    }

}
