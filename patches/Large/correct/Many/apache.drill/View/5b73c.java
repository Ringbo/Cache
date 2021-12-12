diff --git a/exec/java-exec/src/main/java/org/apache/drill/exec/dotdrill/View.java b/exec/java-exec/src/main/java/org/apache/drill/exec/dotdrill/View.java
index ef55d68..7965e02 100644
--- a/exec/java-exec/src/main/java/org/apache/drill/exec/dotdrill/View.java
+++ b/exec/java-exec/src/main/java/org/apache/drill/exec/dotdrill/View.java
@@ -121,7 +121,7 @@
       names.add(field.name);
       if(field.precision == null && field.scale == null){
         types.add(factory.createSqlType(field.type));
-      }else if(field.precision != null){
+      }else if(field.precision != null && field.scale == null){
         types.add(factory.createSqlType(field.type, field.precision));
       }else{
         types.add(factory.createSqlType(field.type, field.precision, field.scale));
