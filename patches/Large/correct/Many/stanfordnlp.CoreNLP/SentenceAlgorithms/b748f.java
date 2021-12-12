diff --git a/src/edu/stanford/nlp/simple/SentenceAlgorithms.java b/src/edu/stanford/nlp/simple/SentenceAlgorithms.java
index 2d9418a..479b92d 100644
--- a/src/edu/stanford/nlp/simple/SentenceAlgorithms.java
+++ b/src/edu/stanford/nlp/simple/SentenceAlgorithms.java
@@ -354,7 +354,7 @@
     int endAncestor = end;
     seenVertices.clear();
     while (governors.get(endAncestor).isPresent() && governors.get(endAncestor).get() >= 0) {
-      if (seenVertices.contains(startAncestor)) {
+      if (seenVertices.contains(endAncestor)) {
         return Collections.EMPTY_LIST;
       }
       seenVertices.add(startAncestor);
