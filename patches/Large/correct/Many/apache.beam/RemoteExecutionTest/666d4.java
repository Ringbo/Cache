diff --git a/runners/java-fn-execution/src/test/java/org/apache/beam/runners/fnexecution/control/RemoteExecutionTest.java b/runners/java-fn-execution/src/test/java/org/apache/beam/runners/fnexecution/control/RemoteExecutionTest.java
index c8b4541..764ddca 100644
--- a/runners/java-fn-execution/src/test/java/org/apache/beam/runners/fnexecution/control/RemoteExecutionTest.java
+++ b/runners/java-fn-execution/src/test/java/org/apache/beam/runners/fnexecution/control/RemoteExecutionTest.java
@@ -174,7 +174,7 @@
 
     ExecutableProcessBundleDescriptor descriptor =
         ProcessBundleDescriptors.fromExecutableStage(
-            "my_stage", stage, components, dataServer.getApiServiceDescriptor());
+            "my_stage", stage, dataServer.getApiServiceDescriptor());
     // TODO: This cast is nonsense
     RemoteInputDestination<WindowedValue<byte[]>> remoteDestination =
         (RemoteInputDestination<WindowedValue<byte[]>>)
