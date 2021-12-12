diff --git a/kahadb/src/main/java/org/apache/kahadb/util/SequenceSet.java b/kahadb/src/main/java/org/apache/kahadb/util/SequenceSet.java
index 138bb64..de195e7 100644
--- a/kahadb/src/main/java/org/apache/kahadb/util/SequenceSet.java
+++ b/kahadb/src/main/java/org/apache/kahadb/util/SequenceSet.java
@@ -272,7 +272,7 @@
         }
         Sequence sequence = getHead();
         while (sequence != null) {
-            if (sequence.first <= first ) {
+            if (sequence.first <= first && first <= sequence.last ) {
                 return last <= sequence.last ;
             }
             sequence = sequence.getNext();
