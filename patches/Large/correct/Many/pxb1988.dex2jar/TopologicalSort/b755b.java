diff --git a/dex-ir/src/main/java/com/googlecode/dex2jar/ir/ts/TopologicalSort.java b/dex-ir/src/main/java/com/googlecode/dex2jar/ir/ts/TopologicalSort.java
index c3dae59..a8e6dfa 100755
--- a/dex-ir/src/main/java/com/googlecode/dex2jar/ir/ts/TopologicalSort.java
+++ b/dex-ir/src/main/java/com/googlecode/dex2jar/ir/ts/TopologicalSort.java
@@ -91,7 +91,7 @@
          */
         for (JumpStmt gotoStmt : gotos) {
             Stmt t = gotoStmt.getNext();
-            while (t.st == ST.LABEL) {
+            while (t != null && t.st == ST.LABEL) {
                 if (t == gotoStmt.target) {
                     stmts.remove(gotoStmt);
                     break;
