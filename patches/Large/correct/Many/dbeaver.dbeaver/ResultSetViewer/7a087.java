diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
index dbdeab4..423c6c6 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/controls/resultset/ResultSetViewer.java
@@ -507,7 +507,7 @@
                 this.availablePresentations = newPresentations;
                 if (!this.availablePresentations.isEmpty()) {
                     for (ResultSetPresentationDescriptor pd : this.availablePresentations) {
-                        if (pd == activePresentationDescriptor) {
+                        if (pd == activePresentationDescriptor && activePresentationDescriptor.getPresentationType().isPersistent()) {
                             // Keep the same presentation
                             return;
                         }
