diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java
index 06c86a9..70c59a8 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java
@@ -206,7 +206,7 @@
             if (namePart == null) {
                 continue;
             }
-            if (name.length() > 0) {
+            if (name.length() > 0 && name.charAt(name.length() - 1) != '.') {
                 name.append('.');
             }
             name.append(namePart);
