diff --git a/services/core/java/com/android/server/wm/TaskStack.java b/services/core/java/com/android/server/wm/TaskStack.java
index 3430ac9..446b74b 100644
--- a/services/core/java/com/android/server/wm/TaskStack.java
+++ b/services/core/java/com/android/server/wm/TaskStack.java
@@ -720,9 +720,9 @@
                 }
             } else {
                 if (splitHorizontally) {
-                    outBounds.left = position - dockDividerWidth;
+                    outBounds.left = position + dockDividerWidth;
                 } else {
-                    outBounds.top = position - dockDividerWidth;
+                    outBounds.top = position + dockDividerWidth;
                 }
             }
             return;
