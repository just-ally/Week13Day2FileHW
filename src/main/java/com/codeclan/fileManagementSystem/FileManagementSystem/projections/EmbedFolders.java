package com.codeclan.fileManagementSystem.FileManagementSystem.projections;

import com.codeclan.fileManagementSystem.FileManagementSystem.models.Folder;
import com.codeclan.fileManagementSystem.FileManagementSystem.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolders", types = User.class)
public interface EmbedFolders {

    String getName();
    List<Folder> getFolders();
}
