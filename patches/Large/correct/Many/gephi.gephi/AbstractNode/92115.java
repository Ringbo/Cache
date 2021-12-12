diff --git a/DHNSGraph/src/org/gephi/graph/dhns/node/AbstractNode.java b/DHNSGraph/src/org/gephi/graph/dhns/node/AbstractNode.java
index 9979681..112d2c5 100644
--- a/DHNSGraph/src/org/gephi/graph/dhns/node/AbstractNode.java
+++ b/DHNSGraph/src/org/gephi/graph/dhns/node/AbstractNode.java
@@ -50,7 +50,7 @@
     }
 
     public boolean hasAttributes() {
-        return nodeData.getAttributes() == null;
+        return nodeData.getAttributes() != null;
     }
 
     public void setAttributes(Attributes attributes) {
