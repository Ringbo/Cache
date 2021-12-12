diff --git a/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/ForkedProcessorStep.java b/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/ForkedProcessorStep.java
index e06eef2..b81f9ba 100644
--- a/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/ForkedProcessorStep.java
+++ b/community/kernel/src/main/java/org/neo4j/unsafe/impl/batchimport/staging/ForkedProcessorStep.java
@@ -204,7 +204,7 @@
      */
     private final class CompletedBatchesSender extends Thread
     {
-        public CompletedBatchesSender( String name )
+        CompletedBatchesSender( String name )
         {
             super( name );
         }
