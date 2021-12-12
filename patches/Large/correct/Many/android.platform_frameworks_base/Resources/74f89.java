diff --git a/core/java/android/content/res/Resources.java b/core/java/android/content/res/Resources.java
index 1001e27..2e2c5d9 100644
--- a/core/java/android/content/res/Resources.java
+++ b/core/java/android/content/res/Resources.java
@@ -2463,7 +2463,7 @@
         final int N = cache.size();
         for (int i = N - 1; i >= 0; i--) {
             final WeakReference entry = cache.valueAt(i);
-            if (entry.get() == null) {
+            if (entry == null || entry.get() == null) {
                 cache.removeAt(i);
             }
         }
