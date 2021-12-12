diff --git a/titan-core/src/main/java/com/thinkaurelius/titan/tinkerpop/rexster/RexsterTitanServer.java b/titan-core/src/main/java/com/thinkaurelius/titan/tinkerpop/rexster/RexsterTitanServer.java
index 0d50563..30e14f7 100644
--- a/titan-core/src/main/java/com/thinkaurelius/titan/tinkerpop/rexster/RexsterTitanServer.java
+++ b/titan-core/src/main/java/com/thinkaurelius/titan/tinkerpop/rexster/RexsterTitanServer.java
@@ -97,7 +97,7 @@
 
         // allow scriptengines to be configured so that folks can drop in different gremlin flavors.
         final List configuredScriptEngineNames = properties.getConfiguredScriptEngines();
-        if (configuredScriptEngineNames == null) {
+        if (configuredScriptEngineNames == null || configuredScriptEngineNames.isEmpty()) {
             // configure to default with gremlin-groovy
             log.info("No configuration for <script-engines>.  Using gremlin-groovy by default.");
             EngineController.configure(scriptEngineThreshold, scriptEngineInitFile);
