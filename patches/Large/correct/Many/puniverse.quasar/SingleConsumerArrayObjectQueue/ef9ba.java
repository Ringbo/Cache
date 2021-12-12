diff --git a/quasar-core/src/main/java/co/paralleluniverse/strands/queues/SingleConsumerArrayObjectQueue.java b/quasar-core/src/main/java/co/paralleluniverse/strands/queues/SingleConsumerArrayObjectQueue.java
index acd9325..14a6f1a 100644
--- a/quasar-core/src/main/java/co/paralleluniverse/strands/queues/SingleConsumerArrayObjectQueue.java
+++ b/quasar-core/src/main/java/co/paralleluniverse/strands/queues/SingleConsumerArrayObjectQueue.java
@@ -42,13 +42,13 @@
         final long i = preEnq();
         if (i < 0)
             return false;
-        orderedSet((int) i & mask, item); // volatile set
+        volatileSet((int) i & mask, item);
         return true;
     }
 
     @Override
     boolean hasNext(long lind, int iind) {
-        return array[iind] != null;
+        return get(iind) != null;
     }
 
     @SuppressWarnings("empty-statement")
