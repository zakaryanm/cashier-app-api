package com.demo.cashierapp.model.apiService.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateProductRequestModel extends BaseProduct{
    @JsonProperty("name")
    private String supplierName;
}
