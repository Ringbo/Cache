diff --git a/java/org/apache/tomcat/jni/socket/AprSocket.java b/java/org/apache/tomcat/jni/socket/AprSocket.java
index 09f13be..1800bab 100644
--- a/java/org/apache/tomcat/jni/socket/AprSocket.java
+++ b/java/org/apache/tomcat/jni/socket/AprSocket.java
@@ -730,7 +730,8 @@
 
                     setStatus(CONNECTED);
                     if (context.sslMode) {
-                        Socket.timeoutSet(socket, context.connectTimeout * 1000);
+                        Socket.timeoutSet(socket,
+                                context.connectTimeout * 1000L);
                         blockingStartTLS();
                     }
                     setNonBlocking(); // call again, to set the bits ( connect was blocking )
