package com.codeclan.fileManagementSystem.FileManagementSystem.components;

import com.codeclan.fileManagementSystem.FileManagementSystem.models.File;
import com.codeclan.fileManagementSystem.FileManagementSystem.models.Folder;
import com.codeclan.fileManagementSystem.FileManagementSystem.models.User;
import com.codeclan.fileManagementSystem.FileManagementSystem.repositories.FileRepository;
import com.codeclan.fileManagementSystem.FileManagementSystem.repositories.FolderRepository;
import com.codeclan.fileManagementSystem.FileManagementSystem.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User lesley = new User ("Lesley Knope");
        userRepository.save(lesley);

        User ron = new User("Ron Swanson");
        userRepository.save(ron);

        Folder events = new Folder("events", lesley);
        folderRepository.save(events);

        Folder salaries = new Folder ("salaries", ron);
        folderRepository.save(salaries);

        File dayTrip = new File("day trip", "ppt", "300KB", events);
        fileRepository.save(dayTrip);

        File bonuses = new File("bonuses", "xls", "250KB", salaries);
        fileRepository.save(bonuses);

    }
}
