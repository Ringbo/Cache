diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSuitesProvider.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSuitesProvider.java
index 514c219..b47d536 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSuitesProvider.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSuitesProvider.java
@@ -71,7 +71,7 @@
         return ret;
     }
 
-    private static PhaseSuite<HighTierContext> createGraphBuilderSuite() {
+    protected PhaseSuite<HighTierContext> createGraphBuilderSuite() {
         PhaseSuite<HighTierContext> suite = new PhaseSuite<>();
         suite.appendPhase(new GraphBuilderPhase(GraphBuilderConfiguration.getDefault()));
         return suite;
