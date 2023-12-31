package ezra.restfulpsql.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import ezra.restfulpsql.dto.MerchantDTO;
import ezra.restfulpsql.model.Merchant;

import java.util.List;

public interface MerchantService {

    Merchant create(Merchant merchant);

    Merchant update(Long id, Merchant merchant);

    Boolean delete(Long id);

    List<Merchant> findAll();

    Merchant findById(Long id);

    MerchantDTO mapToDto(Merchant merchant);
    Merchant mapToEntity(MerchantDTO merchantDTO);

};
