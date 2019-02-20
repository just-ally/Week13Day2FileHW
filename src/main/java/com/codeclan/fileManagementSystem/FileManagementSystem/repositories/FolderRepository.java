package com.codeclan.fileManagementSystem.FileManagementSystem.repositories;

import com.codeclan.fileManagementSystem.FileManagementSystem.models.Folder;
import com.codeclan.fileManagementSystem.FileManagementSystem.projections.EmbedFilesAndUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFilesAndUser.class)
public interface FolderRepository extends JpaRepository <Folder, Long> {
}
