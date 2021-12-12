diff --git a/android/guava/src/com/google/common/util/concurrent/Striped.java b/android/guava/src/com/google/common/util/concurrent/Striped.java
index cd43294..36fa929 100644
--- a/android/guava/src/com/google/common/util/concurrent/Striped.java
+++ b/android/guava/src/com/google/common/util/concurrent/Striped.java
@@ -321,9 +321,9 @@
     private final Lock delegate;
 
     @SuppressWarnings("unused")
-    private final Object strongReference;
+    private final WeakSafeReadWriteLock strongReference;
 
-    WeakSafeLock(Lock delegate, Object strongReference) {
+    WeakSafeLock(Lock delegate, WeakSafeReadWriteLock strongReference) {
       this.delegate = delegate;
       this.strongReference = strongReference;
     }
@@ -344,9 +344,9 @@
     private final Condition delegate;
 
     @SuppressWarnings("unused")
-    private final Object strongReference;
+    private final WeakSafeReadWriteLock strongReference;
 
-    WeakSafeCondition(Condition delegate, Object strongReference) {
+    WeakSafeCondition(Condition delegate, WeakSafeReadWriteLock strongReference) {
       this.delegate = delegate;
       this.strongReference = strongReference;
     }
