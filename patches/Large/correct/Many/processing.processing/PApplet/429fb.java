diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index fc176ce..3554a2b 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -658,7 +658,7 @@
    * @see PApplet#keyReleased()
    */
   public boolean keyPressed;
-  int keyPressedCount;
+  public int keyPressedCount;
 
   /**
    * The last KeyEvent object passed into a mouse function.
@@ -2941,7 +2941,7 @@
       break;
     case KeyEvent.RELEASE:
       keyPressedCount--;
-      keyPressed = (keyPressedCount == 0);
+      keyPressed = (keyPressedCount > 0);
       keyReleased(keyEvent);
       break;
     case KeyEvent.TYPE:
