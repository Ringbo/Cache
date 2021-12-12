diff --git a/core/PApplet.java b/core/PApplet.java
index 5d0f8f4..348936a 100644
--- a/core/PApplet.java
+++ b/core/PApplet.java
@@ -2812,7 +2812,7 @@
       } else {
         Font baseFont = new Font(name, Font.PLAIN, 1);
         font = (Font)
-          deriveFontMethod.invoke(font, new Object[] { floatSize });
+          deriveFontMethod.invoke(baseFont, new Object[] { floatSize });
       }
 
     } catch (Exception e) {
@@ -3336,8 +3336,10 @@
 
 
   /**
-   * Figures out the full path for where to save things.
-   * Can be used by external libraries to save to the sketch folder.
+   * Prepend the path to the sketch folder to the filename or
+   * path that is passed in. Can be used by applets or external
+   * libraries to save to the sketch folder. Also creates any
+   * in-between folders so that things save properly.
    */
   public String savePath(String where) {
     String filename = folder + File.separator + where;
