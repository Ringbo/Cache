diff --git a/services/core/java/com/android/server/webkit/SystemImpl.java b/services/core/java/com/android/server/webkit/SystemImpl.java
index cc87fda..a0381f7 100644
--- a/services/core/java/com/android/server/webkit/SystemImpl.java
+++ b/services/core/java/com/android/server/webkit/SystemImpl.java
@@ -296,7 +296,7 @@
 
     @Override
     public boolean isMultiProcessDefaultEnabled() {
-        return false;
+        return true;
     }
 
     // flags declaring we want extra info from the package manager for webview providers
