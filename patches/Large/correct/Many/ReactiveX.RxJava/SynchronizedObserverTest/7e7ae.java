diff --git a/rxjava-core/src/test/java/rx/observers/SynchronizedObserverTest.java b/rxjava-core/src/test/java/rx/observers/SynchronizedObserverTest.java
index aad021d..e3b7a6d 100644
--- a/rxjava-core/src/test/java/rx/observers/SynchronizedObserverTest.java
+++ b/rxjava-core/src/test/java/rx/observers/SynchronizedObserverTest.java
@@ -361,14 +361,14 @@
 
             // 12000 + 5000 + 75000 + 13500 + 22000 + 15000 + 7500 + 23500 = 173500
 
-            Future<?> f10 = tp.submit(new CompletionThread(w, TestConcurrencyObserverEvent.onCompleted, f1, f2, f3, f4));
+            Future<?> f10 = tp.submit(new CompletionThread(w, TestConcurrencyObserverEvent.onCompleted, f1, f2, f3, f4, f5, f6, f7, f8));
             try {
                 Thread.sleep(1);
             } catch (InterruptedException e) {
                 // ignore
             }
 
-            waitOnThreads(f1, f2, f3, f4, f5, f6, f7, f8, f10);
+            waitOnThreads(f10);
             @SuppressWarnings("unused")
             int numNextEvents = tw.assertEvents(null); // no check of type since we don't want to test barging results here, just interleaving behavior
             assertEquals(173500, numNextEvents);
