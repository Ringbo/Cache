diff --git a/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java b/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java
index f749a71..7433791 100644
--- a/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java
+++ b/modules/clients/src/test/java/org/apache/ignite/internal/processors/rest/JettyRestProcessorAbstractSelfTest.java
@@ -1403,7 +1403,8 @@
 
         ret = content(new VisorGatewayArgument(VisorQueryTask.class)
             .forNode(locNode)
-            .argument(VisorQueryArg.class, "person", URLEncoder.encode("select * from Person", CHARSET), false, false, 1));
+            .argument(VisorQueryArg.class, "person", URLEncoder.encode("select * from Person", CHARSET), false, false,
+                false, 1));
 
         info("VisorQueryTask result: " + ret);
 
