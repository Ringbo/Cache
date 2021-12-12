diff --git a/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/DBeaverApplication.java b/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/DBeaverApplication.java
index 7282e3a..7b802ff 100644
--- a/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/DBeaverApplication.java
+++ b/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/DBeaverApplication.java
@@ -232,7 +232,7 @@
 
                     switch (msgResult) {
                         case SWT.ABORT:
-                            return true;
+                            return false;
                         case SWT.IGNORE:
                             instanceLoc.set(defaultHomeURL, false);
                             keepTrying = false;
