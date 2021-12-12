diff --git a/ui/openapi/com/intellij/openapi/ui/MasterDetailsComponent.java b/ui/openapi/com/intellij/openapi/ui/MasterDetailsComponent.java
index 29b29af..1cf2559 100644
--- a/ui/openapi/com/intellij/openapi/ui/MasterDetailsComponent.java
+++ b/ui/openapi/com/intellij/openapi/ui/MasterDetailsComponent.java
@@ -127,7 +127,7 @@
     myScrollPane.setMaximumSize(new Dimension(150, -1));
     final JPanel panel = new JPanel(new BorderLayout()) {
       public Dimension getPreferredSize() {
-        return new Dimension(600, 800);
+        return new Dimension(800, 600);
       }
     };
     panel.add(myWholePanel, BorderLayout.CENTER);
