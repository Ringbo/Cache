diff --git a/spock-core/src/main/java/org/spockframework/runtime/BaseSpecRunner.java b/spock-core/src/main/java/org/spockframework/runtime/BaseSpecRunner.java
index ed3714c..95f09eb 100755
--- a/spock-core/src/main/java/org/spockframework/runtime/BaseSpecRunner.java
+++ b/spock-core/src/main/java/org/spockframework/runtime/BaseSpecRunner.java
@@ -228,7 +228,7 @@
     NameProvider<IterationInfo> nameProvider = SafeNameProvider.create(currentFeature.getIterationNameProvider(), currentFeature.getName());
     String iterationName = nameProvider.getName(currentIteration);
     currentIteration.setName(iterationName);
-    currentIteration.setDescription(Description.createTestDescription(spec.getClass(),
+    currentIteration.setDescription(Description.createTestDescription(spec.getReflection(),
         iterationName, currentFeature.getFeatureMethod().getReflection().getAnnotations()));
     return currentIteration;
   }
