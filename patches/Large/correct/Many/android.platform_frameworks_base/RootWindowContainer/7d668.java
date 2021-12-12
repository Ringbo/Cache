diff --git a/services/core/java/com/android/server/wm/RootWindowContainer.java b/services/core/java/com/android/server/wm/RootWindowContainer.java
index b08eb18..e653e7d 100644
--- a/services/core/java/com/android/server/wm/RootWindowContainer.java
+++ b/services/core/java/com/android/server/wm/RootWindowContainer.java
@@ -431,7 +431,7 @@
             if (w.mAppOp == OP_NONE) {
                 return;
             }
-            final int mode = mService.mAppOps.checkOpNoThrow(w.mAppOp, w.getOwningUid(),
+            final int mode = mService.mAppOps.noteOpNoThrow(w.mAppOp, w.getOwningUid(),
                     w.getOwningPackage());
             w.setAppOpVisibilityLw(mode == MODE_ALLOWED || mode == MODE_DEFAULT);
         }, false /* traverseTopToBottom */);
