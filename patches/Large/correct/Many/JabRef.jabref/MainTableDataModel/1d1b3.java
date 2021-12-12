diff --git a/src/main/java/org/jabref/gui/maintable/MainTableDataModel.java b/src/main/java/org/jabref/gui/maintable/MainTableDataModel.java
index 7b4ea1f..6ee7c5d 100644
--- a/src/main/java/org/jabref/gui/maintable/MainTableDataModel.java
+++ b/src/main/java/org/jabref/gui/maintable/MainTableDataModel.java
@@ -35,7 +35,7 @@
         );
 
         // We need to wrap the list since otherwise sorting in the table does not work
-        entriesSorted = new SortedList<>(entriesViewModel);
+        entriesSorted = new SortedList<>(entriesFiltered);
     }
 
     private boolean isMatched(BibEntryTableViewModel entry) {
