diff --git a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/daemon/LibraryProjectStructureElement.java b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/daemon/LibraryProjectStructureElement.java
index 3790ec9..b8b02cd 100644
--- a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/daemon/LibraryProjectStructureElement.java
+++ b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/projectRoot/daemon/LibraryProjectStructureElement.java
@@ -54,10 +54,10 @@
   }
 
   private void reportInvalidRoots(ProjectStructureProblemsHolder problemsHolder, LibraryEx library,
-                                  final OrderRootType type, Object rootName, final ProjectStructureProblemType problemType) {
+                                  final OrderRootType type, String rootName, final ProjectStructureProblemType problemType) {
     final List<String> invalidUrls = library.getInvalidRootUrls(type);
     if (!invalidUrls.isEmpty()) {
-      final String description = createInvalidRootsDescription(invalidUrls, library.getName());
+      final String description = createInvalidRootsDescription(invalidUrls, rootName, library.getName());
       final PlaceInProjectStructure place = createPlace();
       final String message = ProjectBundle.message("project.roots.error.message.invalid.roots", rootName, invalidUrls.size());
       ProjectStructureProblemDescription.ProblemLevel level = library.getTable().getTableLevel().equals(LibraryTablesRegistrar.PROJECT_LEVEL)
@@ -68,10 +68,10 @@
     }
   }
 
-  private static String createInvalidRootsDescription(List<String> invalidClasses, String libraryName) {
+  private static String createInvalidRootsDescription(List<String> invalidClasses, String rootName, String libraryName) {
     StringBuilder buffer = new StringBuilder();
     buffer.append("<html>");
-    buffer.append("Library '").append(libraryName).append("' has broken " + StringUtil.pluralize("path", invalidClasses.size()) + ":");
+    buffer.append("Library '").append(libraryName).append("' has broken " + rootName + " " + StringUtil.pluralize("path", invalidClasses.size()) + ":");
     for (String url : invalidClasses) {
       buffer.append("<br>&nbsp;&nbsp;");
       buffer.append(PathUtil.toPresentableUrl(url));
