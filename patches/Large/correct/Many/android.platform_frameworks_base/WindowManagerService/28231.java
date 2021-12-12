diff --git a/services/java/com/android/server/WindowManagerService.java b/services/java/com/android/server/WindowManagerService.java
index c009ea2..bdabca7 100644
--- a/services/java/com/android/server/WindowManagerService.java
+++ b/services/java/com/android/server/WindowManagerService.java
@@ -2449,7 +2449,12 @@
             boolean assignLayers = false;
 
             if (imMayMove) {
-                if (moveInputMethodWindowsIfNeededLocked(false)) {
+                if (moveInputMethodWindowsIfNeededLocked(false) || displayed) {
+                    // Little hack here -- we -should- be able to rely on the
+                    // function to return true if the IME has moved and needs
+                    // its layer recomputed.  However, if the IME was hidden
+                    // and isn't actually moved in the list, its layer may be
+                    // out of data so we make sure to recompute it.
                     assignLayers = true;
                 }
             }
