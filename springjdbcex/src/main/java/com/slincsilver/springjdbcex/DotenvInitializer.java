package com.slincsilver.springjdbcex;
import io.github.cdimascio.dotenv.Dotenv;

public class DotenvInitializer {
    public static void load()
    {
        Dotenv.configure().load();
    }
}
