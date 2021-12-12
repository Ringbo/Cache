diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/TransformArtifactOperation.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/TransformArtifactOperation.java
index be3341f..147a67b 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/TransformArtifactOperation.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/TransformArtifactOperation.java
@@ -55,7 +55,7 @@
                 LOGGER.info("Executing transform {} on artifact {}", transform.getDisplayName(), artifactId.getDisplayName());
             }
             result = transform.transform(file);
-        } catch (Throwable t) {
+        } catch (Exception t) {
             failure = t;
         }
         if (!hasCachedResult) {
