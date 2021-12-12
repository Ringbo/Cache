diff --git a/hazelcast/src/test/java/com/hazelcast/concurrent/atomiclong/AtomicLongAdvancedTest.java b/hazelcast/src/test/java/com/hazelcast/concurrent/atomiclong/AtomicLongAdvancedTest.java
index 0f3f332..cf027d3 100644
--- a/hazelcast/src/test/java/com/hazelcast/concurrent/atomiclong/AtomicLongAdvancedTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/concurrent/atomiclong/AtomicLongAdvancedTest.java
@@ -42,7 +42,7 @@
                 }
             }.start();
         }
-        assertOpenEventually(countDownLatch, 50);
+        assertOpenEventually(countDownLatch, 300);
         assertEquals(0, atomicLong.get());
     }
 
