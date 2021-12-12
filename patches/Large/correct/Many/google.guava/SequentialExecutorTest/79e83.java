diff --git a/android/guava-tests/test/com/google/common/util/concurrent/SequentialExecutorTest.java b/android/guava-tests/test/com/google/common/util/concurrent/SequentialExecutorTest.java
index 30f6477..dff58de 100644
--- a/android/guava-tests/test/com/google/common/util/concurrent/SequentialExecutorTest.java
+++ b/android/guava-tests/test/com/google/common/util/concurrent/SequentialExecutorTest.java
@@ -209,8 +209,9 @@
     fakePool.runAll();
 
     // Check that the interruption of a SequentialExecutor's task is restored to the thread once
-    // it is yielded.
-    assertThat(Thread.currentThread().isInterrupted()).isTrue();
+    // it is yielded. Clear the bit while checking so that the test doesn't hose JUnit or some other
+    // test case.
+    assertThat(Thread.currentThread().interrupted()).isTrue();
   }
 
   public void testInterrupt_doesNotStopExecution() {
