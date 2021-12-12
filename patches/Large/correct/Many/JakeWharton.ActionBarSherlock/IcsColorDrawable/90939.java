diff --git a/library/src/com/actionbarsherlock/internal/widget/IcsColorDrawable.java b/library/src/com/actionbarsherlock/internal/widget/IcsColorDrawable.java
index a78b3f7..1759b62 100644
--- a/library/src/com/actionbarsherlock/internal/widget/IcsColorDrawable.java
+++ b/library/src/com/actionbarsherlock/internal/widget/IcsColorDrawable.java
@@ -26,7 +26,7 @@
     @Override
     public void setAlpha(int alpha) {
         if (alpha != (color >>> 24)) {
-            color = (color & 0x00FFFFFF) & (alpha << 24);
+            color = (color & 0x00FFFFFF) | (alpha << 24);
             invalidateSelf();
         }
     }
