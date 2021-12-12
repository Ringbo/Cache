diff --git a/core/java/android/content/res/Configuration.java b/core/java/android/content/res/Configuration.java
index be31d1b..9b4ad73 100644
--- a/core/java/android/content/res/Configuration.java
+++ b/core/java/android/content/res/Configuration.java
@@ -1291,7 +1291,7 @@
             changed |= ActivityInfo.CONFIG_SCREEN_SIZE;
             setAppBounds(delta.appBounds);
         }
-        if (delta.assetsSeq != ASSETS_SEQ_UNDEFINED) {
+        if (delta.assetsSeq != ASSETS_SEQ_UNDEFINED && delta.assetsSeq != assetsSeq) {
             changed |= ActivityInfo.CONFIG_ASSETS_PATHS;
             assetsSeq = delta.assetsSeq;
         }
