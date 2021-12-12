diff --git a/core/java/com/android/internal/policy/BackdropFrameRenderer.java b/core/java/com/android/internal/policy/BackdropFrameRenderer.java
index 0ab3a41..619303f 100644
--- a/core/java/com/android/internal/policy/BackdropFrameRenderer.java
+++ b/core/java/com/android/internal/policy/BackdropFrameRenderer.java
@@ -385,7 +385,7 @@
             final int size = DecorView.getNavBarSize(bottomInset, rightInset, leftInset);
             if (DecorView.isNavBarToRightEdge(bottomInset, rightInset)) {
                 mNavigationBarColor.setBounds(width - size, 0, width, height);
-            } else if (DecorView.isNavBarToLeftEdge(bottomInset, rightInset)) {
+            } else if (DecorView.isNavBarToLeftEdge(bottomInset, leftInset)) {
                 mNavigationBarColor.setBounds(0, 0, size, height);
             } else {
                 mNavigationBarColor.setBounds(0, height - size, width, height);
