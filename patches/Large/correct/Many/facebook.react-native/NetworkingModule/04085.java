diff --git a/ReactAndroid/src/main/java/com/facebook/react/modules/network/NetworkingModule.java b/ReactAndroid/src/main/java/com/facebook/react/modules/network/NetworkingModule.java
index 9b335a4..f6be25e 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/modules/network/NetworkingModule.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/modules/network/NetworkingModule.java
@@ -325,7 +325,7 @@
     // shared under the hood.
     // See https://github.com/square/okhttp/wiki/Recipes#per-call-configuration for more information
     if (timeout != mClient.connectTimeoutMillis()) {
-      clientBuilder.readTimeout(timeout, TimeUnit.MILLISECONDS);
+      clientBuilder.connectTimeout(timeout, TimeUnit.MILLISECONDS);
     }
     OkHttpClient client = clientBuilder.build();
 
