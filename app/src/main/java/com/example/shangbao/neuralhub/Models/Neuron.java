package com.example.shangbao.neuralhub.Models;

public class Neuron extends NNObject {
    private final Layer mLayer;
    private Object input;
    private Object output;

    public Neuron(Layer layer) {
        mLayer = layer;
    }
}
