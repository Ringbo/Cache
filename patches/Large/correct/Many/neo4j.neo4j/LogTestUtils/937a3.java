diff --git a/community/kernel/src/test/java/org/neo4j/test/LogTestUtils.java b/community/kernel/src/test/java/org/neo4j/test/LogTestUtils.java
index 3fa1ff1..7fe4f21 100644
--- a/community/kernel/src/test/java/org/neo4j/test/LogTestUtils.java
+++ b/community/kernel/src/test/java/org/neo4j/test/LogTestUtils.java
@@ -296,7 +296,7 @@
         public void restore() throws IOException
         {
             fileSystem.deleteFile( file );
-            fileSystem.move( backup, file );
+            fileSystem.renameFile( backup, file );
         }
     }
 
