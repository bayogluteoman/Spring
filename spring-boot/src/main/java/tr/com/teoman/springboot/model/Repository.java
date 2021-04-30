package tr.com.teoman.springboot.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Date;

public class Repository {
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    @JsonAlias("full_name")
    private String fullName;

    private String description;

    @JsonAlias("created_at")
    private Date created_at;

    public Repository(){}



}
