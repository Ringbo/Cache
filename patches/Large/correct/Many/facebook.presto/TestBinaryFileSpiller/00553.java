diff --git a/presto-main/src/test/java/com/facebook/presto/spiller/TestBinaryFileSpiller.java b/presto-main/src/test/java/com/facebook/presto/spiller/TestBinaryFileSpiller.java
index 4968ae3..f2b25e8 100644
--- a/presto-main/src/test/java/com/facebook/presto/spiller/TestBinaryFileSpiller.java
+++ b/presto-main/src/test/java/com/facebook/presto/spiller/TestBinaryFileSpiller.java
@@ -62,7 +62,7 @@
 
         BlockBuilder col1 = BIGINT.createBlockBuilder(new BlockBuilderStatus(), 1);
         BlockBuilder col2 = DOUBLE.createBlockBuilder(new BlockBuilderStatus(), 1);
-        BlockBuilder col3 = VARCHAR.createBlockBuilder(new BlockBuilderStatus(), 1);
+        BlockBuilder col3 = VARBINARY.createBlockBuilder(new BlockBuilderStatus(), 1);
 
         col1.writeLong(42).closeEntry();
         col2.writeLong(doubleToLongBits(43.0)).closeEntry();
