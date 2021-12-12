diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskInputs.java b/subprojects/core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskInputs.java
index 36e1928..9a6da78 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskInputs.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/tasks/DefaultTaskInputs.java
@@ -87,7 +87,7 @@
             @Override
             public TaskInputFilePropertyBuilderInternal call() {
                 StaticValue value = new StaticValue(unpackVarargs(paths));
-                DeclaredTaskInputFileProperty fileSpec = specFactory.createInputFilesSpec(value, RUNTIME_INPUT_FILES_VALIDATOR);
+                DeclaredTaskInputFileProperty fileSpec = specFactory.createInputFilesSpec(value);
                 registeredFileProperties.add(fileSpec);
                 return fileSpec;
             }
