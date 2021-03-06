package Code;

import javax.swing.*;

class Easyer {
    public static double CalcPercentage(double value, double percentage){
        double realPercentage;
        realPercentage = value*percentage/100;
        return realPercentage;
    }
    public static double PercentageIncreaseWithRate(double vInitial, double vFinal, double rate){
        double realPercentage,aux;
        realPercentage = (vFinal-vInitial)/vInitial*100;
        aux = CalcPercentage(realPercentage,rate);
        aux = realPercentage - aux;
        return aux;
    }
    public static double PercentageIncreaseNoRate(double vInitial, double vFinal){
        double realPercentage;
        realPercentage = (vFinal-vInitial)/vInitial*100;
        return realPercentage;
    }
    public static double HowManyPercentMore(double value, double percentage){
        double realPercentage;
        realPercentage = percentage/100;
        realPercentage = realPercentage +1;
        realPercentage = value * realPercentage;
        return realPercentage;
    }
    public static void PercentDiscount(double value, double percentage){
        double realPercentage, SalesValue;
        realPercentage = (value * percentage)/100;
        SalesValue = value - realPercentage;
        JOptionPane.showMessageDialog(null,"O valor de venda é: "+SalesValue+"\nDesconto de "+realPercentage,"U_U",JOptionPane.INFORMATION_MESSAGE);
    }


    public static void main(String[]args){
        double valueInitial,valueFinal,percentage,rate;
        char op=1;
        String msgEnter= "Escolha a opção desejada:\n\n1- Aumento porcentual incluindo taxa \n2- Aumento porcentual sem taxa\n3- Porcentagem\n4- Porcentagem a mais\n5- Desconto porcentual";
        op = (JOptionPane.showInputDialog(msgEnter)).charAt(0);
        
        switch(op){
            case '1':{
                valueInitial = Double.parseDouble(JOptionPane.showInputDialog("Valor Inicial: "));
                valueFinal = Double.parseDouble(JOptionPane.showInputDialog("Valor Final: "));
                rate = Double.parseDouble(JOptionPane.showInputDialog("Taxa: "));
                if(PercentageIncreaseWithRate(valueInitial,valueFinal,rate) < valueFinal){
                    JOptionPane.showMessageDialog(null,"NÃO HOUVE LUCRO"+"\n\nA perda é de: "+PercentageIncreaseWithRate(valueInitial,valueFinal,rate)+"%","CUIDADO! O_O", JOptionPane.WARNING_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"HOUVE LUCRO"+"\n\nO ganho é de: "+PercentageIncreaseWithRate(valueInitial,valueFinal,rate)+"%","SUCESSO! ^^", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            }
            case '2':{
                valueInitial = Double.parseDouble(JOptionPane.showInputDialog("Valor Inicial: "));
                valueFinal = Double.parseDouble(JOptionPane.showInputDialog("Valor Final: "));
                if(PercentageIncreaseNoRate(valueInitial,valueFinal) < valueFinal){
                    JOptionPane.showMessageDialog(null,"NÃO HOUVE LUCRO"+"\n\nA perda é de: "+PercentageIncreaseNoRate(valueInitial,valueFinal)+"%","CUIDADO! O_O", JOptionPane.WARNING_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"HOUVE LUCRO"+"\n\nO ganho é de: "+PercentageIncreaseNoRate(valueInitial,valueFinal)+"%","SUCESSO! ^^", JOptionPane.INFORMATION_MESSAGE);
                }
                break;    
            }
            case '3':{
                valueInitial = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                percentage = Double.parseDouble(JOptionPane.showInputDialog("Porcentagem: "));
                JOptionPane.showMessageDialog(null,"O valor é: "+CalcPercentage(valueInitial,percentage)+"%");
                break;
            }
            case '4':{
                valueInitial = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                percentage = Double.parseDouble(JOptionPane.showInputDialog("Porcentagem: "));
                
                JOptionPane.showMessageDialog(null,"O valor é: "+HowManyPercentMore(valueInitial,percentage),"U_U",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            case '5':{
                valueInitial = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
                percentage = Double.parseDouble(JOptionPane.showInputDialog("Desconto em porcentagem: "));
                PercentDiscount(valueInitial,percentage);
                
                break;
            }

            default: JOptionPane.showMessageDialog(null,"Opção invalida, calculos não foram realizados!","U.U", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}

