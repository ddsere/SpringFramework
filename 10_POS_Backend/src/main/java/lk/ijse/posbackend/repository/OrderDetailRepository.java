package lk.ijse.posbackend.repository;

import org.example.posbackend.entity.OrderDetail;
import org.example.posbackend.entity.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailPK> {
}
