diff --git a/jetty-http/src/main/java/org/eclipse/jetty/http/HttpBuffers.java b/jetty-http/src/main/java/org/eclipse/jetty/http/HttpBuffers.java
index 95bcdf8..351ef15 100644
--- a/jetty-http/src/main/java/org/eclipse/jetty/http/HttpBuffers.java
+++ b/jetty-http/src/main/java/org/eclipse/jetty/http/HttpBuffers.java
@@ -115,7 +115,7 @@
 
     public Buffers getResponseBuffers()
     {
-        return _requestBuffers;
+        return _responseBuffers;
     }
     
     /**
