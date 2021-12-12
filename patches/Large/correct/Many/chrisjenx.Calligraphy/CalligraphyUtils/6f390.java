diff --git a/calligraphy/src/main/java/uk/co/chrisjenx/calligraphy/CalligraphyUtils.java b/calligraphy/src/main/java/uk/co/chrisjenx/calligraphy/CalligraphyUtils.java
index b06c45c..f75da6d 100644
--- a/calligraphy/src/main/java/uk/co/chrisjenx/calligraphy/CalligraphyUtils.java
+++ b/calligraphy/src/main/java/uk/co/chrisjenx/calligraphy/CalligraphyUtils.java
@@ -320,7 +320,7 @@
     static boolean canCheckForToolbar() {
         if (sToolbarCheck == null) {
             try {
-                Class.forName("android.support.v7.widget.Toolbar", false, null);
+                Class.forName("android.support.v7.widget.Toolbar");
                 sToolbarCheck = Boolean.TRUE;
             } catch (ClassNotFoundException e) {
                 sToolbarCheck = Boolean.FALSE;
