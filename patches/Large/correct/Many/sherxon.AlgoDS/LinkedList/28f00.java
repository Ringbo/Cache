diff --git a/src/ds/LinkedList.java b/src/ds/LinkedList.java
index cce9220..ac984cf 100644
--- a/src/ds/LinkedList.java
+++ b/src/ds/LinkedList.java
@@ -24,7 +24,7 @@
     }
 
     public E get(int index) {
-        if (index >= size && index < 0) // check boundaries
+        if (index >= size || index < 0) // check boundaries
             throw new NoSuchElementException();
 
         // find element at given index
