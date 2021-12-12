diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/DefaultExecutionGraphDependenciesResolver.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/DefaultExecutionGraphDependenciesResolver.java
index 40e694f..d9ef472 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/DefaultExecutionGraphDependenciesResolver.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/DefaultExecutionGraphDependenciesResolver.java
@@ -80,7 +80,7 @@
         VisitedArtifactSet visitedArtifacts = results.getVisitedArtifacts();
         SelectedArtifactSet artifacts = visitedArtifacts.select(Specs.satisfyAll(), transformer.getFromAttributes(), element -> {
             return dependencies.contains(element);
-        }, true);
+        }, false);
         ResolvedFilesCollectingVisitor visitor = new ResolvedFilesCollectingVisitor();
         artifacts.visitArtifacts(visitor, false);
         if (!visitor.getFailures().isEmpty()) {
