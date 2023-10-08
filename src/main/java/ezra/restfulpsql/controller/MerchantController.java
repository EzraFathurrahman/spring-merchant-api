package ezra.restfulpsql.controller;


import ezra.restfulpsql.dto.MerchantDTO;
import ezra.restfulpsql.model.Merchant;
import ezra.restfulpsql.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/merchant")
public class MerchantController {

    @Autowired
    MerchantService merchantService;

    @GetMapping("")
    public List<MerchantDTO> findAll(){
        return merchantService.findAll().stream().map(merchant -> merchantService.mapToDto(merchant))
                .collect(Collectors.toList());

    }
    @PostMapping("/create")
    public MerchantDTO create( @RequestBody MerchantDTO request){
        final Merchant merchant =merchantService.mapToEntity(request);
        final Merchant result = merchantService.create(merchant);
        return merchantService.mapToDto(result);

    }

    @PutMapping("/{id}")
    public MerchantDTO update(@PathVariable Long id, @RequestBody MerchantDTO request ){
        final Merchant merchantData=merchantService.mapToEntity(request);
        final Merchant result=  merchantService.update(id,merchantData);
        return merchantService.mapToDto(result);

    }

    @DeleteMapping("/delete/{id}")
    public Boolean delete(@PathVariable Long id){
        return merchantService.delete(id);
    }


}
