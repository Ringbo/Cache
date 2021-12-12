diff --git a/activemq-client/src/main/java/org/apache/activemq/ActiveMQConnection.java b/activemq-client/src/main/java/org/apache/activemq/ActiveMQConnection.java
index 8e6c157..b55f411 100644
--- a/activemq-client/src/main/java/org/apache/activemq/ActiveMQConnection.java
+++ b/activemq-client/src/main/java/org/apache/activemq/ActiveMQConnection.java
@@ -1965,7 +1965,7 @@
     @Override
     public void onException(final IOException error) {
         onAsyncException(error);
-        if (!closing.get() && !closed.get()) {
+        if (!closed.get() && !closing.get()) {
             executor.execute(new Runnable() {
                 @Override
                 public void run() {
