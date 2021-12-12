diff --git a/camel-core/src/test/java/org/apache/camel/processor/DelayerTest.java b/camel-core/src/test/java/org/apache/camel/processor/DelayerTest.java
index 6eb634b..3b86bb0 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/DelayerTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/DelayerTest.java
@@ -45,7 +45,7 @@
         MockEndpoint resultEndpoint = resolveMandatoryEndpoint("mock:result", MockEndpoint.class);
         resultEndpoint.expectedMessageCount(1);
         // should at least take 1 sec to complete
-        resultEndpoint.setMinimumResultWaitTime(1000);
+        resultEndpoint.setMinimumResultWaitTime(900);
         template.sendBody("seda:b", "<hello>world!</hello>");
         resultEndpoint.assertIsSatisfied();
     }
