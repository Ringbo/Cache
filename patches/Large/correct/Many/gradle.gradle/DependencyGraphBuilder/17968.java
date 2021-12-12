diff --git a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/DependencyGraphBuilder.java b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/DependencyGraphBuilder.java
index b55dc26..919a894 100644
--- a/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/DependencyGraphBuilder.java
+++ b/subprojects/core-impl/src/main/groovy/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/DependencyGraphBuilder.java
@@ -124,7 +124,7 @@
 
                         // A new module revision. Check for conflict
                         PotentialConflict c = conflictHandler.registerModule(module);
-                        if (c.conflictExists()) {
+                        if (!c.conflictExists()) {
                             // No conflict. Select it for now
                             LOGGER.debug("Selecting new module version {}", moduleRevision);
                             module.select(moduleRevision);
