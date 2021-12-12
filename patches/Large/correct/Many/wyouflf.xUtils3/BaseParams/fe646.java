diff --git a/xutils/src/main/java/org/xutils/http/BaseParams.java b/xutils/src/main/java/org/xutils/http/BaseParams.java
index 31325f6..4d7690a 100644
--- a/xutils/src/main/java/org/xutils/http/BaseParams.java
+++ b/xutils/src/main/java/org/xutils/http/BaseParams.java
@@ -445,7 +445,7 @@
         return sb.toString();
     }
 
-    private void checkBodyParams() {
+    private synchronized void checkBodyParams() {
         if (bodyParams.isEmpty()) return;
 
         if (!HttpMethod.permitsRequestBody(method)
