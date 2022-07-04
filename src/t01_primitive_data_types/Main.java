package t01_primitive_data_types;

public class Main {
    
    // Tipos de dados primitivos ficam armazenas na memória STACK, junto com as refências de objetos (ponteiros)
    
    // Tipos de dados numéricos inteiros
    byte var_byte = 127;                        // Possui 1 byte - range (-128 a 127)
    short var_short = -32768;                   // Possui 2 bytes - range (-32768 a 32767)
    int var_int = 2147483647;                   // Possui 4 bytes - range (-2147483648 a 2147483647)
    long var_long = -9223372036854775808L;      // Possui 8 bytes - range (-9223372036854775808 a 9223372036854775807)

    // Tipos numéricos flutuantes
    float var_float = 3.145F;                   // Possui 4 bytes - range (1.4023 x 10^-45 a 3.4028 x 10^38)
    double var_double = .00000456;              // Possui 8 bytes - range (4.9406 x 10^-324 a 1.7977 x 10^308)

    // Outros tipos de dados
    char var_char = '\u0041';                   // Possui 2 bytes - possibilidades \u0041 = 65 = A
    boolean var_bool = true;                    // Possui 1 bit - possibilidades false ou true
    
    
    // Valores literais são os valores colocados diretamente no código, ex int i = 12, char c = 'A', boolean b = true
    // Literais numéricos: inteiros int e flutuantes double
    // Literal long possui um L no final, literal float possui um F no final
}
