diff --git a/community/kernel/src/test/java/org/neo4j/kernel/impl/api/KernelStatementTest.java b/community/kernel/src/test/java/org/neo4j/kernel/impl/api/KernelStatementTest.java
index e97e243..0af8236 100644
--- a/community/kernel/src/test/java/org/neo4j/kernel/impl/api/KernelStatementTest.java
+++ b/community/kernel/src/test/java/org/neo4j/kernel/impl/api/KernelStatementTest.java
@@ -89,7 +89,7 @@
         KernelStatement statement =
                 new KernelStatement(
                         mock( KernelTransactionImplementation.class ),
-                        mock( IndexReaderFactory.class ), scanStore, null, null, null, null );
+                        mock( IndexReaderFactory.class ), scanStore, null, null, null );
 
         statement.acquire();
 
