diff --git a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/GraphPrintVisitor.java b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/GraphPrintVisitor.java
index 7010f5a..e176dc9 100644
--- a/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/GraphPrintVisitor.java
+++ b/truffle/com.oracle.truffle.api/src/com/oracle/truffle/api/nodes/GraphPrintVisitor.java
@@ -75,7 +75,7 @@
         private final int id;
         private final Map<String, Object> properties;
 
-        public NodeElement(int id) {
+        NodeElement(int id) {
             super();
             this.id = id;
             this.properties = new LinkedHashMap<>();
@@ -96,7 +96,7 @@
         private final int index;
         private final String label;
 
-        public EdgeElement(NodeElement from, NodeElement to, int index, String label) {
+        EdgeElement(NodeElement from, NodeElement to, int index, String label) {
             this.from = from;
             this.to = to;
             this.index = index;
