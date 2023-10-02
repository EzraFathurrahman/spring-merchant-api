package ezra.restfulpsql.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MerchantDTO(Long id, String name, List<StoreDTO> storeDTOS) {

}
