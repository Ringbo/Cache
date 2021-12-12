diff --git a/jetty-http/src/main/java/org/eclipse/jetty/http/MimeTypes.java b/jetty-http/src/main/java/org/eclipse/jetty/http/MimeTypes.java
index eecc179..de50d4b 100644
--- a/jetty-http/src/main/java/org/eclipse/jetty/http/MimeTypes.java
+++ b/jetty-http/src/main/java/org/eclipse/jetty/http/MimeTypes.java
@@ -516,7 +516,7 @@
      */
     public static Map<String,String> getAssumedEncodings()
     {
-        return __inferredEncodings;
+        return __assumedEncodings;
     }
 
     @Deprecated
