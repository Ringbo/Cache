diff --git a/core/src/main/java/com/graphhopper/GraphHopper.java b/core/src/main/java/com/graphhopper/GraphHopper.java
index c4eccc9..7725f31 100644
--- a/core/src/main/java/com/graphhopper/GraphHopper.java
+++ b/core/src/main/java/com/graphhopper/GraphHopper.java
@@ -316,7 +316,7 @@
     public GraphHopper setCHPrepareThreads( int prepareThreads )
     {
         this.chPrepareThreads = prepareThreads;
-        this.chPreparePool = java.util.concurrent.Executors.newSingleThreadExecutor();
+        this.chPreparePool = java.util.concurrent.Executors.newFixedThreadPool(chPrepareThreads);
         return this;
     }
 
