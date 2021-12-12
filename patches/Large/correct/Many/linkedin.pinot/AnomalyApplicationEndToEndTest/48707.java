diff --git a/thirdeye/thirdeye-pinot/src/test/java/com/linkedin/thirdeye/integration/AnomalyApplicationEndToEndTest.java b/thirdeye/thirdeye-pinot/src/test/java/com/linkedin/thirdeye/integration/AnomalyApplicationEndToEndTest.java
index ebb44e0..3a73278 100644
--- a/thirdeye/thirdeye-pinot/src/test/java/com/linkedin/thirdeye/integration/AnomalyApplicationEndToEndTest.java
+++ b/thirdeye/thirdeye-pinot/src/test/java/com/linkedin/thirdeye/integration/AnomalyApplicationEndToEndTest.java
@@ -297,7 +297,7 @@
   }
 
   private void startDataCompletenessScheduler() throws Exception {
-    dataCompletenessScheduler = new DataCompletenessScheduler();
+    dataCompletenessScheduler = new DataCompletenessScheduler(collection);
     dataCompletenessScheduler.start();
   }
 
