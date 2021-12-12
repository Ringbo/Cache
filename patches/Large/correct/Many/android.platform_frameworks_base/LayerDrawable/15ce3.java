diff --git a/graphics/java/android/graphics/drawable/LayerDrawable.java b/graphics/java/android/graphics/drawable/LayerDrawable.java
index 5c00a23..0095aca 100644
--- a/graphics/java/android/graphics/drawable/LayerDrawable.java
+++ b/graphics/java/android/graphics/drawable/LayerDrawable.java
@@ -1248,12 +1248,12 @@
     }
 
     @Override
-    public boolean getDither() {
+    public boolean isDither() {
         final Drawable dr = getFirstNonNullDrawable();
         if (dr != null) {
-            return dr.getDither();
+            return dr.isDither();
         } else {
-            return super.getDither();
+            return super.isDither();
         }
     }
 
