diff --git a/src/edu/stanford/nlp/trees/Tree.java b/src/edu/stanford/nlp/trees/Tree.java
index d322e7a..280ec3f 100644
--- a/src/edu/stanford/nlp/trees/Tree.java
+++ b/src/edu/stanford/nlp/trees/Tree.java
@@ -868,7 +868,7 @@
       return;
     }
     pw.print("(");
-    String nodeString = onlyLabelValue ? nodeString() : nodeString();
+    String nodeString = onlyLabelValue ? value() : nodeString();
     pw.print(nodeString);
     // pw.flush();
     boolean parentIsNull = label() == null || label().value() == null;
