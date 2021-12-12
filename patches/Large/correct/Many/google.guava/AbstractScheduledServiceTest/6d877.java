diff --git a/android/guava-tests/test/com/google/common/util/concurrent/AbstractScheduledServiceTest.java b/android/guava-tests/test/com/google/common/util/concurrent/AbstractScheduledServiceTest.java
index ff5d2c3..a0ac68a 100644
--- a/android/guava-tests/test/com/google/common/util/concurrent/AbstractScheduledServiceTest.java
+++ b/android/guava-tests/test/com/google/common/util/concurrent/AbstractScheduledServiceTest.java
@@ -91,7 +91,7 @@
     // An execution exception holds a runtime exception (from throwables.propogate) that holds our
     // original exception.
     assertEquals(service.runException, service.failureCause());
-    assertEquals(service.state(), Service.State.FAILED);
+    assertEquals(Service.State.FAILED, service.state());
   }
 
   public void testFailOnExceptionFromStartUp() {
