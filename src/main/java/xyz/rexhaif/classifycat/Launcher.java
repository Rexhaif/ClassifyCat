package xyz.rexhaif.classifycat;


import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Launcher {
    private static Logger LOG = LoggerFactory.getLogger("Launcher");

    static class Opts {
        @Parameter(
                names = {
                        "-conf",
                        "-c"
                },
                description = "Full path to the configuration file"
        )
        String confPath = "default-config.toml";

        @Parameter(
                names = {
                        "-help",
                        "-h"
                },
                description = "Retrieve information about command line arguments"
        )
        boolean help = false;
    }

    public static void main(String[] args) {
        System.out.println(Env.ABOUT);
        Opts opts = new Opts();
        JCommander jc = new JCommander(opts, args);
        jc.setProgramName(Env.PROGNAME);
        if (opts.help) {
            jc.usage();
            System.exit(0);
        }
    }

}
