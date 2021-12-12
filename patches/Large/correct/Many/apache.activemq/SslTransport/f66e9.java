diff --git a/activemq-core/src/main/java/org/apache/activemq/transport/tcp/SslTransport.java b/activemq-core/src/main/java/org/apache/activemq/transport/tcp/SslTransport.java
index 4b71e27..022f22b 100644
--- a/activemq-core/src/main/java/org/apache/activemq/transport/tcp/SslTransport.java
+++ b/activemq-core/src/main/java/org/apache/activemq/transport/tcp/SslTransport.java
@@ -80,7 +80,7 @@
      * 
      * @param command The Command coming in.
      */
-    public void doConsume(Command command) {
+    public void doConsume(Object command) {
         // The instanceof can be avoided, but that would require modifying the
         // Command clas tree and that would require too much effort right
         // now.
