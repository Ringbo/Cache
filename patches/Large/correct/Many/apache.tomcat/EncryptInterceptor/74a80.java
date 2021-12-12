diff --git a/java/org/apache/catalina/tribes/group/interceptors/EncryptInterceptor.java b/java/org/apache/catalina/tribes/group/interceptors/EncryptInterceptor.java
index a2e32fe..e4f765a 100644
--- a/java/org/apache/catalina/tribes/group/interceptors/EncryptInterceptor.java
+++ b/java/org/apache/catalina/tribes/group/interceptors/EncryptInterceptor.java
@@ -326,7 +326,7 @@
         if(start < 0)
             throw new IllegalArgumentException(sm.getString("encryptInterceptor.algorithm.required"));
         int end = algorithm.indexOf('/', start + 1);
-        if(start < 0)
+        if(end < 0)
             throw new IllegalArgumentException(sm.getString("encryptInterceptor.algorithm.required"));
 
         return algorithm.substring(start + 1, end);
