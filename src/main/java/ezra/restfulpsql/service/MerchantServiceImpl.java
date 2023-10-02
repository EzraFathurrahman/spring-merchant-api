package ezra.restfulpsql.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import ezra.restfulpsql.dto.MerchantDTO;
import ezra.restfulpsql.model.Merchant;
import ezra.restfulpsql.repository.MerchantRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MerchantServiceImpl implements MerchantService{

    @Autowired
    MerchantRepository merchantRepository;

//    GET
    @Override
    public List<Merchant> findAll() {
        return merchantRepository.findAll();
    }

    @Override
    public Merchant findById(Long id) {
       final Optional<Merchant> request= merchantRepository.findById(id);
        return request.orElse(null);

    }

//    Create
    @Override
    public Merchant create(Merchant merchant) {
        return merchantRepository.save(merchant);
    }

    @Override
    public Merchant update(Long id, Merchant merchant) {
        Merchant result=findById(id);
        if(result!=null){
            result.setName(merchant.getName());
            merchantRepository.save(merchant);
        }
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        Merchant result= findById(id);
        if (result!=null){
            merchantRepository.deleteById(id);
            return true;
        }
        return false;


    }

    ObjectMapper mapper=new ObjectMapper();
    @Override
    public MerchantDTO mapToDto(Merchant merchant) {
        return mapper.convertValue(merchant, MerchantDTO.class);
    }

    @Override
    public Merchant mapToEntity(MerchantDTO merchantDTO) {
        return mapper.convertValue(merchantDTO,Merchant.class);
    }


}
