diff --git a/it/it-tests/src/test/java/qualitygate/QualityGateNotificationTest.java b/it/it-tests/src/test/java/qualitygate/QualityGateNotificationTest.java
index 582cb58..70467ae 100644
--- a/it/it-tests/src/test/java/qualitygate/QualityGateNotificationTest.java
+++ b/it/it-tests/src/test/java/qualitygate/QualityGateNotificationTest.java
@@ -43,7 +43,7 @@
     .build();
 
   @Before
-  public void cleanUp() throws Exception {
+  public void cleanUp() {
     orchestrator.resetData();
   }
 
