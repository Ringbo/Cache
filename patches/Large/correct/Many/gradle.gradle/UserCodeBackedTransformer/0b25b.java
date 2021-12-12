diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/UserCodeBackedTransformer.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/UserCodeBackedTransformer.java
index 51cce8e..611c5e5 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/UserCodeBackedTransformer.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/UserCodeBackedTransformer.java
@@ -87,7 +87,7 @@
         try {
             File absoluteFile = input.getAbsoluteFile();
             return transformedFileCache.getResult(absoluteFile, inputsHash, transformer);
-        } catch (Throwable t) {
+        } catch (Exception t) {
             throw new ArtifactTransformException(input, to, transformer.getImplementationClass(), t);
         }
     }
