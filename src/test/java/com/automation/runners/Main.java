package com.automation.runners;

import com.bumblebee.bumble.Framework;
import com.bumblebee.bumble.configurations.ConfigHandler;
import org.junit.Test;

import java.io.IOException;

public class Main {

    @Test
    public static void main(String[] args) throws IOException {

        ConfigHandler.initConfigurations();

        Framework framework = new Framework();

        framework.startExecutions();
    }
}
