diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/builder/EdgeState.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/builder/EdgeState.java
index 5a5c503..3739aeb 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/builder/EdgeState.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/ivyservice/resolveengine/graph/builder/EdgeState.java
@@ -182,7 +182,7 @@
             ImmutableAttributes attributes = resolveState.getRoot().getMetadata().getAttributes();
             attributes = resolveState.getAttributesFactory().concat(attributes, getAttributes());
             targetConfigurations = dependencyMetadata.selectConfigurations(attributes, targetModuleVersion, resolveState.getAttributesSchema());
-        } catch (Throwable t) {
+        } catch (Exception t) {
             // Failure to select the target variant/configurations from this component, given the dependency attributes/metadata.
             targetNodeSelectionFailure = new ModuleVersionResolveException(dependencyState.getRequested(), t);
             return;
