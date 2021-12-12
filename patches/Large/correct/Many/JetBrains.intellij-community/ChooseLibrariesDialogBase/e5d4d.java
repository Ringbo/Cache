diff --git a/platform/lang-impl/src/com/intellij/util/ui/classpath/ChooseLibrariesDialogBase.java b/platform/lang-impl/src/com/intellij/util/ui/classpath/ChooseLibrariesDialogBase.java
index cd06228..ad5ab6f 100644
--- a/platform/lang-impl/src/com/intellij/util/ui/classpath/ChooseLibrariesDialogBase.java
+++ b/platform/lang-impl/src/com/intellij/util/ui/classpath/ChooseLibrariesDialogBase.java
@@ -173,7 +173,7 @@
     myTree.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "ENTER");
     myTree.getActionMap().put("ENTER", getOKAction());
     final JScrollPane pane = ScrollPaneFactory.createScrollPane(myTree);
-    pane.setMinimumSize(new Dimension(300, 80));
+    pane.setPreferredSize(new Dimension(300, 80));
     return pane;
   }
 
