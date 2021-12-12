diff --git a/android/app/src/main/java/com/graphhopper/android/MainActivity.java b/android/app/src/main/java/com/graphhopper/android/MainActivity.java
index b75c9b5..13c3942 100644
--- a/android/app/src/main/java/com/graphhopper/android/MainActivity.java
+++ b/android/app/src/main/java/com/graphhopper/android/MainActivity.java
@@ -439,7 +439,7 @@
             {
                 GraphHopper tmpHopp = new GraphHopper().forMobile();
                 tmpHopp.load(new File(mapsFolder, currentArea).getAbsolutePath());
-                log("found graph " + tmpHopp.getGraph().toString() + ", nodes:" + tmpHopp.getGraph().getNodes());
+                log("found graph " + tmpHopp.getGraphHopperStorage().toString() + ", nodes:" + tmpHopp.getGraphHopperStorage().getNodes());
                 hopper = tmpHopp;
                 return null;
             }
