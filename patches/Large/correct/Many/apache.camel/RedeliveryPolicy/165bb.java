diff --git a/camel-core/src/main/java/org/apache/camel/processor/RedeliveryPolicy.java b/camel-core/src/main/java/org/apache/camel/processor/RedeliveryPolicy.java
index f216662..e158b0a 100644
--- a/camel-core/src/main/java/org/apache/camel/processor/RedeliveryPolicy.java
+++ b/camel-core/src/main/java/org/apache/camel/processor/RedeliveryPolicy.java
@@ -220,7 +220,8 @@
             redeliveryDelayResult += redeliveryDelayResult * variance;
         }
 
-        if (maximumRedeliveryDelay > 0 && redeliveryDelay > maximumRedeliveryDelay) {
+        // ensure the calculated result is not bigger than the max delay (if configured)
+        if (maximumRedeliveryDelay > 0 && redeliveryDelayResult > maximumRedeliveryDelay) {
             redeliveryDelayResult = maximumRedeliveryDelay;
         }
 
