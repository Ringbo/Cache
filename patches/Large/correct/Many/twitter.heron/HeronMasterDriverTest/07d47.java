diff --git a/heron/schedulers/tests/java/com/twitter/heron/scheduler/yarn/HeronMasterDriverTest.java b/heron/schedulers/tests/java/com/twitter/heron/scheduler/yarn/HeronMasterDriverTest.java
index 7286840..1d00607 100644
--- a/heron/schedulers/tests/java/com/twitter/heron/scheduler/yarn/HeronMasterDriverTest.java
+++ b/heron/schedulers/tests/java/com/twitter/heron/scheduler/yarn/HeronMasterDriverTest.java
@@ -188,7 +188,8 @@
     Mockito.doReturn(mockTMasterEvaluator).when(spyDriver).allocateContainer("0", 1, 1024);
 
     spyDriver.scheduleTMasterContainer();
-    Mockito.verify(spyDriver, Mockito.timeout(1000).times(1)).allocateContainer("0", 1, 1024);
+    Mockito.verify(mockTMasterEvaluator, Mockito.timeout(1000).times(1))
+        .submitContext(Mockito.any(Configuration.class));
 
     FailedEvaluator mockFailedContainer = Mockito.mock(FailedEvaluator.class);
     Mockito.when(mockFailedContainer.getId()).thenReturn("tMaster");
