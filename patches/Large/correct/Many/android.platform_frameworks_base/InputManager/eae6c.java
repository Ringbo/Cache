diff --git a/services/java/com/android/server/wm/InputManager.java b/services/java/com/android/server/wm/InputManager.java
index df7e0e1..a4f0a0c 100644
--- a/services/java/com/android/server/wm/InputManager.java
+++ b/services/java/com/android/server/wm/InputManager.java
@@ -675,7 +675,13 @@
             } catch (NumberFormatException e) {
             }
             if (result < 1) {
-                result = 55;
+                // This number equates to the refresh rate * 1.5. The rate should be at least
+                // equal to the screen refresh rate. We increase the rate by 50% to compensate for
+                // the discontinuity between the actual rate that events come in at (they do
+                // not necessarily come in constantly and are not handled synchronously).
+                // Ideally, we would use Display.getRefreshRate(), but as this does not necessarily
+                // return a sensible result, we use '60' as our default assumed refresh rate.
+                result = 90;
             }
             return result;
         }
