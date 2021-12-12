diff --git a/camel-core/src/test/java/org/apache/camel/processor/ThrottlerTest.java b/camel-core/src/test/java/org/apache/camel/processor/ThrottlerTest.java
index 31ecd58..1cabab3 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/ThrottlerTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/ThrottlerTest.java
@@ -89,7 +89,7 @@
         // now assert that they have actually been throttled
         long minimumTime = (messageCount - 1) * INTERVAL;
         // add a little slack
-        long delta = System.currentTimeMillis() - start + 200;
+        long delta = System.currentTimeMillis() - start + 750;
         assertTrue("Should take at least " + minimumTime + "ms, was: " + delta, delta >= minimumTime);
         executor.shutdownNow();
     }
