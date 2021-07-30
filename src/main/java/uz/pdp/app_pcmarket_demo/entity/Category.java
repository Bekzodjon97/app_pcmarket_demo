package uz.pdp.app_pcmarket_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.app_pcmarket_demo.entity.template.AbsEntity;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Category extends AbsEntity {
    @ManyToOne
    private Category parentCategory;

}
