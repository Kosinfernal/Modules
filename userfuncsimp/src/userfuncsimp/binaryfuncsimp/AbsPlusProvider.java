package userfuncsimp.binaryfuncsimp;
// This is a provider for the AbsPlus function.
import userfuncs.binaryfuncs.*;

public class AbsPlusProvider implements BinFuncProvider {

    // Provide an AbsPlus object.
    public BinaryFunc get() { return new AbsPlus(); }
}
