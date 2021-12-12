diff --git a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenGeneralSettings.java b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenGeneralSettings.java
index cc237f4..d3ab6ad 100644
--- a/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenGeneralSettings.java
+++ b/plugins/maven/src/main/java/org/jetbrains/idea/maven/project/MavenGeneralSettings.java
@@ -186,7 +186,7 @@
   @Nullable
   public VirtualFile getEffectiveUserSettingsFile() {
     File file = getEffectiveUserSettingsIoFile();
-    return file == null ? null : LocalFileSystem.getInstance().refreshAndFindFileByIoFile(file);
+    return file == null ? null : LocalFileSystem.getInstance().findFileByIoFile(file);
   }
 
   public List<VirtualFile> getEffectiveSettingsFiles() {
@@ -201,7 +201,7 @@
   @Nullable
   public VirtualFile getEffectiveGlobalSettingsFile() {
     File file = getEffectiveGlobalSettingsIoFile();
-    return file == null ? null : LocalFileSystem.getInstance().refreshAndFindFileByIoFile(file);
+    return file == null ? null : LocalFileSystem.getInstance().findFileByIoFile(file);
   }
 
   @NotNull
