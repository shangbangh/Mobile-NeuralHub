package com.example.shangbao.neuralhub.Models;

import java.util.ArrayList;

public class Layer extends NNObject {
    private ArrayList<Neuron> neurons;
    private final Network mNetwork;

    public Layer(Network network) {
        this.neurons = new ArrayList<>();
        mNetwork = network;
    }

    public void addNeuron() {
        Neuron newNeuron = new Neuron(this);
        newNeuron.setName("Neuron" + ((Integer)this.neurons.size()).toString());
    }
}
