package ma.enset.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.billingservice.model.Product;

import java.util.Collection;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductItem {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private double quantity;
   private double price;
   private long productId;
   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
   @ManyToOne
   private Bill bill;
   @Transient
   private Product product;
   @Transient
   private String productName;
}
