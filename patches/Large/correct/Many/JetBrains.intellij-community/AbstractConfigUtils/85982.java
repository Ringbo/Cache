diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/config/AbstractConfigUtils.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/config/AbstractConfigUtils.java
index f7b1a90..924bc24 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/config/AbstractConfigUtils.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/config/AbstractConfigUtils.java
@@ -122,7 +122,7 @@
   }
 
   public Library[] getProjectSDKLibraries(Project project) {
-    if (project == null) return new Library[0];
+    if (project == null || project.isDisposed()) return new Library[0];
     final LibraryTable table = ProjectLibraryTable.getInstance(project);
     final List<Library> all = ContainerUtil.findAll(table.getLibraries(), LIB_SEARCH_CONDITION);
     return all.toArray(new Library[all.size()]);
