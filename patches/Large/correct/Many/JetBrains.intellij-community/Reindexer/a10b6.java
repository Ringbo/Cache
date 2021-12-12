diff --git a/platform/util/src/com/intellij/util/diff/Reindexer.java b/platform/util/src/com/intellij/util/diff/Reindexer.java
index 55247ac..1d8f68b 100644
--- a/platform/util/src/com/intellij/util/diff/Reindexer.java
+++ b/platform/util/src/com/intellij/util/diff/Reindexer.java
@@ -82,7 +82,7 @@
     BitSet changes1;
     BitSet changes2;
 
-    if (myDiscardedLengths[0] == myOriginalLengths[0] && myDiscardedLengths[0] == myOriginalLengths[0]) {
+    if (myDiscardedLengths[0] == myOriginalLengths[0] && myDiscardedLengths[1] == myOriginalLengths[1]) {
       changes1 = discardedChanges[0];
       changes2 = discardedChanges[1];
     }
