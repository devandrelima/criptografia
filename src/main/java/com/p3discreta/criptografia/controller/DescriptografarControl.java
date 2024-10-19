package com.p3discreta.criptografia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p3discreta.criptografia.model.MaquinaDescriptografar;
import com.p3discreta.criptografia.repository.mensagem;

@RequestMapping
public class DescriptografarControl {
   @GetMapping("/descriptografar")
   public mensagem descriptografar(@RequestBody mensagem mensage){
      MaquinaDescriptografar maquinaDescriptografar = new MaquinaDescriptografar();
      String mensagemDescriptografada = "";
      
      if(mensage.id() == 1){
         mensagemDescriptografada = maquinaDescriptografar.descriptografarEmPrimeiroGrau(mensage.texto(), mensage.a(), mensage.b());
      } else if(mensage.id() == 2){
         mensagemDescriptografada = maquinaDescriptografar.descriptografarEmSegundoGrau(mensage.texto(), mensage.a(), mensage.b(), mensage.c());
      } else {
         // Do frontend, a = b = c = 1
         //mensagemDescriptografada = maquinaDescriptografar.descriptografarTerceiroGrau(mensage.texto(), mensage.a(), mensage.b(), mensage.c());
      }

      return new mensagem(mensagemDescriptografada, mensage.id(), mensage.a(), mensage.b(), mensage.c());
   }
}
