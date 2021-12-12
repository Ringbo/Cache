diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereInterceptorWriter.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereInterceptorWriter.java
index f2bad23..9e77f83 100644
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereInterceptorWriter.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereInterceptorWriter.java
@@ -51,7 +51,7 @@
 
     @Override
     public AsyncIOWriter write(AtmosphereResponse response, String data) throws IOException {
-        return write(response, data.getBytes());
+        return write(response, data.getBytes(response.getCharacterEncoding()));
     }
 
     @Override
