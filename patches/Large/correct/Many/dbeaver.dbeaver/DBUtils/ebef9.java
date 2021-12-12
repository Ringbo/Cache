diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java
index 7e57cd4..4f2cbc2 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/DBUtils.java
@@ -1284,7 +1284,7 @@
             case CONTENT:
                 if (typeName.contains("XML") || typeName.contains("xml")) {
                     return DBIcon.TYPE_XML;
-                } else if (typeName.contains("CHAR")) {
+                } else if (typeName.contains("CHAR") || typeName.contains("char")) {
                     return DBIcon.TYPE_TEXT;
                 }
                 return DBIcon.TYPE_LOB;
