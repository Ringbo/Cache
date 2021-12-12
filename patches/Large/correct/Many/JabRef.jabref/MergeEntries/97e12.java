diff --git a/src/main/java/net/sf/jabref/gui/mergeentries/MergeEntries.java b/src/main/java/net/sf/jabref/gui/mergeentries/MergeEntries.java
index 82507df..f7ae2b6 100644
--- a/src/main/java/net/sf/jabref/gui/mergeentries/MergeEntries.java
+++ b/src/main/java/net/sf/jabref/gui/mergeentries/MergeEntries.java
@@ -49,7 +49,7 @@
 
 public class MergeEntries {
 
-    private static final Log LOGGER = LogFactory.getLog(Globals.class);
+    private static final Log LOGGER = LogFactory.getLog(MergeEntries.class);
 
     // Headings
     private final String[] columnHeadings = {Localization.lang("Field"),
