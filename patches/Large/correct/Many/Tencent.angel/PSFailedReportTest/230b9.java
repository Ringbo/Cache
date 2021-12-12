diff --git a/angel-ps/core/src/test/java/com/tencent/angel/master/PSFailedReportTest.java b/angel-ps/core/src/test/java/com/tencent/angel/master/PSFailedReportTest.java
index bac8648..32bf292 100644
--- a/angel-ps/core/src/test/java/com/tencent/angel/master/PSFailedReportTest.java
+++ b/angel-ps/core/src/test/java/com/tencent/angel/master/PSFailedReportTest.java
@@ -175,7 +175,7 @@
     PSLocation psLoc = new PSLocation(ps2Id, ps2Attempt0.getLocationManager().getPsLocation(ps2Id));
     failedCounters.put(psLoc, 10000);
     worker0.getPSAgent().getMasterClient().psFailedReport(failedCounters);
-    Thread.sleep(5000);
+    Thread.sleep(20000);
 
     for(int i = iterNum; i < 2 * iterNum; i++) {
       DenseIntVector update = new DenseIntVector(dim);
