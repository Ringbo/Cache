diff --git a/lang-impl/src/com/intellij/ide/structureView/impl/StructureViewComposite.java b/lang-impl/src/com/intellij/ide/structureView/impl/StructureViewComposite.java
index 7320c4c..3fdafa8 100644
--- a/lang-impl/src/com/intellij/ide/structureView/impl/StructureViewComposite.java
+++ b/lang-impl/src/com/intellij/ide/structureView/impl/StructureViewComposite.java
@@ -37,7 +37,7 @@
       Disposer.register(this, descriptor.structureView);
     }
     mySelectedViewDescriptor = views[0];
-    myTabbedPaneWrapper = new TabbedPaneWrapper();
+    myTabbedPaneWrapper = new TabbedPaneWrapper(this);
     for (StructureViewDescriptor descriptor : views) {
       myTabbedPaneWrapper.addTab(descriptor.title, descriptor.icon, descriptor.structureView.getComponent(), null);
     }
