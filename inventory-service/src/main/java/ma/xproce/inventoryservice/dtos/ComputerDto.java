package ma.xproce.inventoryservice.dtos;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ComputerDto {
    public String proc;
    public String ram;
    public double price;
    public String hardDrive;
}
