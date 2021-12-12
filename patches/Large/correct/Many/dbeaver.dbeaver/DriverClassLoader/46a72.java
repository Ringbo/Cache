diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverClassLoader.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverClassLoader.java
index b5a4467..b87dba6 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverClassLoader.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverClassLoader.java
@@ -46,7 +46,7 @@
         String nativeName = System.mapLibraryName(libname);
         for (DriverFileDescriptor driverFile : driver.getFiles()) {
             if (driverFile.getType() == DBPDriverFileType.lib && driverFile.matchesCurrentPlatform()) {
-                final File localFile = driverFile.getLocalFile();
+                final File localFile = driverFile.getFile();
                 if (localFile.exists()) {
                     final String fileName = localFile.getName();
                     if (fileName.equalsIgnoreCase(nativeName)) {
