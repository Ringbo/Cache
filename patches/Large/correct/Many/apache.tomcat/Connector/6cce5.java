diff --git a/java/org/apache/catalina/connector/Connector.java b/java/org/apache/catalina/connector/Connector.java
index b741599..14d11d8 100644
--- a/java/org/apache/catalina/connector/Connector.java
+++ b/java/org/apache/catalina/connector/Connector.java
@@ -74,8 +74,7 @@
         this(null);
     }
 
-    public Connector(String protocol)
-        throws Exception {
+    public Connector(String protocol) {
         setProtocol(protocol);
         // Instantiate protocol handler
         try {
