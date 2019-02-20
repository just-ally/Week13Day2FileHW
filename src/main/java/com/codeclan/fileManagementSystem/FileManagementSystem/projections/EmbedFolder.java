package com.codeclan.fileManagementSystem.FileManagementSystem.projections;

import com.codeclan.fileManagementSystem.FileManagementSystem.models.File;
import com.codeclan.fileManagementSystem.FileManagementSystem.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {

    String getName();
    String getExtension();
    String getSize();
    Folder getFolder();

}
