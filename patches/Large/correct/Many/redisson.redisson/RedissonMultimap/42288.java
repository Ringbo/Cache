diff --git a/src/main/java/org/redisson/RedissonMultimap.java b/src/main/java/org/redisson/RedissonMultimap.java
index ee28b19..0d02efc 100644
--- a/src/main/java/org/redisson/RedissonMultimap.java
+++ b/src/main/java/org/redisson/RedissonMultimap.java
@@ -281,7 +281,7 @@
 
         @Override
         public int size() {
-            return RedissonMultimap.this.size();
+            return RedissonMultimap.this.keySize();
         }
 
         @Override
