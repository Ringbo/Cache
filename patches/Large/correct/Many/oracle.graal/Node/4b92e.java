diff --git a/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/Node.java b/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/Node.java
index f3fa3cb..03d1dcc 100644
--- a/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/Node.java
+++ b/graal/com.oracle.graal.graph/src/com/oracle/graal/graph/Node.java
@@ -549,7 +549,7 @@
             NodeClassIterator iter = usage.inputs().iterator();
             while (iter.hasNext()) {
                 Position pos = iter.nextPosition();
-                if (pos.getInputType(usage) == type) {
+                if (pos.getInputType(usage) == type && pos.get(usage) == this) {
                     pos.set(usage, other);
                 }
             }
