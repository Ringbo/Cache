diff --git a/junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderTestEngineRegistry.java b/junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderTestEngineRegistry.java
index c773335..d4b0934 100644
--- a/junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderTestEngineRegistry.java
+++ b/junit-platform-launcher/src/main/java/org/junit/platform/launcher/core/ServiceLoaderTestEngineRegistry.java
@@ -28,7 +28,7 @@
 	public Iterable<TestEngine> loadTestEngines() {
 		Iterable<TestEngine> testEngines = ServiceLoader.load(TestEngine.class,
 			ReflectionUtils.getDefaultClassLoader());
-		LOG.info(() -> createDiscoveredTestEnginesMessage(testEngines));
+		LOG.config(() -> createDiscoveredTestEnginesMessage(testEngines));
 		return testEngines;
 	}
 
