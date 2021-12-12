diff --git a/src/main/java/org/mapdb/Store.java b/src/main/java/org/mapdb/Store.java
index bf5772a..5c0c0bc 100644
--- a/src/main/java/org/mapdb/Store.java
+++ b/src/main/java/org/mapdb/Store.java
@@ -293,7 +293,7 @@
     protected int expectedMasks(){
         return (encrypt?ENCRYPT_FLAG_MASK:0) |
                 (checksum?CHECKSUM_FLAG_MASK:0) |
-                (checksum?COMPRESS_FLAG_MASK:0);
+                (compress?COMPRESS_FLAG_MASK:0);
     }
 
     private static final int LOCK_MASK = CC.CONCURRENCY-1;
