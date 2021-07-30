package uz.pdp.app_pcmarket_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.app_pcmarket_demo.entity.template.AbsEntity;

import javax.persistence.*;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product extends AbsEntity {

    @Column(nullable = false)
    private double price;

    @OneToOne
    private Attachment photo;

    @ManyToOne(optional = false)
    private Category category;

    @ManyToMany
    private List<CharacteristicsValues> characteristics;

    private String description;

}
