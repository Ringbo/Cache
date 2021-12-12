diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/AttributeMatchingVariantSelector.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/AttributeMatchingVariantSelector.java
index 91a7340..ce5375a 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/AttributeMatchingVariantSelector.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/artifacts/transform/AttributeMatchingVariantSelector.java
@@ -68,7 +68,7 @@
             return doSelect(producer);
         } catch (VariantSelectionException t) {
             return new BrokenResolvedArtifactSet(t);
-        } catch (Throwable t) {
+        } catch (Exception t) {
             return new BrokenResolvedArtifactSet(VariantSelectionException.selectionFailed(producer, t));
         }
     }
