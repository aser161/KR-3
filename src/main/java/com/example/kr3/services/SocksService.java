package com.example.kr3.services;

import com.example.kr3.model.Socks;

public interface SocksService {

    void add(Socks socks, int total);

    boolean issue(Socks socks, int amount);

    int getAmountOfSocks(Socks socks);

    boolean delete(Socks socks, int amount);
}
