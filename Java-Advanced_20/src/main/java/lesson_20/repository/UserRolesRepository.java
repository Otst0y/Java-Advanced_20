package lesson_20.repository;

import lesson_20.domain.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, Long> {

    @Query("SELECT a.role from UserRole a, User b WHERE b.userName=?1 and a.userId=b.userId")
    public List<String> findRoleByUserName(String username);
}
