diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/DefaultResolvedArtifact.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/DefaultResolvedArtifact.java
index cf7e58f..98fb36b 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/DefaultResolvedArtifact.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/DefaultResolvedArtifact.java
@@ -154,7 +154,7 @@
             try {
                 f = artifactSource.create();
                 file = f;
-            } catch (Throwable e) {
+            } catch (Exception e) {
                 err = e;
                 failure = err;
                 throw UncheckedException.throwAsUncheckedException(err);
