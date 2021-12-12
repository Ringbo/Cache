diff --git a/core/util.runtime/src/org/jetbrains/jet/storage/LockBasedStorageManager.java b/core/util.runtime/src/org/jetbrains/jet/storage/LockBasedStorageManager.java
index 929afec..b132d9e 100644
--- a/core/util.runtime/src/org/jetbrains/jet/storage/LockBasedStorageManager.java
+++ b/core/util.runtime/src/org/jetbrains/jet/storage/LockBasedStorageManager.java
@@ -277,7 +277,7 @@
         @Override
         public T invoke() {
             Object _value = value;
-            if (!(value instanceof NotValue)) return WrappedValues.unescapeThrowable(_value);
+            if (!(_value instanceof NotValue)) return WrappedValues.unescapeThrowable(_value);
 
             lock.lock();
             try {
