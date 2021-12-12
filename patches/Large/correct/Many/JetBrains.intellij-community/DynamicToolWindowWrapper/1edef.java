diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/intentions/dynamic/DynamicToolWindowWrapper.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/intentions/dynamic/DynamicToolWindowWrapper.java
index ca6b0f5..cbe5cbe 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/intentions/dynamic/DynamicToolWindowWrapper.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/annotator/intentions/dynamic/DynamicToolWindowWrapper.java
@@ -127,7 +127,7 @@
     final DynamicFilterComponent filter = new DynamicFilterComponent(GroovyBundle.message("dynamic.toolwindow.property.fiter"), 10);
     filter.setBackground(UIUtil.getLabelBackground());
 
-    myBigPanel.add(new Label(GroovyBundle.message("dynamic.toolwindow.search.elements")), BorderLayout.NORTH);
+    myBigPanel.add(new JLabel(GroovyBundle.message("dynamic.toolwindow.search.elements")), BorderLayout.NORTH);
     myBigPanel.add(filter, BorderLayout.NORTH);
 
     myTreeTablePanel = new JPanel(new BorderLayout());
