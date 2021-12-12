diff --git a/kahadb/src/main/java/org/apache/kahadb/util/LinkedNodeList.java b/kahadb/src/main/java/org/apache/kahadb/util/LinkedNodeList.java
index 37bf958..ef9f5a0 100644
--- a/kahadb/src/main/java/org/apache/kahadb/util/LinkedNodeList.java
+++ b/kahadb/src/main/java/org/apache/kahadb/util/LinkedNodeList.java
@@ -99,7 +99,7 @@
      * @return
      */
     public T rotate() {
-        return head = head.getNext();
+        return head = head.getNextCircular();
     }
 
     public int size() {
