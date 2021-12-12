diff --git a/core/src/test/java/com/graphhopper/util/PointListTest.java b/core/src/test/java/com/graphhopper/util/PointListTest.java
index f318763..f5314e5 100644
--- a/core/src/test/java/com/graphhopper/util/PointListTest.java
+++ b/core/src/test/java/com/graphhopper/util/PointListTest.java
@@ -80,7 +80,7 @@
         instance.add(toAdd);
 
         assertEquals(12, instance.getSize());
-        assertEquals(20, instance.getCapacity());
+        assertEquals(24, instance.getCapacity());
 
         for (int i = 0; i < toAdd.size(); i++)
         {
