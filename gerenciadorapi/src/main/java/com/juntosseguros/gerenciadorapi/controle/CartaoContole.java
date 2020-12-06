package com.juntosseguros.gerenciadorapi.controle;

import com.juntosseguros.gerenciadorapi.dto.MessageResponseDTO;
import com.juntosseguros.gerenciadorapi.entidade.Cartao;
import com.juntosseguros.gerenciadorapi.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("api/v1/usuario")
public class CartaoContole {

    private CartaoService cartaoService;

    @Autowired
    public CartaoContole(CartaoService cartaoService) {
        this.cartaoService = cartaoService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO criaCartao(@RequestBody Cartao cartao){
        return cartaoService.criarCartao();
    }
}
