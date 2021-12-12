diff --git a/test/org/traccar/reports/ReportUtilsTest.java b/test/org/traccar/reports/ReportUtilsTest.java
index 2e01505..9a30ce3 100644
--- a/test/org/traccar/reports/ReportUtilsTest.java
+++ b/test/org/traccar/reports/ReportUtilsTest.java
@@ -14,7 +14,7 @@
         endPosition.set(Position.KEY_TOTAL_DISTANCE, 700.0);
         Assert.assertEquals(ReportUtils.calculateDistance(startPosition, endPosition), 200.0, 10);
         startPosition.set(Position.KEY_ODOMETER, 50000);
-        endPosition.set(Position.KEY_ODOMETER, 50001);
+        endPosition.set(Position.KEY_ODOMETER, 51000);
         Assert.assertEquals(ReportUtils.calculateDistance(startPosition, endPosition), 1000.0, 10);
     }
 
