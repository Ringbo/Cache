diff --git a/guava-tests/test/com/google/common/base/StopwatchTest.java b/guava-tests/test/com/google/common/base/StopwatchTest.java
index eb3436c..da4f15b 100644
--- a/guava-tests/test/com/google/common/base/StopwatchTest.java
+++ b/guava-tests/test/com/google/common/base/StopwatchTest.java
@@ -160,18 +160,18 @@
   public void testElapsedMillis() {
     stopwatch.start();
     ticker.advance(999999);
-    assertEquals(0, stopwatch.elapsedMillis());
+    assertEquals(0, stopwatch.elapsed(MILLISECONDS));
     ticker.advance(1);
-    assertEquals(1, stopwatch.elapsedMillis());
+    assertEquals(1, stopwatch.elapsed(MILLISECONDS));
   }
 
   public void testElapsedMillis_whileRunning() {
     ticker.advance(78000000);
     stopwatch.start();
-    assertEquals(0, stopwatch.elapsedMillis());
+    assertEquals(0, stopwatch.elapsed(MILLISECONDS));
 
     ticker.advance(345000000);
-    assertEquals(345, stopwatch.elapsedMillis());
+    assertEquals(345, stopwatch.elapsed(MILLISECONDS));
   }
 
   public void testElapsedMillis_notRunning() {
@@ -180,7 +180,7 @@
     ticker.advance(4000000);
     stopwatch.stop();
     ticker.advance(9000000);
-    assertEquals(4, stopwatch.elapsedMillis());
+    assertEquals(4, stopwatch.elapsed(MILLISECONDS));
   }
 
   public void testElapsedMillis_multipleSegments() {
@@ -191,13 +191,13 @@
     ticker.advance(16000000);
 
     stopwatch.start();
-    assertEquals(9, stopwatch.elapsedMillis());
+    assertEquals(9, stopwatch.elapsed(MILLISECONDS));
     ticker.advance(25000000);
-    assertEquals(34, stopwatch.elapsedMillis());
+    assertEquals(34, stopwatch.elapsed(MILLISECONDS));
 
     stopwatch.stop();
     ticker.advance(36000000);
-    assertEquals(34, stopwatch.elapsedMillis());
+    assertEquals(34, stopwatch.elapsed(MILLISECONDS));
   }
 
   @GwtIncompatible("String.format()")
