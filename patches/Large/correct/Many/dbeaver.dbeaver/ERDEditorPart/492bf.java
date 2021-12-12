diff --git a/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorPart.java b/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorPart.java
index 1e1710d..0aaca69 100644
--- a/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorPart.java
+++ b/plugins/org.jkiss.dbeaver.ext.erd/src/org/jkiss/dbeaver/ext/erd/editor/ERDEditorPart.java
@@ -734,7 +734,7 @@
             }
             UIUtils.launchProgram(filePath);
             //UIUtils.showMessageBox(shell, "Save ERD", "Diagram has been exported to " + filePath, SWT.ICON_INFORMATION);
-        } catch (Exception e) {
+        } catch (Throwable e) {
             DBUserInterface.getInstance().showError("Save ERD as image", null, e);
         }
 
