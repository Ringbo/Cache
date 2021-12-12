diff --git a/activemq-core/src/main/java/org/apache/activemq/ActiveMQConnection.java b/activemq-core/src/main/java/org/apache/activemq/ActiveMQConnection.java
index 334869e..7cccfcf 100755
--- a/activemq-core/src/main/java/org/apache/activemq/ActiveMQConnection.java
+++ b/activemq-core/src/main/java/org/apache/activemq/ActiveMQConnection.java
@@ -1207,7 +1207,7 @@
      * 
      * @throws JMSException
      */
-    protected void ensureConnectionInfoSent() throws JMSException {
+    protected synchronized void ensureConnectionInfoSent() throws JMSException {
         // Can we skip sending the ConnectionInfo packet??
         if (isConnectionInfoSentToBroker || closed.get()) {
             return;
