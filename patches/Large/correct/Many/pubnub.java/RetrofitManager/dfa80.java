diff --git a/src/main/java/com/pubnub/api/managers/RetrofitManager.java b/src/main/java/com/pubnub/api/managers/RetrofitManager.java
index 5c89858..bd21e78 100644
--- a/src/main/java/com/pubnub/api/managers/RetrofitManager.java
+++ b/src/main/java/com/pubnub/api/managers/RetrofitManager.java
@@ -59,7 +59,7 @@
             httpClient.proxy(pubnub.getConfiguration().getProxy());
         }
 
-        if (pubnub.getConfiguration().getProxyAuthenticator() != null) {
+        if (pubnub.getConfiguration().getProxySelector() != null) {
             httpClient.proxySelector(pubnub.getConfiguration().getProxySelector());
         }
 
