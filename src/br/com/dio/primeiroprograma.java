package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {


    public static void main(String[] args) {
        Gato gato = new Gato("Preto", "Frederico", 2);
        System.out.println(gato);

        Livro livro = new Livro("Codigo Limpo", 300);
        System.out.println(livro);
        /*int a = 5;
        int b = 10;

        System.out.println("Hello world!!!\n" + (a + b));*/


    }
}

    class Livro {
        private String nome;
        private Integer numeroPaginas;

        public Livro(String nome, Integer numeroPaginas) {
            this.nome = nome;
            this.numeroPaginas = numeroPaginas;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumeroPaginas() {
            return numeroPaginas;
        }

        public void setNumeroPaginas(Integer numeroPaginas) {
            this.numeroPaginas = numeroPaginas;

        }

        @Override
        public String toString() {
            return "livro{" +
                    "nome='" + nome + '\'' +
                    ", numeroPaginas=" + numeroPaginas +
                    '}';
        }
    }

