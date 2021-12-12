diff --git a/streams/src/test/java/org/apache/kafka/streams/integration/ResetIntegrationTest.java b/streams/src/test/java/org/apache/kafka/streams/integration/ResetIntegrationTest.java
index 3248b2a..4804bfb 100644
--- a/streams/src/test/java/org/apache/kafka/streams/integration/ResetIntegrationTest.java
+++ b/streams/src/test/java/org/apache/kafka/streams/integration/ResetIntegrationTest.java
@@ -421,7 +421,7 @@
     private class WaitUntilConsumerGroupGotClosed implements TestCondition {
         @Override
         public boolean conditionMet() {
-            return adminClient.describeConsumerGroup(APP_ID + testNo).consumers().get().isEmpty();
+            return adminClient.describeConsumerGroup(APP_ID + testNo, 0).consumers().get().isEmpty();
         }
     }
 
