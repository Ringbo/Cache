diff --git a/java/org/apache/tomcat/util/net/AbstractEndpoint.java b/java/org/apache/tomcat/util/net/AbstractEndpoint.java
index 7c7a73b..9344708 100644
--- a/java/org/apache/tomcat/util/net/AbstractEndpoint.java
+++ b/java/org/apache/tomcat/util/net/AbstractEndpoint.java
@@ -475,9 +475,9 @@
         try {
             // Need to create a connection to unlock the accept();
             if (address == null) {
-                saddr = new InetSocketAddress("localhost", getPort());
+                saddr = new InetSocketAddress("localhost", getLocalPort());
             } else {
-                saddr = new InetSocketAddress(address,getPort());
+                saddr = new InetSocketAddress(address, getLocalPort());
             }
             s = new java.net.Socket();
             int stmo = 2 * 1000;
