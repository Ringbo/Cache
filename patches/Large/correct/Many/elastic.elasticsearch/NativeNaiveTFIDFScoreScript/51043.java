diff --git a/core/src/test/java/org/elasticsearch/benchmark/scripts/score/script/NativeNaiveTFIDFScoreScript.java b/core/src/test/java/org/elasticsearch/benchmark/scripts/score/script/NativeNaiveTFIDFScoreScript.java
index 9d6a1cd..e96b35d 100644
--- a/core/src/test/java/org/elasticsearch/benchmark/scripts/score/script/NativeNaiveTFIDFScoreScript.java
+++ b/core/src/test/java/org/elasticsearch/benchmark/scripts/score/script/NativeNaiveTFIDFScoreScript.java
@@ -70,7 +70,7 @@
                     score += indexFieldTerm.tf() * indexField.docCount() / indexFieldTerm.df();
                 }
             } catch (IOException e) {
-                throw new RuntimeException();
+                throw new RuntimeException(e);
             }
         }
         return score;
