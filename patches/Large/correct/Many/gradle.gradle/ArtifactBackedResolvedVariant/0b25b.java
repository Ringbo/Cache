diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/ArtifactBackedResolvedVariant.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/ArtifactBackedResolvedVariant.java
index cc0e4d4..1c27bc5 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/ArtifactBackedResolvedVariant.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/artifact/ArtifactBackedResolvedVariant.java
@@ -151,7 +151,7 @@
                 if (context != null) {
                     context.setResult(DownloadArtifactBuildOperationType.RESULT);
                 }
-            } catch (Throwable t) {
+            } catch (Exception t) {
                 owner.failure = t;
             }
         }
