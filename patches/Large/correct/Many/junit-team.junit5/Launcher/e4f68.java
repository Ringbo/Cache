diff --git a/junit-launcher/src/main/java/org/junit/gen5/launcher/Launcher.java b/junit-launcher/src/main/java/org/junit/gen5/launcher/Launcher.java
index 5610e65..ad33ccb 100644
--- a/junit-launcher/src/main/java/org/junit/gen5/launcher/Launcher.java
+++ b/junit-launcher/src/main/java/org/junit/gen5/launcher/Launcher.java
@@ -103,7 +103,7 @@
 	private RootTestDescriptor discoverRootDescriptor(TestPlanSpecification specification, String phase) {
 		RootTestDescriptor root = new RootTestDescriptor();
 		for (TestEngine testEngine : testEngineRegistry.getTestEngines()) {
-			LOG.info(() -> String.format("Discovering tests during launcher %s phase in engine '%s'.", phase,
+			LOG.fine(() -> String.format("Discovering tests during launcher %s phase in engine '%s'.", phase,
 				testEngine.getId()));
 			EngineAwareTestDescriptor engineRoot = testEngine.discoverTests(specification);
 			root.addChild(engineRoot);
