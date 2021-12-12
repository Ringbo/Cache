diff --git a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/classpath/CreateModuleLibraryChooser.java b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/classpath/CreateModuleLibraryChooser.java
index 43a9d08..1744c09 100644
--- a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/classpath/CreateModuleLibraryChooser.java
+++ b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/classpath/CreateModuleLibraryChooser.java
@@ -197,7 +197,7 @@
     }
 
     final List<Library> addedLibraries = new ArrayList<Library>();
-    Map<VirtualFile, List<OrderRoot>> byFile = roots.stream().collect(Collectors.groupingBy(OrderRoot::getFile));
+    Map<VirtualFile, List<OrderRoot>> byFile = roots.stream().collect(Collectors.groupingBy(OrderRoot::getFile, LinkedHashMap::new, Collectors.toList()));
     Predicate<List<OrderRoot>> containsClasses = it -> it.stream().anyMatch(root -> root.getType().equals(OrderRootType.CLASSES));
     if (byFile.values().stream().allMatch(containsClasses)) {
       for (List<OrderRoot> rootsForFile : byFile.values()) {
