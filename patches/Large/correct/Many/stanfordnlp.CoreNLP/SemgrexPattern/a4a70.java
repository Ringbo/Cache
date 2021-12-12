diff --git a/src/edu/stanford/nlp/semgraph/semgrex/SemgrexPattern.java b/src/edu/stanford/nlp/semgraph/semgrex/SemgrexPattern.java
index 01bccce..28f39a5 100644
--- a/src/edu/stanford/nlp/semgraph/semgrex/SemgrexPattern.java
+++ b/src/edu/stanford/nlp/semgraph/semgrex/SemgrexPattern.java
@@ -410,7 +410,7 @@
         treebank.loadPath(treeFile);
         for (Tree tree : treebank) {
           // TODO: allow other languages... this defaults to English
-          SemanticGraph graph = SemanticGraphFactory.makeFromTree(tree, mode, useExtras ? GrammaticalStructure.Extras.MAXIMAL : GrammaticalStructure.Extras.NONE, true, null);
+          SemanticGraph graph = SemanticGraphFactory.makeFromTree(tree, mode, useExtras ? GrammaticalStructure.Extras.MAXIMAL : GrammaticalStructure.Extras.NONE, true);
           graphs.add(graph);
         }
       }
