diff --git a/src/main/java/net/sf/jabref/exporter/FileActions.java b/src/main/java/net/sf/jabref/exporter/FileActions.java
index b05b415..d8cd02b 100644
--- a/src/main/java/net/sf/jabref/exporter/FileActions.java
+++ b/src/main/java/net/sf/jabref/exporter/FileActions.java
@@ -244,7 +244,7 @@
                 if (write) {
                     bibtexEntryWriter.write(entry, writer);
                     //only append newline if the entry has changed
-                    if(!entry.hasChanged()){
+                    if(entry.hasChanged()){
                         writer.write(Globals.NEWLINE);
                     }
                 }
