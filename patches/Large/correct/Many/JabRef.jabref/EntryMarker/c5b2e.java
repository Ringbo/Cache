diff --git a/src/main/java/net/sf/jabref/gui/EntryMarker.java b/src/main/java/net/sf/jabref/gui/EntryMarker.java
index 7b7b08f..f392722 100644
--- a/src/main/java/net/sf/jabref/gui/EntryMarker.java
+++ b/src/main/java/net/sf/jabref/gui/EntryMarker.java
@@ -168,7 +168,7 @@
     }
 
     public static int isMarked(BibEntry be) {
-        if (be.hasField(BibtexFields.MARKED)) {
+        if (!be.hasField(BibtexFields.MARKED)) {
             return 0;
         }
         String s = be.getField(BibtexFields.MARKED);
