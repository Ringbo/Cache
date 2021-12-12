diff --git a/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/HybridClusterIntegrationTestCommandLineRunner.java b/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/HybridClusterIntegrationTestCommandLineRunner.java
index f420a2f..6b0a9e0 100644
--- a/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/HybridClusterIntegrationTestCommandLineRunner.java
+++ b/pinot-integration-tests/src/test/java/com/linkedin/pinot/integration/tests/HybridClusterIntegrationTestCommandLineRunner.java
@@ -233,7 +233,7 @@
 
     @Override
     protected int getRealtimeSegmentFlushSize(boolean useLlc) {
-      return super.getRealtimeSegmentFlushSize(useLlc) * 10;
+      return super.getRealtimeSegmentFlushSize(useLlc) * 100;
     }
 
     @Override
