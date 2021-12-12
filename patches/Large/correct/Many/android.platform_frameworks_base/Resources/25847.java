diff --git a/core/java/android/content/res/Resources.java b/core/java/android/content/res/Resources.java
index ab0dad7..1001e27 100644
--- a/core/java/android/content/res/Resources.java
+++ b/core/java/android/content/res/Resources.java
@@ -2445,7 +2445,7 @@
             LongSparseArray<WeakReference<ConstantState>>> caches) {
         final int N = caches.size();
         for (int i = N - 1; i >= 0; i--) {
-            final LongSparseArray<WeakReference<ConstantState>> cache = caches.get(i);
+            final LongSparseArray<WeakReference<ConstantState>> cache = caches.valueAt(i);
             if (pruneCache(cache)) {
                 caches.removeAt(i);
             }
