diff --git a/src/main/java/com/nextcloud/android/sso/InputStreamBinder.java b/src/main/java/com/nextcloud/android/sso/InputStreamBinder.java
index 72e63ea..a9236b3 100644
--- a/src/main/java/com/nextcloud/android/sso/InputStreamBinder.java
+++ b/src/main/java/com/nextcloud/android/sso/InputStreamBinder.java
@@ -111,7 +111,7 @@
             NextcloudRequest request = deserializeObjectAndCloseStream(is);
             httpStream = processRequest(request);
         } catch (Exception e) {
-            Log_OC.e(TAG, e.getMessage());
+            Log_OC.e(TAG, e.toString());
             exception = e;
         }
 
