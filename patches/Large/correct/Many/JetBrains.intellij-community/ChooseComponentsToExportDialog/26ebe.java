diff --git a/action-system/impl/com/intellij/ide/actions/ChooseComponentsToExportDialog.java b/action-system/impl/com/intellij/ide/actions/ChooseComponentsToExportDialog.java
index 46bfb7c..e346318 100644
--- a/action-system/impl/com/intellij/ide/actions/ChooseComponentsToExportDialog.java
+++ b/action-system/impl/com/intellij/ide/actions/ChooseComponentsToExportDialog.java
@@ -53,7 +53,7 @@
       }
     }
     final Set<ComponentElementProperties> componentElementProperties = new LinkedHashSet<ComponentElementProperties>(componentToContainingListElement.values());
-    myChooser = new ElementsChooser<ComponentElementProperties>();
+    myChooser = new ElementsChooser<ComponentElementProperties>(true);
     for (Iterator iterator = componentElementProperties.iterator(); iterator.hasNext();) {
       ComponentElementProperties elementProperties = (ComponentElementProperties)iterator.next();
       myChooser.addElement(elementProperties, true, elementProperties);
