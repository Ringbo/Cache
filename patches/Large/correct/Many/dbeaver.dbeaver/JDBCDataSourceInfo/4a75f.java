diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCDataSourceInfo.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCDataSourceInfo.java
index 0ba4c0a..579f880 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCDataSourceInfo.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCDataSourceInfo.java
@@ -176,7 +176,7 @@
 
     // Says to ignore DatabaseMetaData.isReadonly() results. It is broken in some drivers (always true), e.g. in Reshift.
     protected boolean isIgnoreReadOnlyFlag() {
-        return false;
+        return true;
     }
 
     private String makeTermString(String term, String defTerm)
