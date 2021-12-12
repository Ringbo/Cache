diff --git a/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java b/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java
index bd2264a..54a7665 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/plugins/PluginDetailActivity.java
@@ -1097,7 +1097,7 @@
         if (isFinishing()) {
             return;
         }
-        if (!event.isError()) {
+        if (event.isError()) {
             handleAutomatedTransferFailed(event.error.message);
         } else{
             mDispatcher.dispatch(SiteActionBuilder.newCheckAutomatedTransferStatusAction(mSite));
@@ -1110,7 +1110,7 @@
         if (isFinishing()) {
             return;
         }
-        if (!event.isError()) {
+        if (event.isError()) {
             handleAutomatedTransferFailed(event.error.message);
         } else{
             if (event.isCompleted) {
