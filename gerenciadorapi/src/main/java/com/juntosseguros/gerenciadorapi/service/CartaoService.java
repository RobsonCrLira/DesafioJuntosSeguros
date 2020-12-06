package com.juntosseguros.gerenciadorapi.service;

import com.juntosseguros.gerenciadorapi.dto.MessageResponseDTO;
import com.juntosseguros.gerenciadorapi.entidade.Cartao;
import com.juntosseguros.gerenciadorapi.repositorio.CartaoRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CartaoService {

    private CartaoRepositorio cartaoRepositorio;

    public CartaoService(CartaoRepositorio cartaoRepositorio){
        this.cartaoRepositorio = cartaoRepositorio;
    }

    public MessageResponseDTO criarCartao(Cartao cartao){
        Cartao salvedCartao = cartaoRepositorio.save(cartao);
        return MessageResponseDTO
                .builer()
                .message("Cartão Criado com o ID "+ salvedCartao.getId())
                .build();
    }

}
