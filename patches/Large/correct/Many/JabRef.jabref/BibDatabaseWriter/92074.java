diff --git a/src/main/java/net/sf/jabref/exporter/BibDatabaseWriter.java b/src/main/java/net/sf/jabref/exporter/BibDatabaseWriter.java
index 9313f20..568d5ea 100644
--- a/src/main/java/net/sf/jabref/exporter/BibDatabaseWriter.java
+++ b/src/main/java/net/sf/jabref/exporter/BibDatabaseWriter.java
@@ -225,7 +225,7 @@
     }
 
     private static List<BibEntry> applySaveActions(List<BibEntry> toChange, MetaData metaData) {
-        if (metaData.getData(SaveActions.META_KEY) == null) {
+        if (metaData.getData(SaveActions.META_KEY) != null) {
             // save actions defined -> apply for every entry
             List<BibEntry> result = new ArrayList<>(toChange.size());
 
