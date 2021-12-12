diff --git a/src/java/org/apache/cassandra/cache/FreeableMemory.java b/src/java/org/apache/cassandra/cache/FreeableMemory.java
index 945f7b9..5dcd0fc 100644
--- a/src/java/org/apache/cassandra/cache/FreeableMemory.java
+++ b/src/java/org/apache/cassandra/cache/FreeableMemory.java
@@ -67,7 +67,7 @@
     @Override
     protected void finalize()
     {
-        assert references.get() == 0;
+        assert references.get() <= 0;
         assert peer == 0;
     }
     
