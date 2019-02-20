package com.codeclan.fileManagementSystem.FileManagementSystem.repositories;

import com.codeclan.fileManagementSystem.FileManagementSystem.models.File;
import com.codeclan.fileManagementSystem.FileManagementSystem.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
