diff --git a/core/java/android/app/Dialog.java b/core/java/android/app/Dialog.java
index 087753b..82186dd 100644
--- a/core/java/android/app/Dialog.java
+++ b/core/java/android/app/Dialog.java
@@ -931,7 +931,7 @@
 
         // associate search with owner activity
         final ComponentName appName = getAssociatedActivity();
-        if (appName != null) {
+        if (appName != null && searchManager.getSearchableInfo(appName) != null) {
             searchManager.startSearch(null, false, appName, null, false);
             dismiss();
             return true;
