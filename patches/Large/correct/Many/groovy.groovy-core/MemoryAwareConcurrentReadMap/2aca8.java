diff --git a/src/main/org/codehaus/groovy/runtime/metaclass/MemoryAwareConcurrentReadMap.java b/src/main/org/codehaus/groovy/runtime/metaclass/MemoryAwareConcurrentReadMap.java
index dab8213..244e550 100644
--- a/src/main/org/codehaus/groovy/runtime/metaclass/MemoryAwareConcurrentReadMap.java
+++ b/src/main/org/codehaus/groovy/runtime/metaclass/MemoryAwareConcurrentReadMap.java
@@ -43,7 +43,7 @@
  * one of value or key are removed, so will be complete entry. This map
  * will not use the equals method to compare keys, think of it as a
  * IdentityHashMap with features of concurrency and memory aware caching.
- * As  ConcurrentReaderHashMap also does this implementation prefere read
+ * As  ConcurrentReaderHashMap also does this implementation prefer read
  * operations and tries not to lock if possible. SoftReferenced values
  * are only removed from the map if the map goes into a synchronization
  * block on this. This may affect reads, but only in rare cases.
@@ -551,7 +551,7 @@
 
                         Entry head = e.next;
                         for (Entry p = first; p != e; p = p.next) 
-                            head = new Entry(p.hash, p.key, p.value, head, queue);
+                            head = new Entry(p.hash, p.key, p.value, head);
 
                         tab[index] = head;
                         recordModification(head);
