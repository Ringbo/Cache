diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableZip.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableZip.java
index 88a50af..eaa0e50 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableZip.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableZip.java
@@ -26,13 +26,13 @@
     
     final ObservableConsumable<? extends T>[] sources;
     final Iterable<? extends ObservableConsumable<? extends T>> sourcesIterable;
-    final Function<? super Object[], ? extends R> zipper;
+    final Function<? super T[], ? extends R> zipper;
     final int bufferSize;
     final boolean delayError;
     
     public ObservableZip(ObservableConsumable<? extends T>[] sources,
             Iterable<? extends ObservableConsumable<? extends T>> sourcesIterable,
-            Function<? super Object[], ? extends R> zipper,
+            Function<? super T[], ? extends R> zipper,
             int bufferSize,
             boolean delayError) {
         this.sources = sources;
@@ -74,21 +74,21 @@
         /** */
         private static final long serialVersionUID = 2983708048395377667L;
         final Observer<? super R> actual;
-        final Function<? super Object[], ? extends R> zipper;
+        final Function<? super T[], ? extends R> zipper;
         final ZipSubscriber<T, R>[] subscribers;
-        final Object[] row;
+        final T[] row;
         final boolean delayError;
         
         volatile boolean cancelled;
         
         @SuppressWarnings("unchecked")
         public ZipCoordinator(Observer<? super R> actual, 
-                Function<? super Object[], ? extends R> zipper, 
+                Function<? super T[], ? extends R> zipper,
                 int count, boolean delayError) {
             this.actual = actual;
             this.zipper = zipper;
             this.subscribers = new ZipSubscriber[count];
-            this.row = new Object[count];
+            this.row = (T[])new Object[count];
             this.delayError = delayError;
         }
         
@@ -140,7 +140,7 @@
             
             final ZipSubscriber<T, R>[] zs = subscribers;
             final Observer<? super R> a = actual;
-            final Object[] os = row;
+            final T[] os = row;
             final boolean delayError = this.delayError;
             
             for (;;) {
