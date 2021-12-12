diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/utils/GeneralUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/utils/GeneralUtils.java
index 24e7979..176dbc3 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/utils/GeneralUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/utils/GeneralUtils.java
@@ -439,8 +439,7 @@
                     errorChain.add(new Status(
                         severity,
                         ModelPreferences.PLUGIN_ID,
-                        getExceptionMessage(error),
-                        error));
+                        getExceptionMessage(error)));
                 }
                 return new MultiStatus(
                     ModelPreferences.PLUGIN_ID,
@@ -449,12 +448,14 @@
                     getExceptionMessage(ex),
                     ex);
             } else {
+                // Pass null exception to avoid dups in error message.
+                // Real exception stacktrace will be passed in the root cause
                 return new MultiStatus(
                     ModelPreferences.PLUGIN_ID,
                     0,
                     new IStatus[]{makeExceptionStatus(severity, cause)},
                     getExceptionMessage(ex),
-                    ex);
+                    null);
             }
         }
     }
