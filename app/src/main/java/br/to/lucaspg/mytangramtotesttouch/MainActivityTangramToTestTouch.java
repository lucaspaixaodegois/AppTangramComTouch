package br.to.lucaspg.mytangramtotesttouch;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

//Classe principal do APP//implements SensorEventListener
public class MainActivityTangramToTestTouch extends Activity {

    private GLSurfaceView superficieDesenho = null;//Declara uma referenci para a superfice de desenho.
    private Renderizador render = null; //inicia um objeto render do tipo renderizador
    //testando outros desenhos
    private RenderFigura7 render1 = null;//inicia um objeto RenderFigura7 do tipo renderizador
    private RenderFigura17 render2 = null;//inicia um objeto RenderFigura7 do tipo renderizador

    protected void onCreate(Bundle savedInstanceState) {//metodo chamado quando o app é inicializado.

        super.onCreate(savedInstanceState);//2- Instancia um objeto da superficie de desenho.
        this.superficieDesenho = new GLSurfaceView(this); //publica a superficie de desenho na tela.
        this.render = new Renderizador();//publica,instancia render.

        //testando outros desenhos
        this.render1 = new RenderFigura7();// para rodar  outro desenho na mesma superficie
        this.render2 = new RenderFigura17(); // para rodar outro desenho na mesma superficie
        this.superficieDesenho.setRenderer(this.render);//Configura o objeto que será desenhado na superficie desenho.
        setContentView(this.superficieDesenho);//publica  a superficie desenho.
    }

}