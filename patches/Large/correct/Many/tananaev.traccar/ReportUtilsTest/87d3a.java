diff --git a/test/org/traccar/reports/ReportUtilsTest.java b/test/org/traccar/reports/ReportUtilsTest.java
index 2fe05e6..adcdf58 100644
--- a/test/org/traccar/reports/ReportUtilsTest.java
+++ b/test/org/traccar/reports/ReportUtilsTest.java
@@ -60,10 +60,10 @@
     public void testCalculateSpentFuel() {
         Position startPosition = new Position();
         Position endPosition = new Position();
-        Assert.assertNull(ReportUtils.calculateFuel(startPosition, endPosition));
+        Assert.assertEquals(ReportUtils.calculateFuel(startPosition, endPosition), 0.0, 0.01);
         startPosition.set(Position.KEY_FUEL_LEVEL, 0.7);
         endPosition.set(Position.KEY_FUEL_LEVEL, 0.5);
-        Assert.assertEquals(ReportUtils.calculateFuel(startPosition, endPosition), "0.2");
+        Assert.assertEquals(ReportUtils.calculateFuel(startPosition, endPosition), 0.2, 0.01);
     }
 
     @Test
