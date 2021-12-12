diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/driver/DriverEditDialog.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/driver/DriverEditDialog.java
index 349d2bb..cfae21b 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/driver/DriverEditDialog.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/ui/dialogs/driver/DriverEditDialog.java
@@ -800,7 +800,7 @@
 //        driver.setAnonymousAccess(anonymousCheck.getSelection());
         driver.setModified(true);
 
-        driver.setDriverParameters(driverPropertySource.getProperties());
+        driver.setDriverParameters(driverPropertySource.getPropertiesWithDefaults());
         driver.setConnectionProperties(connectionPropertySource.getProperties());
 
         // Store client homes
