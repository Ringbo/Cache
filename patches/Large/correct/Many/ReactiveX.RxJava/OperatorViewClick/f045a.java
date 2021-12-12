diff --git a/rxjava-contrib/rxjava-android/src/main/java/rx/operators/OperatorViewClick.java b/rxjava-contrib/rxjava-android/src/main/java/rx/operators/OperatorViewClick.java
index 7ee7149..fb4f066 100644
--- a/rxjava-contrib/rxjava-android/src/main/java/rx/operators/OperatorViewClick.java
+++ b/rxjava-contrib/rxjava-android/src/main/java/rx/operators/OperatorViewClick.java
@@ -28,17 +28,17 @@
 import rx.functions.Action0;
 import android.view.View;
 
-public final class OperatorViewClick implements Observable.OnSubscribe<View> {
+public final class OperatorViewClick<T extends View> implements Observable.OnSubscribe<T> {
     private final boolean emitInitialValue;
-    private final View view;
+    private final T view;
 
-    public OperatorViewClick(final View view, final boolean emitInitialValue) {
+    public OperatorViewClick(final T view, final boolean emitInitialValue) {
         this.emitInitialValue = emitInitialValue;
         this.view = view;
     }
 
     @Override
-    public void call(final Subscriber<? super View> observer) {
+    public void call(final Subscriber<? super T> observer) {
         Assertions.assertUiThread();
         final CompositeOnClickListener composite = CachedListeners.getFromViewOrCreate(view);
 
