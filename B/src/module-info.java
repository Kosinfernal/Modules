module B {
    exports bpackage;
    //requires A;
    requires transitive A; //неявная зависимость|неявное чтение
}