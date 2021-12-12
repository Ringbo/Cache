diff --git a/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQConnectionRequestInfo.java b/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQConnectionRequestInfo.java
index 41dacca..3286941 100755
--- a/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQConnectionRequestInfo.java
+++ b/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQConnectionRequestInfo.java
@@ -213,9 +213,9 @@
         return Boolean.valueOf(redeliveryPolicy().isUseExponentialBackOff());
     }
 
-    public void setRedeliveryBackOffMultiplier(Short value) {
+    public void setRedeliveryBackOffMultiplier(Double value) {
         if (value != null) {
-            redeliveryPolicy().setBackOffMultiplier(value.shortValue());
+            redeliveryPolicy().setBackOffMultiplier(value);
         }
     }
 
