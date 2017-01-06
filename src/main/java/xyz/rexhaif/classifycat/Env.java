package xyz.rexhaif.classifycat;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;

public class Env {

    public static final String VERSION = "0.1.1";
    public static final String ABOUT = "ClassifyCat v" + VERSION + " by Rexhaif";
    public static final String PROGNAME = "java -jar classifycat.jar";

    public static HashFunction HASHFUNC = Hashing.goodFastHash(64);

}
