diff --git a/src/main/java/io/reactivex/Observable.java b/src/main/java/io/reactivex/Observable.java
index 48cad22..f637109 100644
--- a/src/main/java/io/reactivex/Observable.java
+++ b/src/main/java/io/reactivex/Observable.java
@@ -93,22 +93,22 @@
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> combineLatest(Function<? super Object[], ? extends R> combiner, boolean delayError, int bufferSize, ObservableConsumable<? extends T>... sources) {
+    public static <T, R> Observable<R> combineLatest(Function<? super T[], ? extends R> combiner, boolean delayError, int bufferSize, ObservableConsumable<? extends T>... sources) {
         return combineLatest(sources, combiner, delayError, bufferSize);
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableConsumable<? extends T>> sources, Function<? super Object[], ? extends R> combiner) {
+    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableConsumable<? extends T>> sources, Function<? super T[], ? extends R> combiner) {
         return combineLatest(sources, combiner, false, bufferSize());
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableConsumable<? extends T>> sources, Function<? super Object[], ? extends R> combiner, boolean delayError) {
+    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableConsumable<? extends T>> sources, Function<? super T[], ? extends R> combiner, boolean delayError) {
         return combineLatest(sources, combiner, delayError, bufferSize());
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableConsumable<? extends T>> sources, Function<? super Object[], ? extends R> combiner, boolean delayError, int bufferSize) {
+    public static <T, R> Observable<R> combineLatest(Iterable<? extends ObservableConsumable<? extends T>> sources, Function<? super T[], ? extends R> combiner, boolean delayError, int bufferSize) {
         Objects.requireNonNull(sources, "sources is null");
         Objects.requireNonNull(combiner, "combiner is null");
         validateBufferSize(bufferSize);
@@ -119,17 +119,17 @@
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> combineLatest(ObservableConsumable<? extends T>[] sources, Function<? super Object[], ? extends R> combiner) {
+    public static <T, R> Observable<R> combineLatest(ObservableConsumable<? extends T>[] sources, Function<? super T[], ? extends R> combiner) {
         return combineLatest(sources, combiner, false, bufferSize());
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> combineLatest(ObservableConsumable<? extends T>[] sources, Function<? super Object[], ? extends R> combiner, boolean delayError) {
+    public static <T, R> Observable<R> combineLatest(ObservableConsumable<? extends T>[] sources, Function<? super T[], ? extends R> combiner, boolean delayError) {
         return combineLatest(sources, combiner, delayError, bufferSize());
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> combineLatest(ObservableConsumable<? extends T>[] sources, Function<? super Object[], ? extends R> combiner, boolean delayError, int bufferSize) {
+    public static <T, R> Observable<R> combineLatest(ObservableConsumable<? extends T>[] sources, Function<? super T[], ? extends R> combiner, boolean delayError, int bufferSize) {
         validateBufferSize(bufferSize);
         Objects.requireNonNull(combiner, "combiner is null");
         if (sources.length == 0) {
@@ -962,7 +962,7 @@
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> zip(Iterable<? extends ObservableConsumable<? extends T>> sources, Function<? super Object[], ? extends R> zipper) {
+    public static <T, R> Observable<R> zip(Iterable<? extends ObservableConsumable<? extends T>> sources, Function<? super T[], ? extends R> zipper) {
         Objects.requireNonNull(zipper, "zipper is null");
         Objects.requireNonNull(sources, "sources is null");
         return new ObservableZip<T, R>(null, sources, zipper, bufferSize(), false);
@@ -970,7 +970,7 @@
 
     @SuppressWarnings({ "rawtypes", "unchecked" })
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> zip(ObservableConsumable<? extends ObservableConsumable<? extends T>> sources, final Function<Object[], R> zipper) {
+    public static <T, R> Observable<R> zip(ObservableConsumable<? extends ObservableConsumable<? extends T>> sources, final Function<T[], R> zipper) {
         Objects.requireNonNull(zipper, "zipper is null");
         Objects.requireNonNull(sources, "sources is null");
         // FIXME don't want to fiddle with manual type inference, this will be inlined later anyway
@@ -1073,7 +1073,7 @@
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> zipArray(Function<? super Object[], ? extends R> zipper, 
+    public static <T, R> Observable<R> zipArray(Function<? super T[], ? extends R> zipper,
             boolean delayError, int bufferSize, ObservableConsumable<? extends T>... sources) {
         if (sources.length == 0) {
             return empty();
@@ -1084,7 +1084,7 @@
     }
 
     @SchedulerSupport(SchedulerSupport.NONE)
-    public static <T, R> Observable<R> zipIterable(Function<? super Object[], ? extends R> zipper,
+    public static <T, R> Observable<R> zipIterable(Function<? super T[], ? extends R> zipper,
             boolean delayError, int bufferSize, 
             Iterable<? extends ObservableConsumable<? extends T>> sources) {
         Objects.requireNonNull(zipper, "zipper is null");
