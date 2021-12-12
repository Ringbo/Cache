diff --git a/presto-main/src/main/java/com/facebook/presto/util/GraphvizPrinter.java b/presto-main/src/main/java/com/facebook/presto/util/GraphvizPrinter.java
index b9e7fdd..d188713 100644
--- a/presto-main/src/main/java/com/facebook/presto/util/GraphvizPrinter.java
+++ b/presto-main/src/main/java/com/facebook/presto/util/GraphvizPrinter.java
@@ -91,7 +91,7 @@
         SAMPLE,
         MARK_DISTINCT,
         TABLE_WRITER,
-        TABLE_COMMIT,
+        TABLE_FINISH,
         INDEX_SOURCE,
         UNNEST
     }
@@ -113,7 +113,7 @@
             .put(NodeType.UNION, "turquoise4")
             .put(NodeType.MARK_DISTINCT, "violet")
             .put(NodeType.TABLE_WRITER, "cyan")
-            .put(NodeType.TABLE_COMMIT, "hotpink")
+            .put(NodeType.TABLE_FINISH, "hotpink")
             .put(NodeType.INDEX_SOURCE, "dodgerblue3")
             .put(NodeType.UNNEST, "crimson")
             .put(NodeType.SAMPLE, "goldenrod4")
@@ -224,7 +224,7 @@
         @Override
         public Void visitTableFinish(TableFinishNode node, Void context)
         {
-            printNode(node, format("TableCommit[%s]", Joiner.on(", ").join(node.getOutputSymbols())), NODE_COLORS.get(NodeType.TABLE_COMMIT));
+            printNode(node, format("TableFinish[%s]", Joiner.on(", ").join(node.getOutputSymbols())), NODE_COLORS.get(NodeType.TABLE_FINISH));
             return node.getSource().accept(this, context);
         }
 
