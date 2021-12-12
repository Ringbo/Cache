diff --git a/core/java/android/app/Dialog.java b/core/java/android/app/Dialog.java
index da8c9e5..d70ec0b 100644
--- a/core/java/android/app/Dialog.java
+++ b/core/java/android/app/Dialog.java
@@ -823,7 +823,7 @@
 
         // associate search with owner activity
         final ComponentName appName = getAssociatedActivity();
-        if (appName != null) {
+        if (appName != null && searchManager.getSearchableInfo(appName) != null) {
             searchManager.startSearch(null, false, appName, null, false);
             dismiss();
             return true;
