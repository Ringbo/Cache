diff --git a/android/guava-tests/test/com/google/common/util/concurrent/ExecutionListTest.java b/android/guava-tests/test/com/google/common/util/concurrent/ExecutionListTest.java
index 6a14131..c60d469 100644
--- a/android/guava-tests/test/com/google/common/util/concurrent/ExecutionListTest.java
+++ b/android/guava-tests/test/com/google/common/util/concurrent/ExecutionListTest.java
@@ -42,7 +42,7 @@
     list.add(new MockRunnable(countDownLatch), exec);
     list.add(new MockRunnable(countDownLatch), exec);
     list.add(new MockRunnable(countDownLatch), exec);
-    assertEquals(countDownLatch.getCount(), 3L);
+    assertEquals(3L, countDownLatch.getCount());
 
     list.execute();
 
