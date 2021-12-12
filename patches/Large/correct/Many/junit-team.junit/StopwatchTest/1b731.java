diff --git a/src/test/java/org/junit/tests/experimental/rules/StopwatchTest.java b/src/test/java/org/junit/tests/experimental/rules/StopwatchTest.java
index 4c5df33..35630e2 100644
--- a/src/test/java/org/junit/tests/experimental/rules/StopwatchTest.java
+++ b/src/test/java/org/junit/tests/experimental/rules/StopwatchTest.java
@@ -105,9 +105,9 @@
         @Test
         public void duration() throws InterruptedException {
             Thread.sleep(300L);
-            assertEquals(fStopwatch.runtime(MILLISECONDS), 300d, 100d);
+            assertEquals(300d, fStopwatch.runtime(MILLISECONDS), 100d);
             Thread.sleep(500L);
-            assertEquals(fStopwatch.runtime(MILLISECONDS), 800d, 250d);
+            assertEquals(800d, fStopwatch.runtime(MILLISECONDS), 250d);
         }
     }
 
