diff --git a/src/main/java/org/mapdb/StoreHeap.java b/src/main/java/org/mapdb/StoreHeap.java
index 7e4ae4a..ed10801 100644
--- a/src/main/java/org/mapdb/StoreHeap.java
+++ b/src/main/java/org/mapdb/StoreHeap.java
@@ -312,7 +312,7 @@
                             }
 
                             //put into list of free recids
-                            m.remove(m.set[i]);
+                            m.remove(m.set[j]);
 
                             if(freeRecid.length==freeRecidTail){
                                 freeRecid = Arrays.copyOf(freeRecid, freeRecid.length*2);
