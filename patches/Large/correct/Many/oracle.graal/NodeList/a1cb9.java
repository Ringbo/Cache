diff --git a/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/NodeList.java b/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/NodeList.java
index 7285764..dfa7b95 100644
--- a/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/NodeList.java
+++ b/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/NodeList.java
@@ -336,7 +336,7 @@
     @Override
     @SuppressWarnings("unchecked")
     public <A> A[] toArray(A[] a) {
-        if (a.length <= size) {
+        if (a.length >= size) {
             System.arraycopy(nodes, 0, a, 0, size);
             return a;
         }
