package monicaquintal_agenda05_ds_i;

import javax.swing.JOptionPane;

public class Monicaquintal_agenda05_DS_I {

public static void main(String[] args) {
//declaração de variáveis
String auxiliar; //variável auxiliar
int idade;// declarar idade

//entrada de dados salvando na variável auxiliar (string)
auxiliar = JOptionPane.showInputDialog("Insira sua idade:");

//conversão do tipo string para inteiro
idade = Integer.parseInt(auxiliar);

//processamento
 if (idade >=60){ //primeiro if
        //comandos se a condição for verdadeira
        if (idade >80){ //segundo if
        JOptionPane.showMessageDialog(null,"Dirija-se à fila 80+.");
        }
        else {
        JOptionPane.showMessageDialog(null,"Dirija-se à fila prioritária.");
        } //fim do segundo if
        }
        else {
        //comandos se a condição for falsa
        JOptionPane.showMessageDialog(null,"Dirija-se à fila comum.");
        } //fim do primeiro if

    } //fim do main
    
} //fim da classe
