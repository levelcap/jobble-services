package com.jobble.services.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Jobs
{
    @Id
    private String id;

    private String title;
    private String description;
    private Users poster;
    private List<Users> applicants;
    private List<Users> hired;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Users getPoster()
    {
        return poster;
    }

    public void setPoster(Users poster)
    {
        this.poster = poster;
    }

    public List<Users> getApplicants()
    {
        return applicants;
    }

    public void setApplicants(List<Users> applicants)
    {
        this.applicants = applicants;
    }

    public List<Users> getHired()
    {
        return hired;
    }

    public void setHired(List<Users> hired)
    {
        this.hired = hired;
    }
}
