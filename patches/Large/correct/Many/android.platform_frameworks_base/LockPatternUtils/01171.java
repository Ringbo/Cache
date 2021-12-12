diff --git a/core/java/com/android/internal/widget/LockPatternUtils.java b/core/java/com/android/internal/widget/LockPatternUtils.java
index 0555f38..f6ae83c 100644
--- a/core/java/com/android/internal/widget/LockPatternUtils.java
+++ b/core/java/com/android/internal/widget/LockPatternUtils.java
@@ -1125,7 +1125,7 @@
         if (widgets == null) {
             return false;
         }
-        if (index < 0 || index >= widgets.length) {
+        if (index < 0 || index > widgets.length) {
             return false;
         }
         int[] newWidgets = new int[widgets.length + 1];
