diff --git a/core/src/processing/core/PGraphics.java b/core/src/processing/core/PGraphics.java
index c81738b..bf3b45b 100644
--- a/core/src/processing/core/PGraphics.java
+++ b/core/src/processing/core/PGraphics.java
@@ -7653,7 +7653,7 @@
   /**
    * Version of showWarning() that takes a parsed String.
    */
-  static public void showWarning(String msg, String... args) {  // ignore
+  static public void showWarning(String msg, Object... args) {  // ignore
     showWarning(String.format(msg, args));
   }
 
