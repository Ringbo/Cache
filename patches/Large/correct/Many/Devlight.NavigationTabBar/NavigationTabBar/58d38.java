diff --git a/navigationtabbar/src/main/java/devlight/io/library/ntb/NavigationTabBar.java b/navigationtabbar/src/main/java/devlight/io/library/ntb/NavigationTabBar.java
index 5c824ed..934232f 100644
--- a/navigationtabbar/src/main/java/devlight/io/library/ntb/NavigationTabBar.java
+++ b/navigationtabbar/src/main/java/devlight/io/library/ntb/NavigationTabBar.java
@@ -1921,7 +1921,7 @@
             else return (float) (Math.pow(input, 2.0F * FACTOR));
         }
 
-        float getResizeInterpolation(final float input, final boolean resizeIn) {
+        private float getResizeInterpolation(final float input, final boolean resizeIn) {
             mResizeIn = resizeIn;
             return getInterpolation(input);
         }
