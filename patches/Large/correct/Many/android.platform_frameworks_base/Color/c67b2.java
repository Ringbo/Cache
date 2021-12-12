diff --git a/graphics/java/android/graphics/Color.java b/graphics/java/android/graphics/Color.java
index 6a4e89a..933948d 100644
--- a/graphics/java/android/graphics/Color.java
+++ b/graphics/java/android/graphics/Color.java
@@ -217,7 +217,7 @@
             }
             return (int)color;
         } else {
-            Integer color = sColorNameMap.get(colorString.toLowerCase(Locale.US));
+            Integer color = sColorNameMap.get(colorString.toLowerCase(Locale.ROOT));
             if (color != null) {
                 return color;
             }
@@ -379,7 +379,7 @@
      * @hide
      */
     public static int getHtmlColor(String color) {
-        Integer i = sColorNameMap.get(color.toLowerCase());
+        Integer i = sColorNameMap.get(color.toLowerCase(Locale.ROOT));
         if (i != null) {
             return i;
         } else {
