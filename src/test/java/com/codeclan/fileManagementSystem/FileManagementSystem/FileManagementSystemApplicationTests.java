package com.codeclan.fileManagementSystem.FileManagementSystem;

import com.codeclan.fileManagementSystem.FileManagementSystem.models.File;
import com.codeclan.fileManagementSystem.FileManagementSystem.models.Folder;
import com.codeclan.fileManagementSystem.FileManagementSystem.models.User;
import com.codeclan.fileManagementSystem.FileManagementSystem.repositories.FileRepository;
import com.codeclan.fileManagementSystem.FileManagementSystem.repositories.FolderRepository;
import com.codeclan.fileManagementSystem.FileManagementSystem.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileManagementSystemApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateUserAndFolderThenSave() {

		User lesley = new User ("Lesley Knope");
		userRepository.save(lesley);

		Folder workStuff = new Folder ("stuff", lesley);
		folderRepository.save(workStuff);
	}

	@Test
	public void canCreateUserFolderAndFileThenSave() {

		User lesley = new User ("Lesley Knope");
		userRepository.save(lesley);

		Folder workStuff = new Folder ("stuff", lesley);
		folderRepository.save(workStuff);

		File salaries = new File ("salaries", "300MB", "xls", workStuff);
		fileRepository.save(salaries);

	}
}
