diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index 752b2cf..5f4d055 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -7313,7 +7313,7 @@
       if (frameLoc.y < 0) {
         // Windows actually allows you to place frames where they can't be 
         // closed. Awesome. http://dev.processing.org/bugs/show_bug.cgi?id=1508
-        frame.setLocation(frameLoc.x, 20);
+        frame.setLocation(frameLoc.x, 30);
       }
 
       if (backgroundColor == Color.black) {  //BLACK) {
