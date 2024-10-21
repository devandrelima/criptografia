package com.p3discreta.criptografia.repository;

// Utilizado como molde para enviar json e receber do front
public record mensagem(String texto, int id, int a, int b, int c, Integer[] textoEmNumero) {}
