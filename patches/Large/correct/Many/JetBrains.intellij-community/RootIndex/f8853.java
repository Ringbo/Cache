diff --git a/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootIndex.java b/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootIndex.java
index 34c9a57..1cdd431 100644
--- a/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootIndex.java
+++ b/platform/projectModel-impl/src/com/intellij/openapi/roots/impl/RootIndex.java
@@ -300,7 +300,8 @@
   }
 
   @NotNull
-  Query<VirtualFile> getDirectoriesByPackageName(@NotNull final String packageName, final boolean includeLibrarySources) {
+  public Query<VirtualFile> getDirectoriesByPackageName(@NotNull final String packageName, final boolean includeLibrarySources) {
+    // Note that this method is used in upsource as well, hence, don't reduce this method's visibility.
     List<VirtualFile> result = myPackageDirectoryCache.getDirectoriesByPackageName(packageName);
     if (!includeLibrarySources) {
       result = ContainerUtil.filter(result, new Condition<VirtualFile>() {
