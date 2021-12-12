diff --git a/platform/util/src/com/intellij/util/ui/components/BorderLayoutPanel.java b/platform/util/src/com/intellij/util/ui/components/BorderLayoutPanel.java
index 76b2c02..0a6c8e0 100644
--- a/platform/util/src/com/intellij/util/ui/components/BorderLayoutPanel.java
+++ b/platform/util/src/com/intellij/util/ui/components/BorderLayoutPanel.java
@@ -34,7 +34,7 @@
   }
 
   public BorderLayoutPanel addToCenter(Component comp) {
-    add(comp);
+    add(comp, BorderLayout.CENTER);
     return this;
   }
 
