diff --git a/src/main/java/com/alibaba/druid/sql/dialect/postgresql/visitor/PGExportParameterVisitor.java b/src/main/java/com/alibaba/druid/sql/dialect/postgresql/visitor/PGExportParameterVisitor.java
index 50d820d..21d9c93 100644
--- a/src/main/java/com/alibaba/druid/sql/dialect/postgresql/visitor/PGExportParameterVisitor.java
+++ b/src/main/java/com/alibaba/druid/sql/dialect/postgresql/visitor/PGExportParameterVisitor.java
@@ -46,7 +46,7 @@
     }
 
     public PGExportParameterVisitor(final List<Object> parameters){
-        this(parameters,new StringBuilder(),false);
+        this(parameters,new StringBuilder(),true);
     }
 
     public PGExportParameterVisitor(final Appendable appender) {
