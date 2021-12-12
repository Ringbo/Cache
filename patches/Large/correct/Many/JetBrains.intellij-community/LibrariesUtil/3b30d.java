diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/util/LibrariesUtil.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/util/LibrariesUtil.java
index 7fc8ba7..77d6202 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/util/LibrariesUtil.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/util/LibrariesUtil.java
@@ -59,7 +59,7 @@
     return libraries.toArray(new Library[libraries.size()]);
   }
 
-  private static void populateOrderEntries(Module module, Condition<Library> condition, ArrayList<Library> libraries, boolean exportedOnly, Set<Module> visited) {
+  private static void populateOrderEntries(@NotNull Module module, Condition<Library> condition, ArrayList<Library> libraries, boolean exportedOnly, Set<Module> visited) {
     if (!visited.add(module)) {
       return;
     }
@@ -78,7 +78,7 @@
       }
       else if (entry instanceof ModuleOrderEntry) {
         final Module dep = ((ModuleOrderEntry)entry).getModule();
-        if (module != null) {
+        if (dep != null) {
           populateOrderEntries(dep, condition, libraries, true, visited);
         }
       }
