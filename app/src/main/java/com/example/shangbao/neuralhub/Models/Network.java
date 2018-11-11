package com.example.shangbao.neuralhub.Models;

import java.util.LinkedList;

public class Network extends NNObject{
    private LinkedList<Layer> layers;

    public Network() {
        this.layers = new LinkedList<>();
    }

    public void addLayer() {
        Layer newLayer = new Layer(this);
        newLayer.setName("layer"+((Integer)this.layers.size()).toString());
    }
}
