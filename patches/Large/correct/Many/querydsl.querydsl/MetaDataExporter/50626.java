diff --git a/querydsl-sql/src/main/java/com/mysema/query/sql/MetaDataExporter.java b/querydsl-sql/src/main/java/com/mysema/query/sql/MetaDataExporter.java
index cd6d06f..68258c7 100644
--- a/querydsl-sql/src/main/java/com/mysema/query/sql/MetaDataExporter.java
+++ b/querydsl-sql/src/main/java/com/mysema/query/sql/MetaDataExporter.java
@@ -91,7 +91,8 @@
 //            if (camelCase){
 //                tableName = toCamelCase(tableName, true);
 //            }
-            Type type = new Type(null, "java.lang.Object",tableName);
+//            String superType, String packageName, String name, String simpleName
+            Type type = new Type(null, "java.lang", "java.lang.Object", tableName);
             ResultSet columns = md.getColumns(null, schemaPattern, tables.getString(3), null);
             while (columns.next()){
                 String _name = columns.getString(4);
@@ -108,9 +109,11 @@
                 }else{
                     _type = Field.Type.COMPARABLE;
                 }
+//                String name, String realName, String keyTypeName, String typePackage, String typeName
                 type.addField(new Field(
                         _name, columns.getString(4), null, 
-                        _class.getName(), _class.getSimpleName(), _type));
+                        _class.getPackage().getName(), _class.getName(), _class.getSimpleName(),
+                        _type));
             }
             columns.close();
             serialize(type);
