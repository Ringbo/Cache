diff --git a/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/IdeDocumentHistoryImpl.java b/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/IdeDocumentHistoryImpl.java
index 3fa48af..e67b2d1 100644
--- a/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/IdeDocumentHistoryImpl.java
+++ b/platform/platform-impl/src/com/intellij/openapi/fileEditor/impl/IdeDocumentHistoryImpl.java
@@ -109,7 +109,7 @@
 
       @Override
       public void commandFinished(@NotNull CommandEvent event) {
-        onCommandFinished(event.getCommandGroupId());
+        onCommandFinished(event.getProject(), event.getCommandGroupId());
       }
     });
 
@@ -216,7 +216,7 @@
     return null;
   }
 
-  final void onCommandFinished(Object commandGroupId) {
+  final void onCommandFinished(Project project, Object commandGroupId) {
     if (!CommandMerger.canMergeGroup(commandGroupId, myLastGroupId)) myRegisteredBackPlaceInLastGroup = false;
     myLastGroupId = commandGroupId;
 
@@ -234,7 +234,7 @@
     }
 
     if (myCurrentCommandHasChanges) {
-      setCurrentChangePlace();
+      setCurrentChangePlace(project == myProject);
     }
     else if (myCurrentCommandHasMoves) {
       pushCurrentChangePlace();
@@ -248,17 +248,17 @@
 
   @Override
   public final void includeCurrentPlaceAsChangePlace() {
-    setCurrentChangePlace();
+    setCurrentChangePlace(false);
     pushCurrentChangePlace();
   }
 
-  private void setCurrentChangePlace() {
+  private void setCurrentChangePlace(boolean acceptPlaceFromFocus) {
     boolean fromFocus = false;
     PlaceInfo placeInfo = getCurrentPlaceInfo();
     if (placeInfo != null && !myChangedFilesInCurrentCommand.contains(placeInfo.getFile())) {
       placeInfo = null;
     }
-    if (placeInfo == null) {
+    if (placeInfo == null && acceptPlaceFromFocus) {
       placeInfo = getPlaceInfoFromFocus();
       fromFocus = true;
     }
