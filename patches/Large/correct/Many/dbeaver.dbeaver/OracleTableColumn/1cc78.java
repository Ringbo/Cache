diff --git a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/OracleTableColumn.java b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/OracleTableColumn.java
index 52e8837..9ce4ce4 100644
--- a/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/OracleTableColumn.java
+++ b/plugins/org.jkiss.dbeaver.ext.oracle/src/org/jkiss/dbeaver/ext/oracle/model/OracleTableColumn.java
@@ -180,7 +180,7 @@
         return comment;
     }
 
-    void setComment(String comment)
+    public void setComment(String comment)
     {
         this.comment = comment;
     }
