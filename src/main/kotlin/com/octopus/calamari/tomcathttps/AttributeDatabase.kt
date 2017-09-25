package com.octopus.calamari.tomcathttps

object AttributeDatabase {
    val defaultSSLHostConfigName = "defaultSSLHostConfigName"

    /**
     * A list of <Connector> attributes. The easiest way to get this list is to use
     * https://www.changedetection.com/comparepages.html and compare these pages:
     *
     * https://tomcat.apache.org/tomcat-7.0-doc/config/http.html
     * https://tomcat.apache.org/tomcat-8.0-doc/config/http.html
     * https://tomcat.apache.org/tomcat-8.5-doc/config/http.html
     * https://tomcat.apache.org/tomcat-9.0-doc/config/http.html
     */
    val connectorAttribuites
        get() = listOf("allowTrace",
                "asyncTimeout",
                "enableLookups",
                "maxHeaderCount",
                "maxParameterCount",
                "maxPostSize",
                "maxSavePostSize",
                "parseBodyMethods",
                "port",
                "protocol",
                "proxyName",
                "proxyPort",
                "redirectPort",
                "scheme",
                "secure",
                "URIEncoding",
                "useBodyEncodingForURI",
                "useIPVHosts",
                "xpoweredBy",
                "acceptCount",
                "acceptorThreadCount",
                "acceptorThreadPriority",
                "address",
                "allowedTrailerHeaders",
                "bindOnInit",
                "compressibleMimeType",
                "compression",
                "compressionMinSize",
                "connectionLinger",
                "connectionTimeout",
                "connectionUploadTimeout",
                "disableUploadTimeout",
                "executor",
                "executorTerminationTimeoutMillis",
                "keepAliveTimeout",
                "maxConnections",
                "maxCookieCount",
                "maxExtensionSize",
                "maxHttpHeaderSize",
                "maxKeepAliveRequests",
                "maxSwallowSize",
                "maxThreads",
                "maxTrailerSize",
                "minSpareThreads",
                "noCompressionUserAgents",
                "processorCache",
                "restrictedUserAgents",
                "server",
                "socketBuffer",
                "SSLEnabled",
                "tcpNoDelay",
                "threadPriority",
                "upgradeAsyncWriteBufferSize",
                "socket.rxBufSize",
                "socket.txBufSize",
                "socket.tcpNoDelay",
                "socket.soKeepAlive",
                "socket.ooBInline",
                "socket.soReuseAddress",
                "socket.soLingerOn",
                "socket.soLingerTime",
                "socket.soTimeout",
                "socket.performanceConnectionTime",
                "socket.performanceLatency",
                "socket.performanceBandwidth",
                "socket.unlockTimeout",
                "disableKeepAlivePercentage",
                "pollerThreadCount",
                "pollerThreadPriority",
                "selectorTimeout",
                "useComet",
                "useSendfile",
                "socket.directBuffer",
                "socket.appReadBufSize",
                "socket.appWriteBufSize",
                "socket.bufferPool",
                "socket.bufferPoolSize",
                "socket.processorCache",
                "socket.keyCache",
                "socket.eventCache",
                "selectorPool.maxSelectors",
                "selectorPool.maxSpareSelectors",
                "command-line-options",
                "oomParachute",
                "deferAccept",
                "pollerSize",
                "pollTime",
                "sendfileSize",
                "threadPriority",
                "useComet",
                "useSendfile",
                "socket.directSslBuffer", // start of options new in tomcat 8
                "useCaches",
                "useComet",
                "useSendfile",
                "socket.directBuffer",
                "socket.directSslBuffer",
                "socket.appReadBufSize",
                "socket.appWriteBufSize",
                "socket.bufferPoolSize",
                "socket.processorCache",
                "socket.socketWrapperCache",
                "oomParachute",
                "pollerThreadCount",
                "sendfileThreadCount", // start of options new in tomcat 8.5
                "defaultSSLHostConfigName",
                "sendReasonPhrase",
                "clientCertProvider",
                "serverRemoveAppProvidedValues",
                "socket.bufferPool",
                "ipv6v6only",
                "throwOnFailure") // start of options new in tomcat 9


    /**
     * A list of the attributes that may conflict with the configuration we are defining
     */
    val conflictingAttributes
        get() = listOf("certificateKeyFile",
                "certificateFile",
                "certificateKeyAlias",
                "certificateKeyPassword",
                "certificateKeystoreFile",
                "certificateKeystorePassword",
                "certificateKeystoreProvider",
                "certificateKeystoreType",
                "SSLCertificateFile",
                "SSLCertificateKeyFile",
                "SSLPassword",
                "keyAlias",
                "keyPass",
                "keystoreFile",
                "keystorePass",
                "keystoreProvider",
                "keystoreType")
}