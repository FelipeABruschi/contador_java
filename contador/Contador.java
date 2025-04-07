public class Contador {
    int valor_atual = 0;

    int new_value(int valor) {
        valor_atual = valor;
    }

    int incrementar_contador() {
        return valor_atual++;
    }

    int get_value() {
        return valor_atual;
    }
}