package tr.com.teoman.springboot.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tr.com.teoman.springboot.model.Repository;

@Service
public class GitHubService {

    private String url= "https://api.github.com/users/";
    private RestTemplate template= new RestTemplate();

    public Repository[] getUsersRepos(String userName){
        ResponseEntity<Repository[]> response = template.getForEntity(url+userName+"/repos", Repository[].class);
        return response.getBody();
    }
}
