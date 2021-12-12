diff --git a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/NodeUtil.java b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/NodeUtil.java
index c596a1f..e6ebfdb 100644
--- a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/NodeUtil.java
+++ b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/NodeUtil.java
@@ -63,7 +63,7 @@
     private static final class RecursiveNodeIterator implements Iterator<Node> {
         private final List<Iterator<Node>> iteratorStack = new ArrayList<>();
 
-        public RecursiveNodeIterator(final Node node) {
+        RecursiveNodeIterator(final Node node) {
             iteratorStack.add(new Iterator<Node>() {
 
                 private boolean visited;
@@ -834,7 +834,7 @@
         public int count;
         private final NodeCountFilter filter;
 
-        public NodeCounter(NodeCountFilter filter) {
+        NodeCounter(NodeCountFilter filter) {
             this.filter = filter;
         }
 
