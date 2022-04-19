package userfuncsimp.binaryfuncsimp;
// This is a provider for the AbsMinus function.

import userfuncs.binaryfuncs.*;

public class AbsMinusProvider implements BinFuncProvider {

    // Provide an AbsMinus object.
    public BinaryFunc get() { return new AbsMinus(); }
}
