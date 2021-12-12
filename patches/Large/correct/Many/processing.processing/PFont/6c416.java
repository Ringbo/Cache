diff --git a/android/core/src/processing/core/PFont.java b/android/core/src/processing/core/PFont.java
index df263f6..7e71bed 100644
--- a/android/core/src/processing/core/PFont.java
+++ b/android/core/src/processing/core/PFont.java
@@ -438,7 +438,7 @@
   /**
    * Return the native Typeface object associated with this PFont (if any).
    */
-  public Typeface getNative() {
+  public Object getNative() {
     if (subsetting) {
       return null;
     }
