diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ResolvedArtifactCollectingVisitor.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ResolvedArtifactCollectingVisitor.java
index 28bf8d8..2fe76e3 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ResolvedArtifactCollectingVisitor.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/ResolvedArtifactCollectingVisitor.java
@@ -48,7 +48,7 @@
                 File file = artifact.getFile();
                 this.artifacts.add(new DefaultResolvedArtifactResult(artifact.getId(), variantAttributes, variantName, Artifact.class, file));
             }
-        } catch (Throwable t) {
+        } catch (Exception t) {
             failures.add(t);
         }
     }
