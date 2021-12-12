diff --git a/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/IncrementalDocumentSynchronizer.java b/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/IncrementalDocumentSynchronizer.java
index d86869c..294dae6 100644
--- a/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/IncrementalDocumentSynchronizer.java
+++ b/flex/tools/flex-ui-designer/idea-plugin/src/com/intellij/flex/uiDesigner/IncrementalDocumentSynchronizer.java
@@ -60,7 +60,7 @@
     }
 
     return event.getParent() == otherEvent.getParent() &&
-           event.getElement() == event.getElement();
+           event.getElement() == otherEvent.getElement();
   }
 
   @Override
