diff --git a/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java b/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java
index 69aaf4a..ad8b995 100644
--- a/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java
+++ b/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java
@@ -1403,7 +1403,7 @@
 
         ret = content(new VisorGatewayArgument(VisorQueryTask.class)
             .forNode(locNode)
-            .argument(VisorQueryArg.class, "person", URLEncoder.encode("select * from Person", CHARSET), false, 1));
+            .argument(VisorQueryArg.class, "person", URLEncoder.encode("select * from Person", CHARSET), false, false, 1));
 
         info("VisorQueryTask result: " + ret);
 
