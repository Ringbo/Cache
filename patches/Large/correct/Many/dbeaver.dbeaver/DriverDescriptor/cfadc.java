diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverDescriptor.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverDescriptor.java
index 8c18d84..69a93f7 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverDescriptor.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DriverDescriptor.java
@@ -823,7 +823,7 @@
         loadLibraries(runnableContext);
 
         if (!acceptDriverLicenses(runnableContext)) {
-            throw new DBException("You have to accept driver '" + getName() + "' license to be able to connect");
+            throw new DBException("You have to accept driver '" + getFullName() + "' license to be able to connect");
         }
 
         try {
