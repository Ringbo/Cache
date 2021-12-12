diff --git a/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/converters/TaskDisplayNameCompatibilityMapping.java b/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/converters/TaskDisplayNameCompatibilityMapping.java
index 91bf25b..5e175e5 100644
--- a/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/converters/TaskDisplayNameCompatibilityMapping.java
+++ b/subprojects/tooling-api/src/main/java/org/gradle/tooling/internal/consumer/converters/TaskDisplayNameCompatibilityMapping.java
@@ -32,7 +32,7 @@
 
     public void execute(SourceObjectMapping mapping) {
         if (GradleTask.class.isAssignableFrom(mapping.getTargetType()) && !supportsTaskDisplayName) {
-            mapping.mixIn(GradleTaskDisplayNameMixIn.class);
+            mapping.mixIn(TaskDisplayNameMixin.class);
         }
     }
 }
