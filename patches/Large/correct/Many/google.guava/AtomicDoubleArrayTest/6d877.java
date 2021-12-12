diff --git a/android/guava-tests/test/com/google/common/util/concurrent/AtomicDoubleArrayTest.java b/android/guava-tests/test/com/google/common/util/concurrent/AtomicDoubleArrayTest.java
index e0d0e3b..910cd61 100644
--- a/android/guava-tests/test/com/google/common/util/concurrent/AtomicDoubleArrayTest.java
+++ b/android/guava-tests/test/com/google/common/util/concurrent/AtomicDoubleArrayTest.java
@@ -323,7 +323,7 @@
     Thread t2 = newStartedThread(c2);
     awaitTermination(t1);
     awaitTermination(t2);
-    assertEquals(c1.counts + c2.counts, SIZE * COUNTDOWN);
+    assertEquals(SIZE * COUNTDOWN, c1.counts + c2.counts);
   }
 
   /**
