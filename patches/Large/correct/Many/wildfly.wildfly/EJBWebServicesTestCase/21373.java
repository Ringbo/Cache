diff --git a/testsuite/integration/src/test/java/org/jboss/as/testsuite/integration/wsejb/EJBWebServicesTestCase.java b/testsuite/integration/src/test/java/org/jboss/as/testsuite/integration/wsejb/EJBWebServicesTestCase.java
index f0e88fc..c315d2f 100644
--- a/testsuite/integration/src/test/java/org/jboss/as/testsuite/integration/wsejb/EJBWebServicesTestCase.java
+++ b/testsuite/integration/src/test/java/org/jboss/as/testsuite/integration/wsejb/EJBWebServicesTestCase.java
@@ -55,7 +55,7 @@
                 + "    </test:setState>"
                 + "  </soapenv:Body>"
                 + "</soapenv:Envelope>";
-        String result = HttpRequest.put("http://localhost:8080/ejbws-example/SingletonEndpoint", message, 10, SECONDS);
+        String result = HttpRequest.post("http://localhost:8080/ejbws-example/SingletonEndpoint", message, 10, SECONDS);
         // TODO: check something
         System.out.println(result);
     }
