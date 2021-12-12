diff --git a/web/src/main/java/com/navercorp/pinpoint/web/vo/chart/TimeSeriesChartBuilder.java b/web/src/main/java/com/navercorp/pinpoint/web/vo/chart/TimeSeriesChartBuilder.java
index dc00de3..15b47c4 100644
--- a/web/src/main/java/com/navercorp/pinpoint/web/vo/chart/TimeSeriesChartBuilder.java
+++ b/web/src/main/java/com/navercorp/pinpoint/web/vo/chart/TimeSeriesChartBuilder.java
@@ -30,9 +30,9 @@
 public class TimeSeriesChartBuilder<P extends Point> {
 
     private final TimeWindow timeWindow;
-    private final Point.UncollectedPointCreater<P> uncollectedPointCreater;
+    private final Point.UncollectedPointCreator<P> uncollectedPointCreator;
 
-    public TimeSeriesChartBuilder(TimeWindow timeWindow, Point.UncollectedPointCreater<P> uncollectedPointCreator) {
+    public TimeSeriesChartBuilder(TimeWindow timeWindow, Point.UncollectedPointCreator<P> uncollectedPointCreator) {
         if (timeWindow.getWindowRangeCount() > Integer.MAX_VALUE) {
             throw new IllegalArgumentException("range yields too many timeslots");
         }
@@ -40,7 +40,7 @@
             throw new NullPointerException("uncollectedPointCreator must not be null");
         }
         this.timeWindow = timeWindow;
-        this.uncollectedPointCreater = uncollectedPointCreator;
+        this.uncollectedPointCreator = uncollectedPointCreator;
     }
 
     public Chart<P> build(List<P> sampledPoints) {
@@ -62,7 +62,7 @@
         int numTimeslots = (int) this.timeWindow.getWindowRangeCount();
         List<P> points = new ArrayList<>(numTimeslots);
         for (long timestamp : this.timeWindow) {
-            points.add(uncollectedPointCreater.createUnCollectedPoint(timestamp));
+            points.add(uncollectedPointCreator.createUnCollectedPoint(timestamp));
         }
         return points;
     }
