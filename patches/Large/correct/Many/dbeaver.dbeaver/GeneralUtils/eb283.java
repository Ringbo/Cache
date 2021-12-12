diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/utils/GeneralUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/utils/GeneralUtils.java
index 02de705..be66a13 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/utils/GeneralUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/utils/GeneralUtils.java
@@ -419,7 +419,11 @@
                     errorChain.add(makeExceptionStatus(severity, cause));
                 }
                 for (SQLException error = nextError; error != null; error = error.getNextException()) {
-                    errorChain.add(makeExceptionStatus(severity, error));
+                    errorChain.add(new Status(
+                        severity,
+                        ModelPreferences.PLUGIN_ID,
+                        getExceptionMessage(error),
+                        error));
                 }
                 return new MultiStatus(
                     ModelPreferences.PLUGIN_ID,
@@ -463,14 +467,14 @@
     }
 
     public static String getStatusText(IStatus status) {
-        String text = status.getMessage();
+        StringBuilder text = new StringBuilder(status.getMessage());
         IStatus[] children = status.getChildren();
         if (children != null && children.length > 0) {
             for (IStatus child : children) {
-                text += "\n" + getStatusText(child);
+                text.append("\n").append(getStatusText(child));
             }
         }
-        return text;
+        return text.toString();
     }
 
     /**
