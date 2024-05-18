package br.com.rr.catalogofilmes.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
