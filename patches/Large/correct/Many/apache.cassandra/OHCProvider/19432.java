diff --git a/src/java/org/apache/cassandra/cache/OHCProvider.java b/src/java/org/apache/cassandra/cache/OHCProvider.java
index 9b1c8cf..ab2745a 100644
--- a/src/java/org/apache/cassandra/cache/OHCProvider.java
+++ b/src/java/org/apache/cassandra/cache/OHCProvider.java
@@ -100,7 +100,7 @@
 
         public long weightedSize()
         {
-            return ohCache.size();
+            return ohCache.memUsed();
         }
 
         public void clear()
