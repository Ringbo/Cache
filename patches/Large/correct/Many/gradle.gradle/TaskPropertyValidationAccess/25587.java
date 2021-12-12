diff --git a/subprojects/core/src/main/java/org/gradle/api/internal/project/taskfactory/TaskPropertyValidationAccess.java b/subprojects/core/src/main/java/org/gradle/api/internal/project/taskfactory/TaskPropertyValidationAccess.java
index c6a82a3..0ab8d95 100644
--- a/subprojects/core/src/main/java/org/gradle/api/internal/project/taskfactory/TaskPropertyValidationAccess.java
+++ b/subprojects/core/src/main/java/org/gradle/api/internal/project/taskfactory/TaskPropertyValidationAccess.java
@@ -27,7 +27,7 @@
 public class TaskPropertyValidationAccess {
     @SuppressWarnings("unused")
     public static void collectTaskValidationProblems(Class<?> task, Map<String, Boolean> problems) {
-        TaskClassInfoStore infoStore = new DefaultTaskClassInfoStore(new DefaultTaskClassValidatorExtractor(new ClasspathPropertyAnnotationHandler()));
+        TaskClassInfoStore infoStore = new DefaultTaskClassInfoStore(new DefaultTaskClassValidatorExtractor(new ClasspathPropertyAnnotationHandler(), new CompileClasspathPropertyAnnotationHandler()));
         TaskClassInfo info = infoStore.getTaskClassInfo(Cast.<Class<? extends Task>>uncheckedCast(task));
         for (String nonAnnotatedPropertyName : info.getNonAnnotatedPropertyNames()) {
             problems.put(String.format("Task type '%s' declares property that is not annotated: '%s'.", task.getName(), nonAnnotatedPropertyName), Boolean.FALSE);
