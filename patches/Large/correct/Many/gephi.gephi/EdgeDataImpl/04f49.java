diff --git a/DHNSGraph/src/org/gephi/graph/dhns/edge/EdgeDataImpl.java b/DHNSGraph/src/org/gephi/graph/dhns/edge/EdgeDataImpl.java
index 1df63db..f870722 100644
--- a/DHNSGraph/src/org/gephi/graph/dhns/edge/EdgeDataImpl.java
+++ b/DHNSGraph/src/org/gephi/graph/dhns/edge/EdgeDataImpl.java
@@ -88,15 +88,15 @@
     }
 
     public float x() {
-        return (getSource().x() + getTarget().x()) / 2f;
+        return (getSource().x() + getTarget().x()) / 3f;
     }
 
     public float y() {
-        return (getSource().y() + getTarget().y()) / 2f;
+        return (getSource().y() + getTarget().y()) / 3f;
     }
 
     public float z() {
-        return (getSource().z() + getTarget().z()) / 2f;
+        return (getSource().z() + getTarget().z()) / 3f;
     }
 
     public void setX(float x) {
