diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableCombineLatest.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableCombineLatest.java
index 8e10d7f..6a382d3 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableCombineLatest.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableCombineLatest.java
@@ -29,13 +29,13 @@
 public final class ObservableCombineLatest<T, R> extends Observable<R> {
     final ObservableConsumable<? extends T>[] sources;
     final Iterable<? extends ObservableConsumable<? extends T>> sourcesIterable;
-    final Function<? super Object[], ? extends R> combiner;
+    final Function<? super T[], ? extends R> combiner;
     final int bufferSize;
     final boolean delayError;
     
     public ObservableCombineLatest(ObservableConsumable<? extends T>[] sources,
             Iterable<? extends ObservableConsumable<? extends T>> sourcesIterable,
-            Function<? super Object[], ? extends R> combiner, int bufferSize,
+            Function<? super T[], ? extends R> combiner, int bufferSize,
             boolean delayError) {
         this.sources = sources;
         this.sourcesIterable = sourcesIterable;
@@ -77,11 +77,11 @@
         /** */
         private static final long serialVersionUID = 8567835998786448817L;
         final Observer<? super R> actual;
-        final Function<? super Object[], ? extends R> combiner;
+        final Function<? super T[], ? extends R> combiner;
         final int count;
         final CombinerSubscriber<T, R>[] subscribers;
         final int bufferSize;
-        final Object[] latest;
+        final T[] latest;
         final SpscLinkedArrayQueue<Object> queue;
         final boolean delayError;
         
@@ -96,14 +96,14 @@
         
         @SuppressWarnings("unchecked")
         public LatestCoordinator(Observer<? super R> actual, 
-                Function<? super Object[], ? extends R> combiner, 
+                Function<? super T[], ? extends R> combiner,
                 int count, int bufferSize, boolean delayError) {
             this.actual = actual;
             this.combiner = combiner;
             this.count = count;
             this.bufferSize = bufferSize;
             this.delayError = delayError;
-            this.latest = new Object[count];
+            this.latest = (T[])new Object[count];
             this.subscribers = new CombinerSubscriber[count];
             this.queue = new SpscLinkedArrayQueue<Object>(bufferSize);
         }
@@ -167,7 +167,7 @@
                     return;
                 }
                 len = latest.length;
-                Object o = latest[index];
+                T o = latest[index];
                 a = active;
                 if (o == null) {
                     active = ++a;
@@ -230,7 +230,9 @@
                     }
 
                     q.poll();
-                    Object[] array = (Object[])q.poll();
+
+                    @SuppressWarnings("unchecked")
+                    T[] array = (T[])q.poll();
                     
                     if (array == null) {
                         cancelled = true;
