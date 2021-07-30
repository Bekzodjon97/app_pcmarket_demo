package uz.pdp.app_pcmarket_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.app_pcmarket_demo.entity.Attachment;

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
