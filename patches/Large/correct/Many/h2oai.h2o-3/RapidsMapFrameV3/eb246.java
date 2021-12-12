diff --git a/h2o-core/src/main/java/water/api/schemas3/RapidsMapFrameV3.java b/h2o-core/src/main/java/water/api/schemas3/RapidsMapFrameV3.java
index 5ce3e0e..8cced67 100644
--- a/h2o-core/src/main/java/water/api/schemas3/RapidsMapFrameV3.java
+++ b/h2o-core/src/main/java/water/api/schemas3/RapidsMapFrameV3.java
@@ -11,13 +11,13 @@
   @API(help="Frames", direction=API.Direction.OUTPUT)
   public RapidsFrameV3[] frames;
 
-  @API(help="MapKeys", direction=API.Direction.OUTPUT)
-  public RapidsStringsV3 mapKeys;
+  @API(help="Keys of the map", direction=API.Direction.OUTPUT)
+  public RapidsStringsV3 map_keys;
 
   public RapidsMapFrameV3() {}
 
   public RapidsMapFrameV3(Map<String, Frame> fr) {
-    mapKeys = new RapidsStringsV3(fr.keySet().toArray(new String[]{}));
+    map_keys = new RapidsStringsV3(fr.keySet().toArray(new String[]{}));
     int i = 0;
     Frame[] framesFromMap = fr.values().toArray(new Frame[]{});
     frames = new RapidsFrameV3[framesFromMap.length];
