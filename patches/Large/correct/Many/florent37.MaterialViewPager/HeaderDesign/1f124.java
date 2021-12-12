diff --git a/materialviewpager/src/main/java/com/github/florent37/materialviewpager/header/HeaderDesign.java b/materialviewpager/src/main/java/com/github/florent37/materialviewpager/header/HeaderDesign.java
index 1a50e63..19776b9 100644
--- a/materialviewpager/src/main/java/com/github/florent37/materialviewpager/header/HeaderDesign.java
+++ b/materialviewpager/src/main/java/com/github/florent37/materialviewpager/header/HeaderDesign.java
@@ -37,10 +37,10 @@
         return headerDesign;
     }
 
-    public static HeaderDesign fromColorResAndDrawable(@ColorRes int colorRes, String imageUrl) {
+    public static HeaderDesign fromColorResAndDrawable(@ColorRes int colorRes, Drawable drawable) {
         HeaderDesign headerDesign = new HeaderDesign();
         headerDesign.colorRes = colorRes;
-        headerDesign.imageUrl = imageUrl;
+        headerDesign.drawable = drawable;
         return headerDesign;
     }
 
