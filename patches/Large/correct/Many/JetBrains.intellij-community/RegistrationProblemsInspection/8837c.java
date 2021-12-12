diff --git a/plugins/devkit/src/inspections/RegistrationProblemsInspection.java b/plugins/devkit/src/inspections/RegistrationProblemsInspection.java
index ffd0948..f37675b 100644
--- a/plugins/devkit/src/inspections/RegistrationProblemsInspection.java
+++ b/plugins/devkit/src/inspections/RegistrationProblemsInspection.java
@@ -117,7 +117,7 @@
             checkedClass.getContainingFile().getVirtualFile() != null)
     {
       final Set<PsiClass> componentClasses = RegistrationCheckerUtil.getRegistrationTypes(checkedClass, CHECK_ACTIONS);
-      if (componentClasses != null) {
+      if (componentClasses != null && !componentClasses.isEmpty()) {
         List<ProblemDescriptor> problems = null;
 
         for (PsiClass compClass : componentClasses) {
