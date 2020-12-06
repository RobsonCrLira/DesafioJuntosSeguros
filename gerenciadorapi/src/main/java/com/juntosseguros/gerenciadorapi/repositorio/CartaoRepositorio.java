package com.juntosseguros.gerenciadorapi.repositorio;

import com.juntosseguros.gerenciadorapi.entidade.Cartao;
import com.juntosseguros.gerenciadorapi.entidade.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepositorio extends JpaRepository<Cartao, Long> {

}
