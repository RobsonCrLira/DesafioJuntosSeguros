package com.juntosseguros.gerenciadorapi.controle;

import com.juntosseguros.gerenciadorapi.dto.MessageResponseDTO;
import com.juntosseguros.gerenciadorapi.entidade.Cartao;
import com.juntosseguros.gerenciadorapi.repositorio.CartaoRepositorio;
import com.juntosseguros.gerenciadorapi.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/usuario")
public class CartaoContole {

    private CartaoService cartaoService;

    @Autowired
    public CartaoContole(CartaoRepositorio cartaoRepositorio) {
        this.cartaoRepositorio = cartaoRepositorio;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO criaCartao(@RequestBody Cartao cartao){
        return cartaoService.criarCartao();
    }
}
