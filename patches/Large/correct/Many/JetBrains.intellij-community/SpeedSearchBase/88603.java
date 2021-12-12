diff --git a/ui/impl/com/intellij/ui/SpeedSearchBase.java b/ui/impl/com/intellij/ui/SpeedSearchBase.java
index 465142e..9d6cc52 100644
--- a/ui/impl/com/intellij/ui/SpeedSearchBase.java
+++ b/ui/impl/com/intellij/ui/SpeedSearchBase.java
@@ -404,7 +404,7 @@
 
   private void manageSearchPopup(SearchPopup searchPopup) {
     final Project project;
-    if (ApplicationManager.getApplication() != null) {
+    if (ApplicationManager.getApplication() != null && !ApplicationManager.getApplication().isDisposed()) {
       project = DataKeys.PROJECT.getData(DataManager.getInstance().getDataContext(myComponent));
     }
     else {
