package pl.coderslab.tdd.creation.tdd.repository;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    public void shouldAddNewUser() {
        //given
        User user = new User(1, "Marek");

        //when
        UserRepository userRepository = new UserRepository();
        userRepository.add(user);

        //then
        assertEquals(Map.of(1, user), userRepository.getUsers());
    }

    @Test
    public void shouldUpdateUser() {
        //given
        //dane początkowe
        UserRepository userRepository = new UserRepository();
        userRepository.add(new User(1, "Marek Stary"));

        //when
        userRepository.update(new User(1, "Marek Nowy"));

        //then
        User actual = userRepository.getUsers().get(1);
        assertEquals("Marek Nowy", actual.getName());
        assertEquals(1, actual.getId());
    }

    @Test
    public void shouldRemoveUser() throws UserNotExistsException {
        //given
        //dane początkowe
        UserRepository userRepository = new UserRepository();
        userRepository.add(new User(1, "Marek 1"));
        userRepository.add(new User(2, "Marek 2"));
        userRepository.add(new User(3, "Marek 3"));

        //when
        userRepository.remove(1);


        //then
        Map<Integer, User> actual = userRepository.getUsers();
        assertEquals("Marek 2", actual.get(2).getName());
    }

    @Test
    public void shouldThrowExceptionWhenUserNotExists() {
        //given
        //initial data
        UserRepository userRepository = new UserRepository();
        userRepository.add(new User(1, "Marek 1"));
        userRepository.add(new User(2, "Marek 2"));
        userRepository.add(new User(3, "Marek 3"));

        //when
        assertThrows(UserNotExistsException.class, () -> userRepository.remove(4));
    }

}