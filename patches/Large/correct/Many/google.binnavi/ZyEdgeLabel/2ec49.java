diff --git a/src/main/java/com/google/security/zynamics/zylib/yfileswrap/gui/zygraph/realizers/ZyEdgeLabel.java b/src/main/java/com/google/security/zynamics/zylib/yfileswrap/gui/zygraph/realizers/ZyEdgeLabel.java
index 7b5a642..6cf1eda 100644
--- a/src/main/java/com/google/security/zynamics/zylib/yfileswrap/gui/zygraph/realizers/ZyEdgeLabel.java
+++ b/src/main/java/com/google/security/zynamics/zylib/yfileswrap/gui/zygraph/realizers/ZyEdgeLabel.java
@@ -47,7 +47,7 @@
 
   public ZyEdgeLabel(final ZyLabelContent content) {
 
-    m_content = Preconditions.checkNotNull(content, "Internal Error: Content can't be null");
+    m_content = Preconditions.checkNotNull(content);
 
     setVisible(true);
     setText("A"); // Dummy; don't remove
