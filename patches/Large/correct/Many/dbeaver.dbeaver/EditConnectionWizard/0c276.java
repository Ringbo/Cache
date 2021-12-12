diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/connection/EditConnectionWizard.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/connection/EditConnectionWizard.java
index 62fc3d4..904df4c 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/connection/EditConnectionWizard.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/connection/EditConnectionWizard.java
@@ -138,7 +138,7 @@
         WizardPrefPage wizardPage = new WizardPrefPage(prefPage, title, description);
         prefPages.add(wizardPage);
         if (prefPage instanceof IWorkbenchPropertyPage) {
-            ((IWorkbenchPropertyPage) prefPage).setElement(dataSource);
+            ((IWorkbenchPropertyPage) prefPage).setElement(originalDataSource);
         }
         addPage(wizardPage);
         return wizardPage;
