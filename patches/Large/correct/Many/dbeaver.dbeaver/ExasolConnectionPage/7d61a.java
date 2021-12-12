diff --git a/plugins/org.jkiss.dbeaver.ext.exasol/src/org/jkiss/dbeaver/ext/exasol/views/ExasolConnectionPage.java b/plugins/org.jkiss.dbeaver.ext.exasol/src/org/jkiss/dbeaver/ext/exasol/views/ExasolConnectionPage.java
index d2dadfb..2f840fa 100644
--- a/plugins/org.jkiss.dbeaver.ext.exasol/src/org/jkiss/dbeaver/ext/exasol/views/ExasolConnectionPage.java
+++ b/plugins/org.jkiss.dbeaver.ext.exasol/src/org/jkiss/dbeaver/ext/exasol/views/ExasolConnectionPage.java
@@ -79,7 +79,7 @@
             hostText.setLayoutData(gd);
             hostText.addModifyListener(textListener);
             
-            Label backupHostLabel = UIUtils.createControlLabel(addrGroup, "Backup Host List");
+            final Label backupHostLabel = UIUtils.createControlLabel(addrGroup, "Backup Host List");
             gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
             backupHostLabel.setLayoutData(gd);
             backupHostLabel.setEnabled(showBackupHosts);
