diff --git a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/attributes/DefaultAttributesSchema.java b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/attributes/DefaultAttributesSchema.java
index 91932ba..03d3d65 100644
--- a/subprojects/dependency-management/src/main/java/org/gradle/api/internal/attributes/DefaultAttributesSchema.java
+++ b/subprojects/dependency-management/src/main/java/org/gradle/api/internal/attributes/DefaultAttributesSchema.java
@@ -133,7 +133,7 @@
 
         @Override
         public <T> boolean isMatching(Attribute<T> attribute, T candidate, T requested) {
-            DefaultCompatibilityCheckResult<Object> result = new DefaultCompatibilityCheckResult<Object>(candidate, requested);
+            DefaultCompatibilityCheckResult<Object> result = new DefaultCompatibilityCheckResult<Object>(requested, candidate);
             effectiveSchema.matchValue(attribute, result);
             return result.isCompatible();
         }
