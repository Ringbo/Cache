diff --git a/junit-launcher/src/main/java/org/junit/gen5/launcher/Launcher.java b/junit-launcher/src/main/java/org/junit/gen5/launcher/Launcher.java
index d513a59..26cf1a2 100644
--- a/junit-launcher/src/main/java/org/junit/gen5/launcher/Launcher.java
+++ b/junit-launcher/src/main/java/org/junit/gen5/launcher/Launcher.java
@@ -99,7 +99,7 @@
 		RootTestDescriptor root = new RootTestDescriptor();
 		for (TestEngine testEngine : testEngineRegistry.getTestEngines()) {
 			if (specification.getEngineIdFilters().stream().map(
-				engineIdFilter -> engineIdFilter.filter(testEngine.getId())).anyMatch(FilterResult::isFiltered)) {
+				engineIdFilter -> engineIdFilter.filter(testEngine.getId())).anyMatch(FilterResult::isDeclined)) {
 				LOG.fine(
 					() -> String.format("Test discovery for engine '%s' was skipped due to a filter in phase '%s'.",
 						testEngine.getId(), phase));
