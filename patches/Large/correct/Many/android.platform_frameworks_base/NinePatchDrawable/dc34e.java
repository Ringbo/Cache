diff --git a/graphics/java/android/graphics/drawable/NinePatchDrawable.java b/graphics/java/android/graphics/drawable/NinePatchDrawable.java
index 66f2a31..5ff49ab 100644
--- a/graphics/java/android/graphics/drawable/NinePatchDrawable.java
+++ b/graphics/java/android/graphics/drawable/NinePatchDrawable.java
@@ -692,13 +692,13 @@
                 mPadding = new Rect();
             }
             mPadding.left = Drawable.scaleFromDensity(
-                    sourcePadding.left, sourceDensity, targetDensity, false);
+                    sourcePadding.left, sourceDensity, targetDensity, true);
             mPadding.top = Drawable.scaleFromDensity(
-                    sourcePadding.top, sourceDensity, targetDensity, false);
+                    sourcePadding.top, sourceDensity, targetDensity, true);
             mPadding.right = Drawable.scaleFromDensity(
-                    sourcePadding.right, sourceDensity, targetDensity, false);
+                    sourcePadding.right, sourceDensity, targetDensity, true);
             mPadding.bottom = Drawable.scaleFromDensity(
-                    sourcePadding.bottom, sourceDensity, targetDensity, false);
+                    sourcePadding.bottom, sourceDensity, targetDensity, true);
         } else {
             mPadding = null;
         }
