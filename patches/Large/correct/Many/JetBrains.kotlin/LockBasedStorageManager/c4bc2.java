diff --git a/core/util.runtime/src/org/jetbrains/kotlin/storage/LockBasedStorageManager.java b/core/util.runtime/src/org/jetbrains/kotlin/storage/LockBasedStorageManager.java
index c1aef61..69c0769 100644
--- a/core/util.runtime/src/org/jetbrains/kotlin/storage/LockBasedStorageManager.java
+++ b/core/util.runtime/src/org/jetbrains/kotlin/storage/LockBasedStorageManager.java
@@ -151,15 +151,15 @@
 
     @NotNull
     @Override
-    public <T> NotNullLazyValue<T> createLazyValueWithPostCompute(
-            @NotNull Function0<? extends T> computable,
-            final Function1<? super Boolean, ? extends T> onRecursiveCall,
-            @NotNull final Function1<? super T, ? extends Unit> postCompute
+    public NotNullLazyValue createLazyValueWithPostCompute(
+            @NotNull Function0 computable,
+            final Function1 onRecursiveCall,
+            @NotNull final Function1 postCompute
     ) {
-        return new LockBasedNotNullLazyValue<T>(computable) {
+        return new LockBasedNotNullLazyValue(computable) {
             @NotNull
             @Override
-            protected RecursionDetectedResult<T> recursionDetected(boolean firstTime) {
+            protected RecursionDetectedResult recursionDetected(boolean firstTime) {
                 if (onRecursiveCall == null) {
                     return super.recursionDetected(firstTime);
                 }
@@ -167,7 +167,7 @@
             }
 
             @Override
-            protected void postCompute(@NotNull T value) {
+            protected void postCompute(@NotNull Object value) {
                 postCompute.invoke(value);
             }
         };
@@ -193,12 +193,12 @@
 
     @NotNull
     @Override
-    public <T> NullableLazyValue<T> createNullableLazyValueWithPostCompute(
-            @NotNull Function0<? extends T> computable, @NotNull final Function1<? super T, ? extends Unit> postCompute
+    public NullableLazyValue createNullableLazyValueWithPostCompute(
+            @NotNull Function0 computable, @NotNull final Function1 postCompute
     ) {
-        return new LockBasedLazyValue<T>(computable) {
+        return new LockBasedLazyValue(computable) {
             @Override
-            protected void postCompute(@Nullable T value) {
+            protected void postCompute(@Nullable Object value) {
                 postCompute.invoke(value);
             }
         };
