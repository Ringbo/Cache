diff --git a/services/core/java/com/android/server/wm/TaskStack.java b/services/core/java/com/android/server/wm/TaskStack.java
index 446b74b..1475686 100644
--- a/services/core/java/com/android/server/wm/TaskStack.java
+++ b/services/core/java/com/android/server/wm/TaskStack.java
@@ -910,7 +910,7 @@
         // Calculate the content bounds excluding the area occupied by IME
         getDisplayContent().getContentRect(displayContentRect);
         contentBounds.set(displayContentRect);
-        int imeTop = Math.max(imeWin.getDisplayFrameLw().top, contentBounds.top);
+        int imeTop = Math.max(imeWin.getFrameLw().top, contentBounds.top);
 
         // if IME window is animating, get its actual vertical shown position (but no smaller than
         // the final target vertical position)
