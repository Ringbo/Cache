diff --git a/flink-runtime/src/test/java/org/apache/flink/runtime/jobmaster/JobMasterTest.java b/flink-runtime/src/test/java/org/apache/flink/runtime/jobmaster/JobMasterTest.java
index 2946d5e..b52c08c 100644
--- a/flink-runtime/src/test/java/org/apache/flink/runtime/jobmaster/JobMasterTest.java
+++ b/flink-runtime/src/test/java/org/apache/flink/runtime/jobmaster/JobMasterTest.java
@@ -108,7 +108,10 @@
 				heartbeatServices,
 				Executors.newScheduledThreadPool(1),
 				blobServer,
-				new BlobLibraryCacheManager(blobServer, FlinkUserCodeClassLoaders.ResolveOrder.CHILD_FIRST),
+				new BlobLibraryCacheManager(
+					blobServer,
+					FlinkUserCodeClassLoaders.ResolveOrder.CHILD_FIRST,
+					new String[0]),
 				mock(RestartStrategyFactory.class),
 				testingTimeout,
 				null,
@@ -212,7 +215,10 @@
 				heartbeatServices,
 				Executors.newScheduledThreadPool(1),
 				blobServer,
-				new BlobLibraryCacheManager(blobServer, FlinkUserCodeClassLoaders.ResolveOrder.CHILD_FIRST),
+				new BlobLibraryCacheManager(
+					blobServer,
+					FlinkUserCodeClassLoaders.ResolveOrder.CHILD_FIRST,
+					new String[0]),
 				mock(RestartStrategyFactory.class),
 				testingTimeout,
 				null,
