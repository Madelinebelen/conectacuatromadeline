package com.example.madel_000.conectacuatromadeline;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;

/**
 * Created by madel_000 on 20/12/2015.
 */
public class unjugador extends Activity implements View.OnClickListener{

    int[] tablero= new int[35];
    ImageButton uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,diez,once,doce,trece,catorce,quince,
            diesciseis,diecisiete,diesciocho,diescinueve,veinte,veintiuno,veintidos,veintitres,veinticuatro,
            veinticinco,veintiseis,veintisiete,veintiocho,veintinueve,treinta,treintauno,treintados,treintatres,treintacuatro,treintacinco;
    boolean ganar,ganarama;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unjugador);
        uno= (ImageButton)findViewById(R.id.uno);
        dos= (ImageButton)findViewById(R.id.dos);
        tres= (ImageButton)findViewById(R.id.tres);
        cuatro= (ImageButton)findViewById(R.id.cuatro);
        cinco= (ImageButton)findViewById(R.id.cinco);
        seis= (ImageButton)findViewById(R.id.seis);
        siete= (ImageButton)findViewById(R.id.siete);
        ocho= (ImageButton)findViewById(R.id.ocho);
        nueve= (ImageButton)findViewById(R.id.nueve);
        diez= (ImageButton)findViewById(R.id.diez);
        once= (ImageButton)findViewById(R.id.once);
        doce= (ImageButton)findViewById(R.id.doce);
        trece= (ImageButton)findViewById(R.id.trece);
        catorce= (ImageButton)findViewById(R.id.catorce);
        quince= (ImageButton)findViewById(R.id.quince);
        diesciseis= (ImageButton)findViewById(R.id.dieciseis);
        diecisiete= (ImageButton)findViewById(R.id.diecisiete);
        diesciocho= (ImageButton)findViewById(R.id.dieciocho);
        diescinueve= (ImageButton)findViewById(R.id.diecinueve);
        veinte= (ImageButton)findViewById(R.id.veinte);
        veintiuno= (ImageButton)findViewById(R.id.veintiuno);
        veintidos= (ImageButton)findViewById(R.id.veintidos);
        veintitres= (ImageButton)findViewById(R.id.veintitres);
        veinticuatro= (ImageButton)findViewById(R.id.veinticuatro);
        veinticinco= (ImageButton)findViewById(R.id.veinticinco);
        veintiseis= (ImageButton)findViewById(R.id.veintiseis);
        veintisiete= (ImageButton)findViewById(R.id.veintisiete);
        veintiocho= (ImageButton)findViewById(R.id.veintiocho);
        veintinueve= (ImageButton)findViewById(R.id.veintinueve);
        treinta= (ImageButton)findViewById(R.id.treinta);
        treintauno= (ImageButton)findViewById(R.id.treintauno);
        treintados= (ImageButton)findViewById(R.id.treintados);
        treintatres= (ImageButton)findViewById(R.id.treintatres);
        treintacuatro= (ImageButton)findViewById(R.id.treintacuatro);
        treintacinco= (ImageButton)findViewById(R.id.treintacinco);







        for(int i=0; i<=34; i++)
        {
            tablero[i]=0;

        }
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tres.setOnClickListener(this);
        cuatro.setOnClickListener(this);
        cinco.setOnClickListener(this);
        seis.setOnClickListener(this);
        siete.setOnClickListener(this);
        ocho.setOnClickListener(this);
        nueve.setOnClickListener(this);
        diez.setOnClickListener(this);
        once.setOnClickListener(this);
        doce.setOnClickListener(this);
        trece.setOnClickListener(this);
        catorce.setOnClickListener(this);
        quince.setOnClickListener(this);
        diesciseis.setOnClickListener(this);
        diecisiete.setOnClickListener(this);
        diesciocho.setOnClickListener(this);
        diescinueve.setOnClickListener(this);
        veinte.setOnClickListener(this);
        veintiuno.setOnClickListener(this);
        veintidos.setOnClickListener(this);
        veintitres.setOnClickListener(this);
        veinticuatro.setOnClickListener(this);
        veinticinco.setOnClickListener(this);
        veintiseis.setOnClickListener(this);
        veintisiete.setOnClickListener(this);
        veintiocho.setOnClickListener(this);
        veintinueve.setOnClickListener(this);
        treinta.setOnClickListener(this);
        treintauno.setOnClickListener(this);
        treintados.setOnClickListener(this);
        treintatres.setOnClickListener(this);
        treintacuatro.setOnClickListener(this);
        treintacinco.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.uno:
                uno.setImageResource(R.drawable.bolitaroja);
                tablero[0]=1;
                validarganar();
                break;
            case R.id.dos:
                dos.setImageResource(R.drawable.bolitaroja);
                tablero[1]=1;
                validarganar();
                break;
            case R.id.tres:
                tres.setImageResource(R.drawable.bolitaroja);
                tablero[2]=1;
                validarganar();
                break;
            case R.id.cuatro:
                cuatro.setImageResource(R.drawable.bolitaroja);
                tablero[3]=1;
                validarganar();
                break;
            case R.id.cinco:
                cinco.setImageResource(R.drawable.bolitaroja);
                tablero[4]=1;
                validarganar();
                break;
            case R.id.seis:
                seis.setImageResource(R.drawable.bolitaroja);
                tablero[5]=1;
                validarganar();
                break;
            case R.id.siete:
                siete.setImageResource(R.drawable.bolitaroja);
                tablero[6]=1;
                validarganar();
                break;
            case R.id.ocho:
                ocho.setImageResource(R.drawable.bolitaroja);
                tablero[7]=1;
                validarganar();
                break;
            case R.id.nueve:
                nueve.setImageResource(R.drawable.bolitaroja);
                tablero[8]=1;
                validarganar();
                break;
            case R.id.diez:
                diez.setImageResource(R.drawable.bolitaroja);
                tablero[9]=1;
                validarganar();
                break;
            case R.id.once:
                once.setImageResource(R.drawable.bolitaroja);
                tablero[10]=1;
                validarganar();
                break;
            case R.id.doce:
                doce.setImageResource(R.drawable.bolitaroja);
                tablero[11]=1;
                validarganar();
                break;
            case R.id.trece:
                trece.setImageResource(R.drawable.bolitaroja);
                tablero[12]=1;
                validarganar();
                break;
            case R.id.catorce:
                catorce.setImageResource(R.drawable.bolitaroja);
                tablero[13]=1;
                validarganar();
                break;
            case R.id.quince:
                quince.setImageResource(R.drawable.bolitaroja);
                tablero[14]=1;
                validarganar();
                break;
            case R.id.dieciseis:
                diesciseis.setImageResource(R.drawable.bolitaroja);
                tablero[15]=1;
                validarganar();
                break;
            case R.id.diecisiete:
                diecisiete.setImageResource(R.drawable.bolitaroja);
                tablero[16]=1;
                validarganar();
                break;
            case R.id.dieciocho:
                diesciocho.setImageResource(R.drawable.bolitaroja);
                tablero[17]=1;
                validarganar();
                break;
            case R.id.diecinueve:
                diescinueve.setImageResource(R.drawable.bolitaroja);
                tablero[18]=1;
                validarganar();
                break;
            case R.id.veinte:
                veinte.setImageResource(R.drawable.bolitaroja);
                tablero[19]=1;
                validarganar();
                break;
            case R.id.veintiuno:
                veintiuno.setImageResource(R.drawable.bolitaroja);
                tablero[20]=1;
                validarganar();
                break;
            case R.id.veintidos:
                veintidos.setImageResource(R.drawable.bolitaroja);
                tablero[21]=1;
                validarganar();
                break;
            case R.id.veintitres:
                veintitres.setImageResource(R.drawable.bolitaroja);
                tablero[22]=1;
                validarganar();
                break;
            case R.id.veinticuatro:
                veinticuatro.setImageResource(R.drawable.bolitaroja);
                tablero[23]=1;
                validarganar();
                break;
            case R.id.veinticinco:
                veinticinco.setImageResource(R.drawable.bolitaroja);
                tablero[24]=1;
                validarganar();
                break;
            case R.id.veintiseis:
                veintiseis.setImageResource(R.drawable.bolitaroja);
                tablero[25]=1;
                validarganar();
                break;
            case R.id.veintisiete:
                veintisiete.setImageResource(R.drawable.bolitaroja);
                tablero[26]=1;
                validarganar();
                break;
            case R.id.veintiocho:
                veintiocho.setImageResource(R.drawable.bolitaroja);
                tablero[27]=1;
                validarganar();
                break;
            case R.id.veintinueve:
                veintinueve.setImageResource(R.drawable.bolitaroja);
                tablero[28]=1;
                validarganar();
                break;
            case R.id.treinta:
                treinta.setImageResource(R.drawable.bolitaroja);
                tablero[29]=1;
                validarganar();
                break;
            case R.id.treintauno:
                treintauno.setImageResource(R.drawable.bolitaroja);
                tablero[30]=1;
                validarganar();
                break;
            case R.id.treintados:
                treintados.setImageResource(R.drawable.bolitaroja);
                tablero[31]=1;
                validarganar();
                break;
            case R.id.treintatres:
                treintatres.setImageResource(R.drawable.bolitaroja);
                tablero[32]=1;
                validarganar();
                break;
            case R.id.treintacuatro:
                treintacuatro.setImageResource(R.drawable.bolitaroja);
                tablero[33]=1;
                validarganar();
                break;
            case R.id.treintacinco:
                treintacinco.setImageResource(R.drawable.bolitaroja);
                tablero[34]=1;
                validarganar();
                break;

            default:
                break;

        }
        oponentecomputador();

    }
    public void oponentecomputador()
    {
        boolean poner=true;
        int rand= (int)(34* Math.random())+1;
        while(poner)
        {
            if(tablero[rand]==2 | tablero[rand]==1){
                rand=rand+1;
                if (rand==35)
                {
                    rand=0;
                }

            }else
            {
                if (tablero[rand]==0)
                {
                    poner=false;

                }else
                {
                    poner=true;
                }
            }
        }
        switch (rand)
        {
            case 0:
                uno.setImageResource(R.drawable.bolitaamarilla);
                tablero[0]=2;

                break;
            case 1:
                dos.setImageResource(R.drawable.bolitaamarilla);
                tablero[1]=2;

                break;
            case 2:
                tres.setImageResource(R.drawable.bolitaamarilla);
                tablero[2]=2;

                break;

            case 3:
                cuatro.setImageResource(R.drawable.bolitaamarilla);
                tablero[3]=2;

                break;
            case 4:
                cinco.setImageResource(R.drawable.bolitaamarilla);
                tablero[4]=2;

                break;
            case 5:
                seis.setImageResource(R.drawable.bolitaamarilla);
                tablero[5]=2;

                break;
            case 6:
                siete.setImageResource(R.drawable.bolitaamarilla);
                tablero[6]=2;

                break;
            case 7:
                ocho.setImageResource(R.drawable.bolitaamarilla);
                tablero[7]=2;

                break;
            case 8:
                nueve.setImageResource(R.drawable.bolitaamarilla);
                tablero[8]=2;

                break;
            case 9:
                diez.setImageResource(R.drawable.bolitaamarilla);
                tablero[9]=2;
                break;
            case 10:
                once.setImageResource(R.drawable.bolitaamarilla);
                tablero[10]=2;

                break;
            case 11:
                doce.setImageResource(R.drawable.bolitaamarilla);
                tablero[11]=2;

                break;
            case 12:
                trece.setImageResource(R.drawable.bolitaamarilla);
                tablero[12]=2;

                break;
            case 13:
                catorce.setImageResource(R.drawable.bolitaamarilla);
                tablero[13]=2;

                break;
            case 14:
                quince.setImageResource(R.drawable.bolitaamarilla);
                tablero[14]=2;

                break;
            case 15:
                diesciseis.setImageResource(R.drawable.bolitaamarilla);
                tablero[15]=2;

                break;
            case 16:
                diecisiete.setImageResource(R.drawable.bolitaamarilla);
                tablero[16]=2;

                break;
            case 17:
                diesciocho.setImageResource(R.drawable.bolitaamarilla);
                tablero[17]=2;

                break;
            case 18:
                diescinueve.setImageResource(R.drawable.bolitaamarilla);
                tablero[18]=2;

                break;
            case 19:
                veinte.setImageResource(R.drawable.bolitaamarilla);
                tablero[19]=2;

                break;
            case 20:
                veintiuno.setImageResource(R.drawable.bolitaamarilla);
                tablero[20]=2;

                break;
            case 21:
                veintidos.setImageResource(R.drawable.bolitaamarilla);
                tablero[21]=2;

                break;
            case 22:
                veintitres.setImageResource(R.drawable.bolitaamarilla);
                tablero[22]=2;

                break;
            case 23:
                veinticuatro.setImageResource(R.drawable.bolitaamarilla);
                tablero[23]=2;
               ;
                break;
            case 24:
                veinticinco.setImageResource(R.drawable.bolitaamarilla);
                tablero[24]=2;

                break;
            case 25:
                veintiseis.setImageResource(R.drawable.bolitaamarilla);
                tablero[25]=2;

                break;
            case 26:
                veintisiete.setImageResource(R.drawable.bolitaamarilla);
                tablero[26]=2;

                break;
            case 27:
                veintiocho.setImageResource(R.drawable.bolitaamarilla);
                tablero[27]=2;

                break;
            case 28:
                veintinueve.setImageResource(R.drawable.bolitaamarilla);
                tablero[28]=2;

                break;
            case 29:
                treinta.setImageResource(R.drawable.bolitaamarilla);
                tablero[29]=2;

                break;
            case 30:
                treintauno.setImageResource(R.drawable.bolitaamarilla);
                tablero[30]=2;

                break;
            case 31:
                treintados.setImageResource(R.drawable.bolitaamarilla);
                tablero[31]=2;

                break;
            case 32:
                treintatres.setImageResource(R.drawable.bolitaamarilla);
                tablero[32]=2;

                break;
            case 33:
                treintacuatro.setImageResource(R.drawable.bolitaamarilla);
                tablero[33]=2;

                break;
            case 34:
                treintacinco.setImageResource(R.drawable.bolitaamarilla);
                tablero[34]=2;

                break;
        }
    }

    public void validarganar()
    {
        if(tablero[0]==1)
        {
            if (tablero[1]==1)
            {
                if (tablero[2]==1)
                {
                    if (tablero[3]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[1]==1)
        {
            if (tablero[2]==1)
            {
                if (tablero[3]==1)
                {
                    if (tablero[4]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[5]==1)
        {
            if (tablero[6]==1)
            {
                if (tablero[7]==1)
                {
                    if (tablero[8]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[6]==1)
        {
            if (tablero[7]==1)
            {
                if (tablero[8]==1)
                {
                    if (tablero[9]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[10]==1)
        {
            if (tablero[11]==1)
            {
                if (tablero[12]==1)
                {
                    if (tablero[13]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[11]==1)
        {
            if (tablero[12]==1)
            {
                if (tablero[13]==1)
                {
                    if (tablero[14]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[15]==1)
        {
            if (tablero[16]==1)
            {
                if (tablero[17]==1)
                {
                    if (tablero[18]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[16]==1)
        {
            if (tablero[17]==1)
            {
                if (tablero[18]==1)
                {
                    if (tablero[19]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[20]==1)
        {
            if (tablero[21]==1)
            {
                if (tablero[22]==1)
                {
                    if (tablero[23]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[21]==1)
        {
            if (tablero[22]==1)
            {
                if (tablero[23]==1)
                {
                    if (tablero[24]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[25]==1)
        {
            if (tablero[26]==1)
            {
                if (tablero[27]==1)
                {
                    if (tablero[28]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[26]==1)
        {
            if (tablero[27]==1)
            {
                if (tablero[28]==1)
                {
                    if (tablero[29]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[30]==1)
        {
            if (tablero[31]==1)
            {
                if (tablero[32]==1)
                {
                    if (tablero[33]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[31]==1)
        {
            if (tablero[32]==1)
            {
                if (tablero[33]==1)
                {
                    if (tablero[34]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[0]==1)
        {
            if (tablero[5]==1)
            {
                if (tablero[10]==1)
                {
                    if (tablero[15]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[5]==1)
        {
            if (tablero[10]==1)
            {
                if (tablero[15]==1)
                {
                    if (tablero[20]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[10]==1)
        {
            if (tablero[15]==1)
            {
                if (tablero[20]==1)
                {
                    if (tablero[35]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[15]==1)
        {
            if (tablero[20]==1)
            {
                if (tablero[25]==1)
                {
                    if (tablero[30]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[1]==1)
        {
            if (tablero[6]==1)
            {
                if (tablero[11]==1)
                {
                    if (tablero[16]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[6]==1)
        {
            if (tablero[11]==1)
            {
                if (tablero[16]==1)
                {
                    if (tablero[21]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[11]==1)
        {
            if (tablero[16]==1)
            {
                if (tablero[21]==1)
                {
                    if (tablero[26]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[16]==1)
        {
            if (tablero[21]==1)
            {
                if (tablero[26]==1)
                {
                    if (tablero[31]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[2]==1)
        {
            if (tablero[7]==1)
            {
                if (tablero[12]==1)
                {
                    if (tablero[17]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[7]==1)
        {
            if (tablero[12]==1)
            {
                if (tablero[17]==1)
                {
                    if (tablero[22]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[12]==1)
        {
            if (tablero[17]==1)
            {
                if (tablero[22]==1)
                {
                    if (tablero[27]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[17]==1)
        {
            if (tablero[22]==1)
            {
                if (tablero[27]==1)
                {
                    if (tablero[32]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[3]==1)
        {
            if (tablero[8]==1)
            {
                if (tablero[13]==1)
                {
                    if (tablero[18]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[8]==1)
        {
            if (tablero[13]==1)
            {
                if (tablero[18]==1)
                {
                    if (tablero[23]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[13]==1)
        {
            if (tablero[18]==1)
            {
                if (tablero[23]==1)
                {
                    if (tablero[28]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[18]==1)
        {
            if (tablero[23]==1)
            {
                if (tablero[28]==1)
                {
                    if (tablero[33]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[4]==1)
        {
            if (tablero[9]==1)
            {
                if (tablero[14]==1)
                {
                    if (tablero[19]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[9]==1)
        {
            if (tablero[14]==1)
            {
                if (tablero[19]==1)
                {
                    if (tablero[24]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[14]==1)
        {
            if (tablero[19]==1)
            {
                if (tablero[24]==1)
                {
                    if (tablero[29]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[19]==1)
        {
            if (tablero[24]==1)
            {
                if (tablero[29]==1)
                {
                    if (tablero[34]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[3]==1)
        {
            if (tablero[7]==1)
            {
                if (tablero[11]==1)
                {
                    if (tablero[15]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[4]==1)
        {
            if (tablero[8]==1)
            {
                if (tablero[12]==1)
                {
                    if (tablero[16]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[8]==1)
        {
            if (tablero[12]==1)
            {
                if (tablero[16]==1)
                {
                    if (tablero[20]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[9]==1)
        {
            if (tablero[13]==1)
            {
                if (tablero[17]==1)
                {
                    if (tablero[21]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[13]==1)
        {
            if (tablero[17]==1)
            {
                if (tablero[21]==1)
                {
                    if (tablero[25]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[14]==1)
        {
            if (tablero[18]==1)
            {
                if (tablero[22]==1)
                {
                    if (tablero[26]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[18]==1)
        {
            if (tablero[22]==1)
            {
                if (tablero[26]==1)
                {
                    if (tablero[30]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[19]==1)
        {
            if (tablero[23]==1)
            {
                if (tablero[27]==1)
                {
                    if (tablero[31]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[15]==1)
        {
            if (tablero[21]==1)
            {
                if (tablero[27]==1)
                {
                    if (tablero[33]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[10]==1)
        {
            if (tablero[16]==1)
            {
                if (tablero[22]==1)
                {
                    if (tablero[28]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[16]==1)
        {
            if (tablero[22]==1)
            {
                if (tablero[28]==1)
                {
                    if (tablero[34]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[5]==1)
        {
            if (tablero[11]==1)
            {
                if (tablero[17]==1)
                {
                    if (tablero[23]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[11]==1)
        {
            if (tablero[17]==1)
            {
                if (tablero[23]==1)
                {
                    if (tablero[29]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[0]==1)
        {
            if (tablero[6]==1)
            {
                if (tablero[12]==1)
                {
                    if (tablero[18]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[6]==1)
        {
            if (tablero[12]==1)
            {
                if (tablero[18]==1)
                {
                    if (tablero[24]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if(tablero[1]==1)
        {
            if (tablero[7]==1)
            {
                if (tablero[13]==1)
                {
                    if (tablero[19]==1)
                    {
                        ganar=true;
                    }
                }
            }
        }
        if (ganar==true)
        {
            Toast toast= Toast.makeText(this, "El Jugador rojito ha ganado", Toast.LENGTH_LONG);
            toast.show();
            Intent intent= new Intent();
            intent.setClass(unjugador.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
    public void verificaroponente()
    {
        if(tablero[0]==2)
        {
            if (tablero[1]==2)
            {
                if (tablero[2]==2)
                {
                    if (tablero[3]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[1]==2)
        {
            if (tablero[2]==2)
            {
                if (tablero[3]==2)
                {
                    if (tablero[4]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[5]==2)
        {
            if (tablero[6]==2)
            {
                if (tablero[7]==2)
                {
                    if (tablero[8]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[6]==2)
        {
            if (tablero[7]==2)
            {
                if (tablero[8]==2)
                {
                    if (tablero[9]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[10]==2)
        {
            if (tablero[11]==2)
            {
                if (tablero[12]==2)
                {
                    if (tablero[13]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[11]==2)
        {
            if (tablero[12]==2)
            {
                if (tablero[13]==2)
                {
                    if (tablero[14]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[15]==2)
        {
            if (tablero[16]==2)
            {
                if (tablero[17]==2)
                {
                    if (tablero[18]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[16]==2)
        {
            if (tablero[17]==2)
            {
                if (tablero[18]==2)
                {
                    if (tablero[19]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[20]==2)
        {
            if (tablero[21]==2)
            {
                if (tablero[22]==2)
                {
                    if (tablero[23]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[21]==2)
        {
            if (tablero[22]==2)
            {
                if (tablero[23]==2)
                {
                    if (tablero[24]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[25]==2)
        {
            if (tablero[26]==2)
            {
                if (tablero[27]==2)
                {
                    if (tablero[28]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[26]==2)
        {
            if (tablero[27]==2)
            {
                if (tablero[28]==2)
                {
                    if (tablero[29]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[30]==2)
        {
            if (tablero[31]==2)
            {
                if (tablero[32]==2)
                {
                    if (tablero[33]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[31]==2)
        {
            if (tablero[32]==2)
            {
                if (tablero[33]==2)
                {
                    if (tablero[34]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[0]==2)
        {
            if (tablero[5]==2)
            {
                if (tablero[10]==2)
                {
                    if (tablero[15]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[5]==2)
        {
            if (tablero[10]==2)
            {
                if (tablero[15]==2)
                {
                    if (tablero[20]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[10]==2)
        {
            if (tablero[15]==2)
            {
                if (tablero[20]==2)
                {
                    if (tablero[35]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[15]==2)
        {
            if (tablero[20]==2)
            {
                if (tablero[25]==2)
                {
                    if (tablero[30]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[1]==2)
        {
            if (tablero[6]==2)
            {
                if (tablero[11]==2)
                {
                    if (tablero[16]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[6]==2)
        {
            if (tablero[11]==2)
            {
                if (tablero[16]==2)
                {
                    if (tablero[21]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[11]==2)
        {
            if (tablero[16]==2)
            {
                if (tablero[21]==2)
                {
                    if (tablero[26]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[16]==2)
        {
            if (tablero[21]==2)
            {
                if (tablero[26]==2)
                {
                    if (tablero[31]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[2]==2)
        {
            if (tablero[7]==2)
            {
                if (tablero[12]==2)
                {
                    if (tablero[17]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[7]==2)
        {
            if (tablero[12]==2)
            {
                if (tablero[17]==2)
                {
                    if (tablero[22]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[12]==2)
        {
            if (tablero[17]==2)
            {
                if (tablero[22]==2)
                {
                    if (tablero[27]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[17]==2)
        {
            if (tablero[22]==2)
            {
                if (tablero[27]==2)
                {
                    if (tablero[32]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[3]==2)
        {
            if (tablero[8]==2)
            {
                if (tablero[13]==2)
                {
                    if (tablero[18]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[8]==2)
        {
            if (tablero[13]==2)
            {
                if (tablero[18]==2)
                {
                    if (tablero[23]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[13]==2)
        {
            if (tablero[18]==2)
            {
                if (tablero[23]==2)
                {
                    if (tablero[28]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[18]==2)
        {
            if (tablero[23]==2)
            {
                if (tablero[28]==2)
                {
                    if (tablero[33]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[4]==2)
        {
            if (tablero[9]==2)
            {
                if (tablero[14]==2)
                {
                    if (tablero[19]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[9]==2)
        {
            if (tablero[14]==2)
            {
                if (tablero[19]==2)
                {
                    if (tablero[24]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[14]==2)
        {
            if (tablero[19]==2)
            {
                if (tablero[24]==2)
                {
                    if (tablero[29]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[19]==2)
        {
            if (tablero[24]==2)
            {
                if (tablero[29]==2)
                {
                    if (tablero[34]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[3]==2)
        {
            if (tablero[7]==2)
            {
                if (tablero[11]==2)
                {
                    if (tablero[15]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[4]==2)
        {
            if (tablero[8]==2)
            {
                if (tablero[12]==2)
                {
                    if (tablero[16]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[8]==2)
        {
            if (tablero[12]==2)
            {
                if (tablero[16]==2)
                {
                    if (tablero[20]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[9]==2)
        {
            if (tablero[13]==2)
            {
                if (tablero[17]==2)
                {
                    if (tablero[21]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[13]==2)
        {
            if (tablero[17]==2)
            {
                if (tablero[21]==2)
                {
                    if (tablero[25]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[14]==2)
        {
            if (tablero[18]==2)
            {
                if (tablero[22]==2)
                {
                    if (tablero[26]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[18]==2)
        {
            if (tablero[22]==2)
            {
                if (tablero[26]==2)
                {
                    if (tablero[30]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[19]==2)
        {
            if (tablero[23]==2)
            {
                if (tablero[27]==2)
                {
                    if (tablero[31]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[15]==2)
        {
            if (tablero[21]==2)
            {
                if (tablero[27]==2)
                {
                    if (tablero[33]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[10]==2)
        {
            if (tablero[16]==2)
            {
                if (tablero[22]==2)
                {
                    if (tablero[28]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[16]==2)
        {
            if (tablero[22]==2)
            {
                if (tablero[28]==2)
                {
                    if (tablero[34]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[5]==2)
        {
            if (tablero[11]==2)
            {
                if (tablero[17]==2)
                {
                    if (tablero[23]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[11]==2)
        {
            if (tablero[17]==2)
            {
                if (tablero[23]==2)
                {
                    if (tablero[29]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[0]==2)
        {
            if (tablero[6]==2)
            {
                if (tablero[12]==2)
                {
                    if (tablero[18]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[6]==2)
        {
            if (tablero[12]==2)
            {
                if (tablero[18]==2)
                {
                    if (tablero[24]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if(tablero[1]==2)
        {
            if (tablero[7]==2)
            {
                if (tablero[13]==2)
                {
                    if (tablero[19]==2)
                    {
                        ganarama=true;
                    }
                }
            }
        }
        if (ganar==true)
        {
            Toast toast= Toast.makeText(this, "El Jugador amarillo ha ganado", Toast.LENGTH_LONG);
            toast.show();
            Intent intent= new Intent();
            intent.setClass(unjugador.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
