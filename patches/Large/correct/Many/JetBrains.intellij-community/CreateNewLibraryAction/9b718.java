diff --git a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/libraryEditor/CreateNewLibraryAction.java b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/libraryEditor/CreateNewLibraryAction.java
index ff1b722..42861a4 100644
--- a/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/libraryEditor/CreateNewLibraryAction.java
+++ b/java/idea-ui/src/com/intellij/openapi/roots/ui/configuration/libraryEditor/CreateNewLibraryAction.java
@@ -116,7 +116,7 @@
   public static AnAction[] createActionOrGroup(@NotNull String text, @NotNull BaseLibrariesConfigurable librariesConfigurable, final @NotNull Project project) {
     final LibraryType<?>[] extensions = LibraryType.EP_NAME.getExtensions();
     List<LibraryType<?>> suitableTypes = new ArrayList<LibraryType<?>>();
-    if (librariesConfigurable instanceof ProjectLibrariesConfigurable) {
+    if (librariesConfigurable instanceof ProjectLibrariesConfigurable || !project.isDefault()) {
       final ModuleStructureConfigurable configurable = ModuleStructureConfigurable.getInstance(project);
       for (LibraryType<?> extension : extensions) {
         if (!LibraryEditingUtil.getSuitableModules(configurable, extension.getKind(), null).isEmpty()) {
