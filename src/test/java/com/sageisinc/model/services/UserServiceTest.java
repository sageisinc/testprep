package com.sageisinc.model.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.sageisinc.model.common.exceptions.DuplicateInstanceException;
import com.sageisinc.model.common.exceptions.InstanceNotFoundException;
import com.sageisinc.model.entities.AppUser;

/**
 * The Class UserServiceTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class UserServiceTest {

	/** The user service. */
	@Autowired
	private UserService userService;

	/**
	 * Creates the user.
	 *
	 * @param userName the user name
	 * @return the user
	 */
	private AppUser createUser(String userName) {
		return new AppUser(userName, "password", "firstName", "lastName", userName + "@" + userName + ".com");
	}

	/**
	 * Test sign up and login from id.
	 *
	 * @throws DuplicateInstanceException the duplicate instance exception
	 * @throws InstanceNotFoundException  the instance not found exception
	 */
	@Test
	public void testSignUpAndLoginFromId() throws DuplicateInstanceException, InstanceNotFoundException {

		AppUser user = createUser("user");

		userService.signUp(user);

		AppUser loggedInUser = userService.loginFromId(user.getId());

		assertEquals(user, loggedInUser);
		assertEquals(AppUser.RoleType.USER, user.getRole());

	}
}
