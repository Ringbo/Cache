diff --git a/community/kernel/src/test/java/org/neo4j/test/TestData.java b/community/kernel/src/test/java/org/neo4j/test/TestData.java
index aafba8c..9945864 100644
--- a/community/kernel/src/test/java/org/neo4j/test/TestData.java
+++ b/community/kernel/src/test/java/org/neo4j/test/TestData.java
@@ -146,13 +146,13 @@
             }
             // If there is no title, and the first line looks like a title,
             // take the first line as title
-            if ( title == null && lines[start + 1] == EMPTY )
+            if ( title == null && start < end && lines[start + 1] == EMPTY )
             {
                 title = lines[start].trim();
                 start += 2;
             }
             StringBuilder documentation = new StringBuilder();
-            for ( int i = start; i < end; i++ )
+            for ( int i = start; i <= end; i++ )
             {
                 documentation.append( lines[i] == EMPTY ? lines[i] : lines[i].substring( indent ) ).append( "\n" );
             }
