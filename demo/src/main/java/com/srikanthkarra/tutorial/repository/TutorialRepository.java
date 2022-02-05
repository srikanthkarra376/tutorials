package com.srikanthkarra.tutorial.repository;

import com.srikanthkarra.tutorial.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TutorialRepository extends JpaRepository<Tutorial,Long> {

    Page<Tutorial> findByPublished(boolean published, Pageable pageable);
    Page<Tutorial> findByTitleContaining(String title, Pageable pageable);


}
