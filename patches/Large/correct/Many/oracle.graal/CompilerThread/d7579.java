diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/CompilerThread.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/CompilerThread.java
index a323d9a..5863275 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/CompilerThread.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/CompilerThread.java
@@ -57,7 +57,7 @@
     public void run() {
         if (GraalOptions.Debug) {
             Debug.enable();
-            HotSpotDebugConfig hotspotDebugConfig = new HotSpotDebugConfig(GraalOptions.Log, GraalOptions.Meter, GraalOptions.Time, GraalOptions.Dump, GraalOptions.MethodFilter, GraalOptions.LogFile);
+            HotSpotDebugConfig hotspotDebugConfig = new HotSpotDebugConfig(GraalOptions.Log, GraalOptions.Meter, GraalOptions.Time, GraalOptions.Dump, GraalOptions.MethodFilter);
             Debug.setConfig(hotspotDebugConfig);
         }
         super.run();
