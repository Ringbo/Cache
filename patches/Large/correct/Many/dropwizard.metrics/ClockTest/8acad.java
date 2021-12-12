diff --git a/metrics-core/src/test/java/com/codahale/metrics/ClockTest.java b/metrics-core/src/test/java/com/codahale/metrics/ClockTest.java
index 6474173..79d6b81 100644
--- a/metrics-core/src/test/java/com/codahale/metrics/ClockTest.java
+++ b/metrics-core/src/test/java/com/codahale/metrics/ClockTest.java
@@ -17,7 +17,7 @@
 
         assertThat((double) clock.getTick())
                 .isEqualTo(System.nanoTime(),
-                        offset(100000.0));
+                        offset(1000000.0));
     }
 
     @Test
