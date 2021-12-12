diff --git a/core/util.runtime/src/org/jetbrains/kotlin/storage/LockBasedStorageManager.java b/core/util.runtime/src/org/jetbrains/kotlin/storage/LockBasedStorageManager.java
index 69c0769..c7a2869 100644
--- a/core/util.runtime/src/org/jetbrains/kotlin/storage/LockBasedStorageManager.java
+++ b/core/util.runtime/src/org/jetbrains/kotlin/storage/LockBasedStorageManager.java
@@ -151,15 +151,15 @@
 
     @NotNull
     @Override
-    public NotNullLazyValue createLazyValueWithPostCompute(
-            @NotNull Function0 computable,
-            final Function1 onRecursiveCall,
-            @NotNull final Function1 postCompute
+    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(
+            @NotNull Function0<? extends T> computable,
+            final Function1<? super Boolean, ? extends T> onRecursiveCall,
+            @NotNull final Function1<? super T, Unit> postCompute
     ) {
-        return new LockBasedNotNullLazyValue(computable) {
+        return new LockBasedNotNullLazyValue<T>(computable) {
             @NotNull
             @Override
-            protected RecursionDetectedResult recursionDetected(boolean firstTime) {
+            protected RecursionDetectedResult<T> recursionDetected(boolean firstTime) {
                 if (onRecursiveCall == null) {
                     return super.recursionDetected(firstTime);
                 }
@@ -167,7 +167,7 @@
             }
 
             @Override
-            protected void postCompute(@NotNull Object value) {
+            protected void postCompute(@NotNull T value) {
                 postCompute.invoke(value);
             }
         };
@@ -193,12 +193,12 @@
 
     @NotNull
     @Override
-    public NullableLazyValue createNullableLazyValueWithPostCompute(
-            @NotNull Function0 computable, @NotNull final Function1 postCompute
+    public <T> NullableLazyValue<T> createNullableLazyValueWithPostCompute(
+            @NotNull Function0<? extends T> computable, @NotNull final Function1<? super T, Unit> postCompute
     ) {
-        return new LockBasedLazyValue(computable) {
+        return new LockBasedLazyValue<T>(computable) {
             @Override
-            protected void postCompute(@Nullable Object value) {
+            protected void postCompute(@Nullable T value) {
                 postCompute.invoke(value);
             }
         };
