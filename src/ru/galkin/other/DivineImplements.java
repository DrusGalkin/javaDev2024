package ru.galkin.other;

import ru.galkin.animals.BirdSounds;
import ru.galkin.animals.Meow;
import ru.galkin.geometry.Figure;
import ru.galkin.geometry.GetLengthLineOrPolyline;
import ru.galkin.geometry.PolygonalChain;
import ru.galkin.geometry.Polyline;

public class DivineImplements implements Meow {
    //1
    public void priteBirdSounds(BirdSounds...birdSounds){
        for(int i = 0; i < birdSounds.length; i++){
            birdSounds[i].song();
            System.out.println();
        }
    }
    //2
    public double printSumNumericValue(Number...num) {
        double res = 0;
        for(int i = 0; i < num.length; i++){
            res += num[i].doubleValue();
        }
        return res;
    }
    //3
    public double sumFigure(Figure...figures){
        double res = 0;
        for(int i = 0; i < figures.length; i++){
            res+= figures[i].square();
        }
        return res;
    }
    //4
    public void moreCatMeowMeow(Meow...cat){
        for(int i = 0; i < cat.length; i++){
            System.out.println(cat[i]);
        }
    }

    @Override
    public String catMayMayMay() {
        return "meow";
    }

    public String toString(){
        return catMayMayMay();
    }

    //5
    public int getEverySumLengthPolyline(GetLengthLineOrPolyline...moreLine){
        int res = 0;
        for(int i = 0; i < moreLine.length; i++){
            res += moreLine[i].getLength();
        }
        return res;
    }

    //7
    public Polyline omgPolyline(PolygonalChain...polylines){
        Polyline soBigPolyline = new Polyline();
        for(int i = 0; i < polylines.length; i++){
            for(int j = 0; j < polylines[i].getPolygonalChain().getPoints().size(); j++){
                soBigPolyline.addPoint(polylines[i].getPolygonalChain().getPoints().get(j));
            }
        }
        return soBigPolyline;
    }




}
