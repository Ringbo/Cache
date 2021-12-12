diff --git a/java/debugger/impl/src/com/intellij/debugger/settings/CompoundRendererConfigurable.java b/java/debugger/impl/src/com/intellij/debugger/settings/CompoundRendererConfigurable.java
index 669a3db..8d5bcd7 100644
--- a/java/debugger/impl/src/com/intellij/debugger/settings/CompoundRendererConfigurable.java
+++ b/java/debugger/impl/src/com/intellij/debugger/settings/CompoundRendererConfigurable.java
@@ -225,7 +225,7 @@
         myChildrenExpandedEditor.setText(myChildrenExpandedEditor.getText());
         myListChildrenEditor.setText(myListChildrenEditor.getText());
       }
-    }, ModalityState.any());
+    }, ModalityState.any(), myProject.getDisposed());
   }
 
   private void updateEnabledState() {
