diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskInputs.java b/subprojects/core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskInputs.java
index 19ad538..5f6b6bb 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskInputs.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskInputs.java
@@ -154,7 +154,7 @@
     }
 
     private TaskInputFilePropertyBuilderInternal addSpec(ValidatingValue paths, ValidationAction validationAction) {
-        DefaultDeclaredTaskInputFileFilePropertySpec spec = new DefaultDeclaredTaskInputFileFilePropertySpec(task.getName(), resolver, paths, validationAction);
+        DefaultDeclaredTaskInputFilePropertySpec spec = new DefaultDeclaredTaskInputFilePropertySpec(task.getName(), resolver, paths, validationAction);
         declaredFileProperties.add(spec);
         return spec;
     }
