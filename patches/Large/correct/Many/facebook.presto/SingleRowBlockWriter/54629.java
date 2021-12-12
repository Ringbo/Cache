diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleRowBlockWriter.java b/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleRowBlockWriter.java
index 2e7ac15..e397a3e 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleRowBlockWriter.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/block/SingleRowBlockWriter.java
@@ -210,7 +210,7 @@
             return format("RowBlock{SingleRowBlockWriter=%d, fieldBlockBuilderReturned=false, positionCount=%d}", numFields, getPositionCount());
         }
         else {
-            return format("RowBlock{SingleRowBlockWriter=%d, fieldBlockBuilderReturned=true}");
+            return format("RowBlock{SingleRowBlockWriter=%d, fieldBlockBuilderReturned=true}", numFields);
         }
     }
 
