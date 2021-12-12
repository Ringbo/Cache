diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/TransformFileOperation.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/TransformFileOperation.java
index be6ecd6..ac98f52 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/TransformFileOperation.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/TransformFileOperation.java
@@ -52,7 +52,7 @@
                 LOGGER.info("Executing transform {} on file {}", transform.getDisplayName(), file);
             }
             result = transform.transform(file);
-        } catch (Throwable t) {
+        } catch (Exception t) {
             failure = t;
         }
         if (!hasCachedResult) {
