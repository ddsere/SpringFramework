package lk.ijse.posbackend.repository;

import lk.ijse.posbackend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
