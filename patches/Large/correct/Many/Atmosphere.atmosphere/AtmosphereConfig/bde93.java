diff --git a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereConfig.java b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereConfig.java
index df61bdb..52a9305 100755
--- a/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereConfig.java
+++ b/modules/cpr/src/main/java/org/atmosphere/cpr/AtmosphereConfig.java
@@ -34,7 +34,7 @@
 
     private final List<AtmosphereHandlerConfig> atmosphereHandlerConfig = new ArrayList<AtmosphereHandlerConfig>();
 
-    private boolean supportSession = true;
+    private boolean supportSession = false;
     private String dispatcherName = DEFAULT_NAMED_DISPATCHER;
     private final AtmosphereFramework framework;
     private final Map<String, Object> properties = new HashMap<String, Object>();
