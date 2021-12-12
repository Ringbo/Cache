diff --git a/android/guava-tests/test/com/google/common/util/concurrent/JSR166TestCase.java b/android/guava-tests/test/com/google/common/util/concurrent/JSR166TestCase.java
index edbcd8c..2da2b16 100644
--- a/android/guava-tests/test/com/google/common/util/concurrent/JSR166TestCase.java
+++ b/android/guava-tests/test/com/google/common/util/concurrent/JSR166TestCase.java
@@ -1199,7 +1199,7 @@
             assertNull(q.peek());
             assertNull(q.poll());
             assertNull(q.poll(0, MILLISECONDS));
-            assertEquals(q.toString(), "[]");
+            assertEquals("[]", q.toString());
             assertTrue(Arrays.equals(q.toArray(), new Object[0]));
             assertFalse(q.iterator().hasNext());
             try {
