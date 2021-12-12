diff --git a/core/java/android/content/res/Configuration.java b/core/java/android/content/res/Configuration.java
index 6834ba8..5dab21b 100644
--- a/core/java/android/content/res/Configuration.java
+++ b/core/java/android/content/res/Configuration.java
@@ -1274,7 +1274,7 @@
             changed |= ActivityInfo.CONFIG_SCREEN_SIZE;
             setAppBounds(delta.appBounds);
         }
-        if (delta.assetsSeq != ASSETS_SEQ_UNDEFINED) {
+        if (delta.assetsSeq != ASSETS_SEQ_UNDEFINED && delta.assetsSeq != assetsSeq) {
             changed |= ActivityInfo.CONFIG_ASSETS_PATHS;
             assetsSeq = delta.assetsSeq;
         }
