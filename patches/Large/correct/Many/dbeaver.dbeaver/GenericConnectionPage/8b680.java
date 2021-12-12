diff --git a/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/views/GenericConnectionPage.java b/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/views/GenericConnectionPage.java
index 0d35fa0..d98a537 100644
--- a/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/views/GenericConnectionPage.java
+++ b/plugins/org.jkiss.dbeaver.ext.generic/src/org/jkiss/dbeaver/ext/generic/views/GenericConnectionPage.java
@@ -314,7 +314,7 @@
                 if (
                     (prop.equals(DriverDescriptor.PROP_HOST) && CommonUtils.isEmptyTrimmed(hostText.getText())) ||
                     (prop.equals(DriverDescriptor.PROP_PORT) && CommonUtils.isEmptyTrimmed(portText.getText())) ||
-                    (prop.equals(DriverDescriptor.PROP_DATABASE) && CommonUtils.isEmptyTrimmed(pathText.getText())) ||
+                    (prop.equals(DriverDescriptor.PROP_DATABASE) && CommonUtils.isEmptyTrimmed(dbText.getText())) ||
                     ((prop.equals(DriverDescriptor.PROP_FILE) || prop.equals(DriverDescriptor.PROP_FOLDER)) && CommonUtils.isEmptyTrimmed(pathText.getText())))
                 {
                     return false;
