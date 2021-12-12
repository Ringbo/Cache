diff --git a/okhttp/src/main/java/okhttp3/internal/platform/AndroidPlatform.java b/okhttp/src/main/java/okhttp3/internal/platform/AndroidPlatform.java
index c2cce4b..3d7c2b3 100644
--- a/okhttp/src/main/java/okhttp3/internal/platform/AndroidPlatform.java
+++ b/okhttp/src/main/java/okhttp3/internal/platform/AndroidPlatform.java
@@ -47,7 +47,7 @@
 
   private final CloseGuard closeGuard = CloseGuard.get();
 
-  public AndroidPlatform(Class<?> sslParametersClass, OptionalMethod<Socket> setUseSessionTickets,
+  AndroidPlatform(Class<?> sslParametersClass, OptionalMethod<Socket> setUseSessionTickets,
       OptionalMethod<Socket> setHostname, OptionalMethod<Socket> getAlpnSelectedProtocol,
       OptionalMethod<Socket> setAlpnProtocols) {
     this.sslParametersClass = sslParametersClass;
