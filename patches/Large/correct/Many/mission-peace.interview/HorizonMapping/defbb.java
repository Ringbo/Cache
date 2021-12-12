diff --git a/src/com/interview/misc/HorizonMapping.java b/src/com/interview/misc/HorizonMapping.java
index 2c9f2a4..2851f69 100644
--- a/src/com/interview/misc/HorizonMapping.java
+++ b/src/com/interview/misc/HorizonMapping.java
@@ -32,9 +32,9 @@
         stack.offerFirst(intervals[0]);
         for (int i = 1; i < intervals.length; i++) {
             Interval curr = stack.peekFirst();
-            if (curr.end <= intervals[i].start) {
+            if (curr.end < intervals[i].start) {
                 stack.offerFirst(intervals[i]);
-            } else if (curr.end > intervals[i].start) {
+            } else if (curr.end >= intervals[i].start) {
                 Interval newInterval = mergeOverlap(curr, intervals[i]);
                 if (newInterval != null) {
                     stack.offerFirst(newInterval);
@@ -71,7 +71,7 @@
     public static void main(String args[]) {
         Interval intervals[] = new Interval[6];
         intervals[0] = new Interval(0, 2, 3);
-        intervals[1] = new Interval(2, 6, 5);
+        intervals[1] = new Interval(2, 6, 3);
         intervals[2] = new Interval(4, 8, 8);
         intervals[3] = new Interval(5, 9, 10);
         intervals[4] = new Interval(6, 10, 9);
