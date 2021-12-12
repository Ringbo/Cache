diff --git a/platform/lang-impl/src/com/intellij/ide/util/FileStructurePopup.java b/platform/lang-impl/src/com/intellij/ide/util/FileStructurePopup.java
index 1c8c7ae..417d368 100644
--- a/platform/lang-impl/src/com/intellij/ide/util/FileStructurePopup.java
+++ b/platform/lang-impl/src/com/intellij/ide/util/FileStructurePopup.java
@@ -409,7 +409,7 @@
   }
 
   private void installUpdater() {
-    if (ApplicationManager.getApplication().isUnitTestMode()) {
+    if (ApplicationManager.getApplication().isUnitTestMode() || myPopup.isDisposed()) {
       return;
     }
     final Alarm alarm = new Alarm(Alarm.ThreadToUse.SWING_THREAD, myPopup);
