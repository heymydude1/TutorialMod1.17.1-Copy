package net.fabricmc.tutorial.config;

import com.mojang.datafixers.util.Pair;
import net.fabricmc.tutorial.Main;
import net.fabricmc.tutorial.MainClientMod;

public class ModConfigs {
    private static MainClientMod get_value;
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static String TEST;
    public static int SOME_INT;
    public static double SOME_DOUBLE;
    public static int MAX_DAMAGE_WOODEN_DOWSING_ROD;
    public static int MAX_DAMAGE_RUBY_DOWSING_ROD;
    //public static int MAX_DAMAGE_RED_WOOD_DOWSING_ROD;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(Main.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("key.test.value1", "Just a Testing string!"), "String");
        configs.addKeyValuePair(new Pair<>("key.test.value2", 50), "int");
        configs.addKeyValuePair(new Pair<>("key.test.value3", 4142.5), "double");
        configs.addKeyValuePair(new Pair<>("wooden.dowsing.rod.max.damage", 15), "int");
        //configs.addKeyValuePair(new Pair<>("red.wood.dowsing.rod.max.damage", 15), "int");
        configs.addKeyValuePair(new Pair<>("ruby.dowsing.rod.max.damage",50),"int");
    }

    private static void assignConfigs() {
        TEST = CONFIG.getOrDefault("key.test.value1", "Nothing");
        SOME_INT = CONFIG.getOrDefault("key.test.value2", 42);
        SOME_DOUBLE = CONFIG.getOrDefault("key.test.value3", 42.0d);
        MAX_DAMAGE_WOODEN_DOWSING_ROD = CONFIG.getOrDefault("wooden.dowsing.rod.max.damage", 15);
        //MAX_DAMAGE_WOODEN_DOWSING_ROD = CONFIG.getOrDefault("red.wood.dowsing.rod.max.damage", 15);
        MAX_DAMAGE_RUBY_DOWSING_ROD = CONFIG.getOrDefault("ruby.dowsing.rod.max.damage", 50);
        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}
