diff --git a/camel-core/src/test/java/org/apache/camel/processor/DelayInterceptorTest.java b/camel-core/src/test/java/org/apache/camel/processor/DelayInterceptorTest.java
index 3dc396c..2d9e82b 100644
--- a/camel-core/src/test/java/org/apache/camel/processor/DelayInterceptorTest.java
+++ b/camel-core/src/test/java/org/apache/camel/processor/DelayInterceptorTest.java
@@ -36,7 +36,8 @@
         }
         long delta = System.currentTimeMillis() - start;
         assertTrue("Should not be that fast to run: " + delta, delta > 4000);
-        assertTrue("Should not take that long to run: " + delta, delta < 9000);
+        // some OS boxes are slow
+        assertTrue("Should not take that long to run: " + delta, delta < 11000);
     }
 
     @Override
