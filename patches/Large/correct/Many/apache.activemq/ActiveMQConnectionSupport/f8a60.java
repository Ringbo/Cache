diff --git a/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQConnectionSupport.java b/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQConnectionSupport.java
index f71eebc..f9d550a 100644
--- a/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQConnectionSupport.java
+++ b/activemq-ra/src/main/java/org/apache/activemq/ra/ActiveMQConnectionSupport.java
@@ -313,7 +313,7 @@
     /**
      * @param value
      */
-    public void setRedeliveryBackOffMultiplier(Short value) {
+    public void setRedeliveryBackOffMultiplier(Double value) {
         if ( log.isDebugEnabled() ) {
             log.debug("setting [redeliveryBackOffMultiplier] to: " + value);
         }
