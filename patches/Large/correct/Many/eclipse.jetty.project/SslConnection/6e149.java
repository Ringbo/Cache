diff --git a/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SslConnection.java b/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SslConnection.java
index 14c04d2..6808206 100644
--- a/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SslConnection.java
+++ b/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SslConnection.java
@@ -198,7 +198,7 @@
                 {
                     // handle the delegate connection
                     AsyncConnection next = (AsyncConnection)_connection.handle();
-                    if (next!=_connection && next==null)
+                    if (next!=_connection && next!=null)
                     {
                         _connection=next;
                         progress=true;
