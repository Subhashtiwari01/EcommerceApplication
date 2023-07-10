package com.project.EcommerceApi.Repository;

import com.project.EcommerceApi.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Long> {

}
