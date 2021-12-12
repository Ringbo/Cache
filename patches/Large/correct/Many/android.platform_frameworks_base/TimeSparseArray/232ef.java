diff --git a/core/java/android/app/usage/TimeSparseArray.java b/core/java/android/app/usage/TimeSparseArray.java
index 9ef88e4..4ec0e9e 100644
--- a/core/java/android/app/usage/TimeSparseArray.java
+++ b/core/java/android/app/usage/TimeSparseArray.java
@@ -88,7 +88,7 @@
                 key++;
                 keyIndex++;
             }
-            if (key >= origKey + 10) {
+            if (key >= origKey + 100) {
                 Slog.w(TAG, "Value " + value + " supposed to be inserted at " + origKey
                         + " displaced to " + key);
             }
