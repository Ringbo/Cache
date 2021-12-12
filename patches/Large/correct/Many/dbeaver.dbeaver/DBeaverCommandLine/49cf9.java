diff --git a/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/DBeaverCommandLine.java b/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/DBeaverCommandLine.java
index 95b3d52..f5beb07 100644
--- a/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/DBeaverCommandLine.java
+++ b/plugins/org.jkiss.dbeaver.core.application/src/org/jkiss/dbeaver/core/application/DBeaverCommandLine.java
@@ -202,7 +202,7 @@
         try {
             return new DefaultParser().parse(ALL_OPTIONS, Platform.getApplicationArgs(), false);
         } catch (Exception e) {
-            log.error("Error parsing command line: " + e.getMessage());
+            log.warn("Error parsing command line: " + e.getMessage());
             return null;
         }
     }
