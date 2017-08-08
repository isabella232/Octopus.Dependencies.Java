package com.octopus.calamari.utils.impl

import com.octopus.calamari.utils.LoggingService
import java.util.logging.*

object LoggingServiceImpl : LoggingService {
    /**
     * Octopus will treat messages printed to std err differently,
     * highlighting them and adding a notification to any build that
     * had text printed to std err. We need to modify the default
     * behaviour of the Java loggers to not print to std err unless
     * there is an actual warning or error.
     */
    override fun configureLogging() {
        /*
            Clear all eaxiting handlers
         */
        LogManager.getLogManager().reset()

        /*
            Set the root logging level to info
         */
        val rootLog = Logger.getLogger("")
        rootLog.level = Level.INFO

        /*
            Info level messages should go to std out
         */
        val infoLogger = StreamHandler(System.out, SimpleFormatter())
        infoLogger.level = Level.INFO
        rootLog.addHandler(infoLogger)

        /*
            Warning level messages should go to std err
         */
        val warnLogger = StreamHandler(System.err, SimpleFormatter())
        warnLogger.level = Level.WARNING
        rootLog.addHandler(warnLogger)
    }
}