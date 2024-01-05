package com.changesite.nexpin_final_project.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Service
public class Services {
    //(id , organization_name, service_name, merchant_code   )
    // (1, Azerishiq ,  elektrik odenishi, 100023  )
    // (2, Baktelecom, İnternet,  1045778977)
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String organization_name;
    String service_name;
    Long merchant_code;
    @OneToMany(mappedBy = "services")
    List<Transaction_Details> transaction_detailsList;

}
