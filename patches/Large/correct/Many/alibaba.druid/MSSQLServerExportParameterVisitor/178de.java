diff --git a/src/main/java/com/alibaba/druid/sql/dialect/sqlserver/visitor/MSSQLServerExportParameterVisitor.java b/src/main/java/com/alibaba/druid/sql/dialect/sqlserver/visitor/MSSQLServerExportParameterVisitor.java
index 3cd037f..f0ca185 100644
--- a/src/main/java/com/alibaba/druid/sql/dialect/sqlserver/visitor/MSSQLServerExportParameterVisitor.java
+++ b/src/main/java/com/alibaba/druid/sql/dialect/sqlserver/visitor/MSSQLServerExportParameterVisitor.java
@@ -46,7 +46,7 @@
     }
 
     public MSSQLServerExportParameterVisitor(final List<Object> parameters){
-        this(parameters,new StringBuilder(),false);
+        this(parameters,new StringBuilder(),true);
     }
 
     public MSSQLServerExportParameterVisitor(final Appendable appender) {
