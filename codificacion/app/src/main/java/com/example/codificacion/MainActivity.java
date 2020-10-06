package com.example.codificacion;

import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;
import java.util.Map;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText caja_introducir_texto;
    EditText caja_mostrar_texto;
    String texto_introducido;
    String Txt_mostrar="";
    Map<String,String> diccionario_codificar= new HashMap<>();
    Map<String,String> diccionario_traducir= new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        caja_introducir_texto=findViewById(R.id.texto_introducido);
        caja_mostrar_texto=findViewById(R.id.texto_mostrar);
    }

    public void Limpiar(View view){
        Toast.makeText(this, "El texto se ha limpiado", Toast.LENGTH_SHORT).show();
        caja_introducir_texto.setText(null);
        caja_mostrar_texto.setText(null);
    }
    public void Codificar(View view){
        Txt_mostrar="";
        texto_introducido=caja_introducir_texto.getText().toString();
        Toast.makeText(this, "El texto se esta codificando", Toast.LENGTH_SHORT).show();
        codificar();
        for(int i=0;i<texto_introducido.length();i++){
            Txt_mostrar+=diccionario_codificar.get(texto_introducido.substring(i,i+1).toLowerCase());
        }
        caja_mostrar_texto.setText(Txt_mostrar);
    }
    public void Traducir(View view) {
        Txt_mostrar="";
        texto_introducido=caja_introducir_texto.getText().toString();
        Toast.makeText(this, "El texto se esta traduciendo", Toast.LENGTH_SHORT).show();
        traducir();
        for(int i=0;i<texto_introducido.length();i++){
            Txt_mostrar+=diccionario_traducir.get(texto_introducido.substring(i,i+1));
        }
        caja_mostrar_texto.setText(Txt_mostrar);
    }

    public void codificar(){
        diccionario_codificar.put("1","@");
        diccionario_codificar.put("2","#");
        diccionario_codificar.put("3","$");
        diccionario_codificar.put("4","%");
        diccionario_codificar.put("5","/");
        diccionario_codificar.put("6","(");
        diccionario_codificar.put("7",")");
        diccionario_codificar.put("8","&");
        diccionario_codificar.put("9","*");
        diccionario_codificar.put("0","|");
        /*************Letras************/
        diccionario_codificar.put(" ","1");
        diccionario_codificar.put("q","2");
        diccionario_codificar.put("w","3");
        diccionario_codificar.put("e","4");
        diccionario_codificar.put("r","5");
        diccionario_codificar.put("t","6");
        diccionario_codificar.put("y","7");
        diccionario_codificar.put("u","8");
        diccionario_codificar.put("i","9");
        diccionario_codificar.put("o","-");
        diccionario_codificar.put("p","_");
        /********************Letras_parte_2***************/
        diccionario_codificar.put("a",",");
        diccionario_codificar.put("s",";");
        diccionario_codificar.put("d",":");
        diccionario_codificar.put("f",".");
        diccionario_codificar.put("g","=");
        diccionario_codificar.put("h","]");
        diccionario_codificar.put("j","+");
        diccionario_codificar.put("k","z");
        diccionario_codificar.put("l","^");
        /********************Letras_parte_3***************/
        diccionario_codificar.put("z","¿");
        diccionario_codificar.put("x","¡");
        diccionario_codificar.put("c","?");
        diccionario_codificar.put("v","'");
        diccionario_codificar.put("b","s");
        diccionario_codificar.put("n","a");
        diccionario_codificar.put("m","f");
        /********************Signos***************/
        diccionario_codificar.put("'","!");
        diccionario_codificar.put("(","}");
        diccionario_codificar.put(")","[");
        diccionario_codificar.put(".","<");
        diccionario_codificar.put(",","g");
        diccionario_codificar.put(":","w");
        diccionario_codificar.put("¿","y");
        diccionario_codificar.put("?","t");
    }
    public void traducir(){
        diccionario_traducir.put("@","1");
        diccionario_traducir.put("#","2");
        diccionario_traducir.put("$","3");
        diccionario_traducir.put("%","4");
        diccionario_traducir.put("/","5");
        diccionario_traducir.put("(","6");
        diccionario_traducir.put(")","7");
        diccionario_traducir.put("&","8");
        diccionario_traducir.put("*","9");
        diccionario_traducir.put("|","0");
        /****************Letras***************/
        diccionario_traducir.put("1"," ");
        diccionario_traducir.put("2","q");
        diccionario_traducir.put("3","w");
        diccionario_traducir.put("4","e");
        diccionario_traducir.put("5","r");
        diccionario_traducir.put("6","t");
        diccionario_traducir.put("7","y");
        diccionario_traducir.put("8","u");
        diccionario_traducir.put("9","i");
        diccionario_traducir.put("-","o");
        diccionario_traducir.put("_","p");
        /********************Letras_parte_2***************/
        diccionario_traducir.put(",","a");
        diccionario_traducir.put(";","s");
        diccionario_traducir.put(":","d");
        diccionario_traducir.put(".","f");
        diccionario_traducir.put("=","g");
        diccionario_traducir.put("]","h");
        diccionario_traducir.put("+","j");
        diccionario_traducir.put("z","k");
        diccionario_traducir.put("^","l");
        /********************Letras_parte_3***************/
        diccionario_traducir.put("¿","z");
        diccionario_traducir.put("¡","x");
        diccionario_traducir.put("?","c");
        diccionario_traducir.put("'","v");
        diccionario_traducir.put("s","b");
        diccionario_traducir.put("a","n");
        diccionario_traducir.put("f","m");
        /********************Signos***************/
        diccionario_traducir.put("!","'");
        diccionario_traducir.put("}","(");
        diccionario_traducir.put("[",")");
        diccionario_traducir.put("<",".");
        diccionario_traducir.put("g",",");
        diccionario_traducir.put("w",":");
        diccionario_traducir.put("t","?");
        diccionario_traducir.put("y","¿");
    }

}