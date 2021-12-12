diff --git a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/security/loginmodules/negotiation/SPNEGOLoginModuleTestCase.java b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/security/loginmodules/negotiation/SPNEGOLoginModuleTestCase.java
index 698998f..f71099b 100644
--- a/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/security/loginmodules/negotiation/SPNEGOLoginModuleTestCase.java
+++ b/testsuite/integration/basic/src/test/java/org/jboss/as/test/integration/security/loginmodules/negotiation/SPNEGOLoginModuleTestCase.java
@@ -362,7 +362,7 @@
         final URI uri = getServletURI(webAppURL, SimpleSecuredServlet.SERVLET_PATH);
         final String[] mechTypes = new String[]{OID_KERBEROS_V5_LEGACY, OID_KERBEROS_V5};
         final byte[] kerberosToken = createNewKerberosTicketForHttp(uri);
-        assertSpnegoWorkflow(uri, mechTypes, kerberosToken, kerberosToken, true, true);
+        assertSpnegoWorkflow(uri, mechTypes, kerberosToken, kerberosToken, false, true);
     }
 
     /**
