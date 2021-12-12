diff --git a/DHNSGraph/src/org/gephi/graph/dhns/edge/AbstractEdge.java b/DHNSGraph/src/org/gephi/graph/dhns/edge/AbstractEdge.java
index fc00dd0..9b9e2a3 100644
--- a/DHNSGraph/src/org/gephi/graph/dhns/edge/AbstractEdge.java
+++ b/DHNSGraph/src/org/gephi/graph/dhns/edge/AbstractEdge.java
@@ -111,7 +111,7 @@
     }
 
     public boolean hasAttributes() {
-        return edgeData.getAttributes() == null;
+        return edgeData.getAttributes() != null;
     }
 
     public void setAttributes(Attributes attributes) {
