diff --git a/android-networking/src/main/java/com/androidnetworking/common/ANRequest.java b/android-networking/src/main/java/com/androidnetworking/common/ANRequest.java
index 9a18351..aa30a63 100644
--- a/android-networking/src/main/java/com/androidnetworking/common/ANRequest.java
+++ b/android-networking/src/main/java/com/androidnetworking/common/ANRequest.java
@@ -574,7 +574,7 @@
 
     public void destroy() {
         mJSONArrayRequestListener = null;
-        mJSONArrayRequestListener = null;
+        mJSONObjectRequestListener = null;
         mStringRequestListener = null;
         mBitmapRequestListener = null;
         mParsedRequestListener = null;
