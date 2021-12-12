diff --git a/src/test/java/rx/internal/operators/BlockingOperatorNextTest.java b/src/test/java/rx/internal/operators/BlockingOperatorNextTest.java
index 2c4b36d..e53915d 100644
--- a/src/test/java/rx/internal/operators/BlockingOperatorNextTest.java
+++ b/src/test/java/rx/internal/operators/BlockingOperatorNextTest.java
@@ -296,7 +296,7 @@
 
     @Test /* (timeout = 8000) */
     public void testSingleSourceManyIterators() throws InterruptedException {
-        Observable<Long> o = Observable.interval(10, TimeUnit.MILLISECONDS);
+        Observable<Long> o = Observable.interval(100, TimeUnit.MILLISECONDS);
         PublishSubject<Void> terminal = PublishSubject.create();
         BlockingObservable<Long> source = o.takeUntil(terminal).toBlocking();
 
