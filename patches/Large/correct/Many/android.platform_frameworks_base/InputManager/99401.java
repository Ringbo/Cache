diff --git a/services/java/com/android/server/InputManager.java b/services/java/com/android/server/InputManager.java
index e54f183..f330d40 100644
--- a/services/java/com/android/server/InputManager.java
+++ b/services/java/com/android/server/InputManager.java
@@ -48,9 +48,6 @@
 
 /*
  * Wraps the C++ InputManager and provides its callbacks.
- * 
- * XXX Tempted to promote this to a first-class service, ie. InputManagerService, to
- *     improve separation of concerns with respect to the window manager.
  */
 public class InputManager {
     static final String TAG = "InputManager";
@@ -517,7 +514,7 @@
             } catch (NumberFormatException e) {
             }
             if (result < 1) {
-                result = 35;
+                result = 60;
             }
             return result;
         }
