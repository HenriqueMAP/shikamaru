open module kagemane {

//    requires transitive kagebunshin;
    exports kagemane.main.java.model.external;

    exports kagemane.main.java.model.internal
        to kagezukami;

//    Outra opçao é abrir um pacote específico
//    open kagemane;
}