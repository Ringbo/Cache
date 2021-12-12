diff --git a/src/edu/stanford/nlp/parser/shiftreduce/Weight.java b/src/edu/stanford/nlp/parser/shiftreduce/Weight.java
index 8475095..bf925c0 100644
--- a/src/edu/stanford/nlp/parser/shiftreduce/Weight.java
+++ b/src/edu/stanford/nlp/parser/shiftreduce/Weight.java
@@ -109,7 +109,7 @@
       }
       int index = unpackIndex(i);
       float score = unpackScore(i);
-      packed[j] = pack(index, score);
+      newPacked[j] = pack(index, score);
       ++j;
     }
     packed = newPacked;
