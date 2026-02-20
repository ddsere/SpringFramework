package lk.ijse.posbackend.repository;

import lk.ijse.posbackend.entity.OrderDetail;
import lk.ijse.posbackend.entity.OrderDetailPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailPK> {
}
