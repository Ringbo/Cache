diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/RagManager.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/RagManager.java
index ba14a4e..c12d5d0 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/RagManager.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/transaction/RagManager.java
@@ -181,7 +181,7 @@
             {
                 continue;
             }
-            graphStack.push( tx );
+            graphStack.push( lockingTx );
             checkWaitOnRecursive( lockingTx, tx, checkedTransactions,
                 graphStack );
             graphStack.pop();
