diff --git a/ReactAndroid/src/main/java/com/facebook/react/modules/network/NetworkingModule.java b/ReactAndroid/src/main/java/com/facebook/react/modules/network/NetworkingModule.java
index cc9c634..5534eb6 100644
--- a/ReactAndroid/src/main/java/com/facebook/react/modules/network/NetworkingModule.java
+++ b/ReactAndroid/src/main/java/com/facebook/react/modules/network/NetworkingModule.java
@@ -348,7 +348,7 @@
     }
 
     RequestBody requestBody;
-    if (data == null) {
+    if (data == null || method.toLowerCase().equals("get") || method.toLowerCase().equals("head")) {
       requestBody = RequestBodyUtil.getEmptyBody(method);
     } else if (handler != null) {
       requestBody = handler.toRequestBody(data, contentType);
