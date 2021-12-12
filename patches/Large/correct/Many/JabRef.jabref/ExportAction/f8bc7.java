diff --git a/src/main/java/org/jabref/gui/exporter/ExportAction.java b/src/main/java/org/jabref/gui/exporter/ExportAction.java
index 5dfa5cb..2ac783c 100644
--- a/src/main/java/org/jabref/gui/exporter/ExportAction.java
+++ b/src/main/java/org/jabref/gui/exporter/ExportAction.java
@@ -98,7 +98,7 @@
 
                     // Make sure we remember which filter was used, to set
                     // the default for next time:
-                Globals.prefs.put(JabRefPreferences.LAST_USED_EXPORT, format.getId());
+                Globals.prefs.put(JabRefPreferences.LAST_USED_EXPORT, format.getDescription());
                 Globals.prefs.put(JabRefPreferences.EXPORT_WORKING_DIRECTORY, file.getParent().getFileName().toString());
 
                     final List<BibEntry> finEntries = entries;
