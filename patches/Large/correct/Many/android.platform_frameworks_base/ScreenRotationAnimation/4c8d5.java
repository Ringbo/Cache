diff --git a/services/core/java/com/android/server/wm/ScreenRotationAnimation.java b/services/core/java/com/android/server/wm/ScreenRotationAnimation.java
index 08a9caa..97e9a60 100644
--- a/services/core/java/com/android/server/wm/ScreenRotationAnimation.java
+++ b/services/core/java/com/android/server/wm/ScreenRotationAnimation.java
@@ -198,7 +198,7 @@
         pw.print(prefix); pw.print("mEnterTransformation=");
                 mEnterTransformation.printShortString(pw); pw.println();
         pw.print(prefix); pw.print("mFrameTransformation=");
-                mEnterTransformation.printShortString(pw); pw.println();
+                mFrameTransformation.printShortString(pw); pw.println();
         pw.print(prefix); pw.print("mFrameInitialMatrix=");
                 mFrameInitialMatrix.printShortString(pw);
                 pw.println();
