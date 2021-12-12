diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTarget.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTarget.java
index bc4026a..0a2e449 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTarget.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/source/editors/text/TextEditingTarget.java
@@ -1447,7 +1447,7 @@
 
    public void checkForExternalEdit()
    {
-      if (externalEditCheckInterval_.hasElapsed())
+      if (!externalEditCheckInterval_.hasElapsed())
          return;
       externalEditCheckInterval_.reset();
 
