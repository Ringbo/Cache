diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/type/AbstractType.java b/presto-spi/src/main/java/com/facebook/presto/spi/type/AbstractType.java
index 486c413..2c8c9b0 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/type/AbstractType.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/type/AbstractType.java
@@ -90,67 +90,67 @@
     @Override
     public boolean getBoolean(Block block, int position)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public void writeBoolean(BlockBuilder blockBuilder, boolean value)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public long getLong(Block block, int position)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public void writeLong(BlockBuilder blockBuilder, long value)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public double getDouble(Block block, int position)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public void writeDouble(BlockBuilder blockBuilder, double value)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public Slice getSlice(Block block, int position)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public void writeSlice(BlockBuilder blockBuilder, Slice value)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public void writeSlice(BlockBuilder blockBuilder, Slice value, int offset, int length)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public Object getObject(Block block, int position)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
     public void writeObject(BlockBuilder blockBuilder, Object value)
     {
-        throw new UnsupportedOperationException();
+        throw new UnsupportedOperationException(getClass().getName());
     }
 
     @Override
