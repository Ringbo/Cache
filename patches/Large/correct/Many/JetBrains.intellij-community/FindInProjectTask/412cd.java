diff --git a/platform/lang-impl/src/com/intellij/find/impl/FindInProjectTask.java b/platform/lang-impl/src/com/intellij/find/impl/FindInProjectTask.java
index 54b4579..fd30bcb 100644
--- a/platform/lang-impl/src/com/intellij/find/impl/FindInProjectTask.java
+++ b/platform/lang-impl/src/com/intellij/find/impl/FindInProjectTask.java
@@ -432,7 +432,7 @@
   @NotNull
   private Set<VirtualFile> getFilesForFastWordSearch() {
     String stringToFind = myFindModel.getStringToFind();
-    if (stringToFind.isEmpty() || DumbService.getInstance(myProject).isDumb() || myFindModel.isReplaceState()) {
+    if (stringToFind.isEmpty() || DumbService.getInstance(myProject).isDumb() || myFindModel.isRegularExpressions()) {
       return Collections.emptySet();
     }
 
