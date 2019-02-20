package com.codeclan.fileManagementSystem.FileManagementSystem.repositories;

import com.codeclan.fileManagementSystem.FileManagementSystem.models.User;
import com.codeclan.fileManagementSystem.FileManagementSystem.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
