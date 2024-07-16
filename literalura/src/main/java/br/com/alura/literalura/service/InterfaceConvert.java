package br.com.alura.literalura.service;

public interface InterfaceConvert {
    <T> T obterDados(String json, Class<T> classe);
}