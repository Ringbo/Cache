diff --git a/services/java/com/android/server/wm/InputManager.java b/services/java/com/android/server/wm/InputManager.java
index fc32d5a..ca1da95 100644
--- a/services/java/com/android/server/wm/InputManager.java
+++ b/services/java/com/android/server/wm/InputManager.java
@@ -549,7 +549,7 @@
             } catch (NumberFormatException e) {
             }
             if (result < 1) {
-                result = 60;
+                result = 55;
             }
             return result;
         }
