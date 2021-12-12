diff --git a/idea/src/org/jetbrains/kotlin/idea/migration/CodeInspectionAction.java b/idea/src/org/jetbrains/kotlin/idea/migration/CodeInspectionAction.java
index 2d5f3ed..4121f82 100644
--- a/idea/src/org/jetbrains/kotlin/idea/migration/CodeInspectionAction.java
+++ b/idea/src/org/jetbrains/kotlin/idea/migration/CodeInspectionAction.java
@@ -47,7 +47,7 @@
         GlobalInspectionContextImpl inspectionContext = getGlobalInspectionContext(project);
 
         InspectionManagerEx managerEx = (InspectionManagerEx) InspectionManager.getInstance(project);
-        myExternalProfile = createMigrationProfile(managerEx, null);
+        myExternalProfile = createMigrationProfile(managerEx, null, null);
 
         inspectionContext.setExternalProfile(myExternalProfile);
         inspectionContext.setCurrentScope(scope);
