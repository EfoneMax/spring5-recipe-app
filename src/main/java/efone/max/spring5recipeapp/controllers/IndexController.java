package efone.max.spring5recipeapp.controllers;

import efone.max.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"} )
    public String getIndexPage(Model model) {
        log.debug("index page triggered");
        model.addAttribute("recipes", recipeService.getAllRecipes());
        return "index";
    }
}
