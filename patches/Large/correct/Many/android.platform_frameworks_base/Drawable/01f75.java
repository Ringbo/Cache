diff --git a/graphics/java/android/graphics/drawable/Drawable.java b/graphics/java/android/graphics/drawable/Drawable.java
index 33748ae..21b5e39 100644
--- a/graphics/java/android/graphics/drawable/Drawable.java
+++ b/graphics/java/android/graphics/drawable/Drawable.java
@@ -654,7 +654,7 @@
      * Create a drawable from an inputstream
      */
     public static Drawable createFromStream(InputStream is, String srcName) {
-        return createFromResourceStream(null, null, is, srcName);
+        return createFromResourceStream(null, null, is, srcName, null);
     }
 
     /**
@@ -663,7 +663,7 @@
      */
     public static Drawable createFromResourceStream(Resources res, TypedValue value,
             InputStream is, String srcName) {
-        return createFromResourceStream(res, value, is, srcName);
+        return createFromResourceStream(res, value, is, srcName, null);
     }
 
     /**
