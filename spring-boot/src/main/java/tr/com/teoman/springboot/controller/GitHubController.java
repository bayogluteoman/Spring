package tr.com.teoman.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.teoman.springboot.service.GitHubService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class GitHubController {
    private GitHubService service;

    @Autowired
    GitHubController(GitHubService service){
        this.service= service;
    }


    @GetMapping("/repos/{username}")
    public Object getRepos(@PathVariable String username){
        return service.getUsersRepos(username);
    }
}
