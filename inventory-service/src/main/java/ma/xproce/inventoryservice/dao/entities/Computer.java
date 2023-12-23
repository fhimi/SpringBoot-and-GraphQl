package ma.xproce.inventoryservice.dao.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id_pc;
    public String proc;
    public String ram;
    public String hardDrive;
    public float price;
    public String macAdress;

}
