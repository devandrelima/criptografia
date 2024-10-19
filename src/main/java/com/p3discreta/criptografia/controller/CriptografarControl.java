package com.p3discreta.criptografia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p3discreta.criptografia.model.MaquinaCriptografar;
import com.p3discreta.criptografia.repository.mensagem;

@RequestMapping
public class CriptografarControl {
   @GetMapping("/criptografar")
   public mensagem criptografar(@RequestBody mensagem mensage){
      MaquinaCriptografar maquinaCriptografar = new MaquinaCriptografar();
      String mensagemCriptografada = "";
      
      if(mensage.id() == 1){
         mensagemCriptografada = maquinaCriptografar.criptografarEmPrimeiroGrau(mensage.texto(), mensage.a(), mensage.b());
      } else if(mensage.id() == 2){
         mensagemCriptografada = maquinaCriptografar.criptografarEmSegundoGrau(mensage.texto(), mensage.a(), mensage.b(), mensage.c());
      } else {
         // Do frontend, a = b = c = 1
         //mensagemCriptografada = maquinaCriptografar.criptografarTerceiroGrau(mensage.texto(), mensage.a(), mensage.b(), mensage.c());
      }

      return new mensagem(mensagemCriptografada, mensage.id(), mensage.a(), mensage.b(), mensage.c());
   }
}
