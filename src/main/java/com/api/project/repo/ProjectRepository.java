package com.api.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.project.bean.Project;

public interface ProjectRepository  extends JpaRepository<Project, Integer>{

}
