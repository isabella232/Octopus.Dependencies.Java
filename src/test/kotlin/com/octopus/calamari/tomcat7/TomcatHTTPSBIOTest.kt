package com.octopus.calamari.tomcat7

import com.octopus.calamari.tomcat.TomcatDeploy
import com.octopus.calamari.tomcat.TomcatOptions
import com.octopus.calamari.tomcathttps.TomcatHttpsImplementation.*
import com.octopus.calamari.utils.BaseTomcatTest
import com.octopus.calamari.utils.TomcatUtils
import org.jboss.arquillian.container.test.api.RunAsClient
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import java.io.File

@RunWith(Tomcat7ArquillianBIO::class)
class TomcatHTTPSBIOTest : BaseTomcatTest() {
    @Test
    fun listDeployments() =
            println(TomcatUtils.listDeployments(TomcatUtils.commonHttpsOptions))

    @Test
    fun testImplementationIsPresent() {
        Assert.assertFalse(testImplementationIsPresent(SERVER_XML, APR.className.get()))
        Assert.assertFalse(testImplementationIsPresent(SERVER_XML, NIO.className.get()))
        Assert.assertTrue(testImplementationIsPresent(SERVER_XML, BIO.className.get()))
    }
}