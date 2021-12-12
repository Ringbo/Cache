diff --git a/src/main/java/net/sf/jabref/gui/actions/CleanupAction.java b/src/main/java/net/sf/jabref/gui/actions/CleanupAction.java
index 141db87..3164415 100644
--- a/src/main/java/net/sf/jabref/gui/actions/CleanupAction.java
+++ b/src/main/java/net/sf/jabref/gui/actions/CleanupAction.java
@@ -157,7 +157,9 @@
      */
     private void doCleanup(CleanupPreset preset, BibEntry entry, NamedCompound ce) {
         // Run cleaner
-        CleanupWorker cleaner = new CleanupWorker(preset, panel.getBibDatabaseContext().getMetaData().getFileDirectory(Globals.FILE_FIELD));
+        CleanupWorker cleaner = new CleanupWorker(preset,
+                panel.getBibDatabaseContext().getMetaData().getFileDirectory(Globals.FILE_FIELD), null,
+                Globals.journalAbbreviationLoader.getRepository());
         List<FieldChange> changes = cleaner.cleanup(entry);
 
         unsuccessfulRenames = cleaner.getUnsuccessfulRenames();
