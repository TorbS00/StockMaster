module com.github.torbs00.stockmaster.core {
    requires com.github.benmanes.caffeine;
    requires com.google.guice;
    requires com.github.torbs00.stockmaster.foundation;
    requires transitive com.github.torbs00.stockmaster.api;


    exports com.github.torbs00.stockmaster.core;
}