diff --git a/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java b/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java
index 5e3d896..ea8aaae 100644
--- a/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java
+++ b/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java
@@ -1413,7 +1413,7 @@
 
         ret = content(new VisorGatewayArgument(VisorQueryTask.class)
             .forNode(locNode)
-            .argument(VisorQueryArg.class, "person", URLEncoder.encode("select * from Person", CHARSET), false, 1));
+            .argument(VisorQueryArg.class, "person", URLEncoder.encode("select * from Person", CHARSET), false, false, false, 1));
 
         info("VisorQueryTask result: " + ret);
 
