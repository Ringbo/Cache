diff --git a/graal/com.oracle.graal.phases/src/com/oracle/graal/phases/graph/SinglePassNodeIterator.java b/graal/com.oracle.graal.phases/src/com/oracle/graal/phases/graph/SinglePassNodeIterator.java
index abbd3d1..529cac1 100644
--- a/graal/com.oracle.graal.phases/src/com/oracle/graal/phases/graph/SinglePassNodeIterator.java
+++ b/graal/com.oracle.graal.phases/src/com/oracle/graal/phases/graph/SinglePassNodeIterator.java
@@ -110,10 +110,10 @@
      * </p>
      */
     private static class PathStart<U> {
-        private final FixedNode node;
+        private final BeginNode node;
         private final U stateOnEntry;
 
-        private PathStart(FixedNode node, U stateOnEntry) {
+        private PathStart(BeginNode node, U stateOnEntry) {
             this.node = node;
             this.stateOnEntry = stateOnEntry;
             assert repOK();
@@ -123,7 +123,7 @@
          * @return true iff this instance is internally consistent (ie, its "representation is OK")
          */
         private boolean repOK() {
-            return (node instanceof MergeNode && stateOnEntry == null) || (node instanceof BeginNode && stateOnEntry != null);
+            return (node instanceof MergeNode && stateOnEntry == null) || (stateOnEntry != null);
         }
     }
 
@@ -226,7 +226,7 @@
             assert ready : "Not a single-pass iterator after all";
             return merge;
         } else {
-            BeginNode begin = (BeginNode) elem.node;
+            BeginNode begin = elem.node;
             assert begin.predecessor() != null;
             state = elem.stateOnEntry.clone();
             state.afterSplit(begin);
