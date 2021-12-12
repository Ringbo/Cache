diff --git a/core/src/test/java/com/graphhopper/util/InstructionListTest.java b/core/src/test/java/com/graphhopper/util/InstructionListTest.java
index 5ec2985..4a66367 100644
--- a/core/src/test/java/com/graphhopper/util/InstructionListTest.java
+++ b/core/src/test/java/com/graphhopper/util/InstructionListTest.java
@@ -345,7 +345,7 @@
         fakeList.clear();
         fakeList.add(new GPXEntry(12, 13, 11, 0));
         fakeList.add(new GPXEntry(12.5, 13, 10, 1000));
-        gpxStr = il.createGPX("test", 0, "GMT");
+        gpxStr = il.createGPX("test", 0, "GMT", true);
 
         assertTrue(gpxStr, gpxStr.contains("<ele>11.0</ele>"));
         assertFalse(gpxStr, gpxStr.contains("NaN"));
