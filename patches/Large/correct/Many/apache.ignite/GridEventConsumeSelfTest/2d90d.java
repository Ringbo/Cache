diff --git a/modules/core/src/test/java/org/apache/ignite/internal/processors/continuous/GridEventConsumeSelfTest.java b/modules/core/src/test/java/org/apache/ignite/internal/processors/continuous/GridEventConsumeSelfTest.java
index bca784b..7a9bd3a 100644
--- a/modules/core/src/test/java/org/apache/ignite/internal/processors/continuous/GridEventConsumeSelfTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/internal/processors/continuous/GridEventConsumeSelfTest.java
@@ -871,7 +871,7 @@
 
         stopGrid("anotherGrid");
 
-        latch.await();
+        assert latch.await(3000, MILLISECONDS);
     }
 
     /**
@@ -917,7 +917,7 @@
 
         stopGrid("anotherGrid");
 
-        discoLatch.await();
+        discoLatch.await(3000, MILLISECONDS);
 
         grid(0).compute().broadcast(F.noop());
 
