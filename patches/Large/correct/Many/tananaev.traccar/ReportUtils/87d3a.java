diff --git a/src/org/traccar/reports/ReportUtils.java b/src/org/traccar/reports/ReportUtils.java
index 705f114..71c567c 100644
--- a/src/org/traccar/reports/ReportUtils.java
+++ b/src/org/traccar/reports/ReportUtils.java
@@ -89,16 +89,16 @@
         return distance;
     }
 
-    public static String calculateFuel(Position firstPosition, Position lastPosition) {
+    public static double calculateFuel(Position firstPosition, Position lastPosition) {
 
         if (firstPosition.getAttributes().get(Position.KEY_FUEL_LEVEL) != null
                 && lastPosition.getAttributes().get(Position.KEY_FUEL_LEVEL) != null) {
 
             BigDecimal value = new BigDecimal(firstPosition.getDouble(Position.KEY_FUEL_LEVEL)
                     - lastPosition.getDouble(Position.KEY_FUEL_LEVEL));
-            return value.setScale(1, RoundingMode.HALF_EVEN).toString();
+            return value.setScale(1, RoundingMode.HALF_EVEN).doubleValue();
         }
-        return null;
+        return 0;
     }
 
     public static org.jxls.common.Context initializeContext(long userId) {
