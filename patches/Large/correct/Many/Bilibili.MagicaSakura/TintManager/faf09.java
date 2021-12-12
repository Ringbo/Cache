diff --git a/magicasakura/src/main/java/com/bilibili/magicasakura/utils/TintManager.java b/magicasakura/src/main/java/com/bilibili/magicasakura/utils/TintManager.java
index 7ce65da..73f797f 100644
--- a/magicasakura/src/main/java/com/bilibili/magicasakura/utils/TintManager.java
+++ b/magicasakura/src/main/java/com/bilibili/magicasakura/utils/TintManager.java
@@ -168,7 +168,7 @@
                 if (cs != null) {
                     printLog("[getCacheDrawable] Get drawable from cache: " +
                             context.getResources().getResourceName(key));
-                    return cs.newDrawable(context.getResources());
+                    return cs.newDrawable();
                 } else {
                     mCacheDrawables.delete(key);
                 }
