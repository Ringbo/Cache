diff --git a/src/main/java/org/jabref/gui/exporter/ExportToClipboardAction.java b/src/main/java/org/jabref/gui/exporter/ExportToClipboardAction.java
index f2989a7..a55b40e 100644
--- a/src/main/java/org/jabref/gui/exporter/ExportToClipboardAction.java
+++ b/src/main/java/org/jabref/gui/exporter/ExportToClipboardAction.java
@@ -50,7 +50,7 @@
         }
 
         List<Exporter> exporters = Globals.exportFactory.getExporters().stream()
-                                                        .sorted(Comparator.comparing(Exporter::getDisplayName))
+                                                        .sorted(Comparator.comparing(Exporter::getName))
                                                         .collect(Collectors.toList());
 
         Optional<Exporter> selectedExporter = frame.getDialogService().showChoiceDialogAndWait(Localization.lang("Export"), Localization.lang("Select export format"),
