package com.api.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.project.bean.Project;
import com.api.project.repo.ProjectRepository;

@RestController
public class ProjectController {
	@Autowired
	private ProjectRepository projectRepository;
	
	@RequestMapping(value = "/project", method = RequestMethod.GET)
	public List<Project> loggerGet() {
		List<Project> list = projectRepository.findAll();
		return list;
	}
	
	@RequestMapping(value = "/project", method = RequestMethod.POST)
    public List<Project> loggerPost(
            @RequestBody List<Project> loggerList) {

        List<Project> result = projectRepository.saveAll(loggerList);
        return result;
    }
	
	@RequestMapping(value = "/project", method = RequestMethod.PUT)
    public Project loggerPut(@RequestBody Project project){
        Optional<Project> target = projectRepository.findById(project.getId());
        System.out.println("ok");
        if(target.isEmpty()) {
            return null;
        } else {
        	projectRepository.save(project);
            return target.get();
        }
    }
	
	@RequestMapping(value = "/project", method = RequestMethod.DELETE)
    public Project loggerDelete(@RequestBody Project project) {
        Optional<Project> target = projectRepository.findById(project.getId());
        if(target.isEmpty()) {
            return null;
        } else {
        	projectRepository.deleteById(target.get().getId());
            return target.get();
        }
    }
}
