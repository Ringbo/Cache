diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverFileDescriptor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverFileDescriptor.java
index bef646c..00dbaac 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverFileDescriptor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverFileDescriptor.java
@@ -134,7 +134,7 @@
         return path.startsWith(DriverDescriptor.DRIVERS_FOLDER);
     }
 
-    File getLocalFile()
+    private File getLocalFile()
     {
         // Try to use relative path from installation dir
         File file = new File(new File(Platform.getInstallLocation().getURL().getFile()), path);
