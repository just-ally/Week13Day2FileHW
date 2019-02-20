package com.codeclan.fileManagementSystem.FileManagementSystem.projections;

import com.codeclan.fileManagementSystem.FileManagementSystem.models.File;
import com.codeclan.fileManagementSystem.FileManagementSystem.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFilesAndUser", types = Folder.class)
public interface EmbedFilesAndUser {

    String getTitle();
    String getUserName();
    List<File> getFiles();

}
