diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/repositories/resolver/ExternalResourceResolver.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/repositories/resolver/ExternalResourceResolver.java
index f4fe377..90a1078 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/repositories/resolver/ExternalResourceResolver.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/repositories/resolver/ExternalResourceResolver.java
@@ -480,7 +480,7 @@
                 } else {
                     result.resolved(artifactResource.getFile());
                 }
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 result.failed(new ArtifactResolveException(artifact.getId(), e));
             }
         }
