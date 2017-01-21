package ru.inno.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ru.inno.students.User;

/**
 * Created by mikhail on 21/01/17.
 */
@Component
public interface UserRepository extends CrudRepository<User, Integer> {
}
