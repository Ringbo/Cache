diff --git a/guava-tests/test/com/google/common/collect/ComputingConcurrentHashMapTest.java b/guava-tests/test/com/google/common/collect/ComputingConcurrentHashMapTest.java
index 756ba2a..01d5f0d 100644
--- a/guava-tests/test/com/google/common/collect/ComputingConcurrentHashMapTest.java
+++ b/guava-tests/test/com/google/common/collect/ComputingConcurrentHashMapTest.java
@@ -63,7 +63,7 @@
         maker, computingFunction);
   }
 
-  private MapMaker createMapMaker() {
+  private static MapMaker createMapMaker() {
     MapMaker maker = new MapMaker();
     maker.useCustomMap = true;
     return maker;
