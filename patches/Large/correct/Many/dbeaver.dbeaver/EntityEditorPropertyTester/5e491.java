diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/EntityEditorPropertyTester.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/EntityEditorPropertyTester.java
index 010ba01..a640392 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/EntityEditorPropertyTester.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/editors/entity/EntityEditorPropertyTester.java
@@ -52,7 +52,7 @@
                 case PROP_CAN_REDO:
                     return commandContext.getRedoCommand() != null;
                 case PROP_DIRTY:
-                    return commandContext.isDirty();
+                    return editor.isDirty();
             }
         }
 
