package camt.se234.project.service;

import camt.se234.project.dao.UserDao;
import camt.se234.project.entity.User;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthenticationServiceImplTest {
    AuthenticationServiceImpl authenticationService;
    UserDao userDao;
    @Before
    public void setup(){
        userDao = mock(UserDao.class);
        authenticationService = new AuthenticationServiceImpl();
        authenticationService.setUserDao(userDao);
    }
    @Test
    public void testAuthenticate(){
        when(userDao.getUser("admin","admin")).thenReturn(new User(000001L,"admin","admin","admin"));
        assertThat(authenticationService.authenticate("admin","admin"),is(new User(000001L,"admin","admin","admin")));

        when(userDao.getUser("123","456")).thenReturn(new User(000002L,"123","456","user"));
        assertThat(authenticationService.authenticate("123","456"),is(new User(000002L,"123","456","user")));
    }
}