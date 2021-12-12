diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/query/DefaultArtifactResolutionQuery.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/query/DefaultArtifactResolutionQuery.java
index 5b2925f..c66975e 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/query/DefaultArtifactResolutionQuery.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/query/DefaultArtifactResolutionQuery.java
@@ -140,7 +140,7 @@
             try {
                 ComponentIdentifier validId = validateComponentIdentifier(componentId);
                 componentResults.add(buildComponentResult(validId, componentMetaDataResolver, artifactResolver));
-            } catch (Throwable t) {
+            } catch (Exception t) {
                 componentResults.add(new DefaultUnresolvedComponentResult(componentId, t));
             }
         }
