diff --git a/presto-server/src/test/java/com/facebook/presto/server/TestDistributedQueries.java b/presto-server/src/test/java/com/facebook/presto/server/TestDistributedQueries.java
index c1961d1..bced5ab 100644
--- a/presto-server/src/test/java/com/facebook/presto/server/TestDistributedQueries.java
+++ b/presto-server/src/test/java/com/facebook/presto/server/TestDistributedQueries.java
@@ -152,7 +152,7 @@
             @Override
             public String apply(MaterializedTuple input)
             {
-                assertEquals(input.getFieldCount(), 3);
+                assertEquals(input.getFieldCount(), 4);
                 return (String) input.getField(0);
             }
         }));
