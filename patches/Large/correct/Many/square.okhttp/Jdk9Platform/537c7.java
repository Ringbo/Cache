diff --git a/okhttp/src/main/java/okhttp3/internal/platform/Jdk9Platform.java b/okhttp/src/main/java/okhttp3/internal/platform/Jdk9Platform.java
index 683e5c1..19f444d 100644
--- a/okhttp/src/main/java/okhttp3/internal/platform/Jdk9Platform.java
+++ b/okhttp/src/main/java/okhttp3/internal/platform/Jdk9Platform.java
@@ -31,7 +31,7 @@
   final Method setProtocolMethod;
   final Method getProtocolMethod;
 
-  public Jdk9Platform(Method setProtocolMethod, Method getProtocolMethod) {
+  Jdk9Platform(Method setProtocolMethod, Method getProtocolMethod) {
     this.setProtocolMethod = setProtocolMethod;
     this.getProtocolMethod = getProtocolMethod;
   }
