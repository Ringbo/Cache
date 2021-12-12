diff --git a/core/src/main/java/org/eigenbase/sql/SqlDataTypeSpec.java b/core/src/main/java/org/eigenbase/sql/SqlDataTypeSpec.java
index b262924..0e6c079 100644
--- a/core/src/main/java/org/eigenbase/sql/SqlDataTypeSpec.java
+++ b/core/src/main/java/org/eigenbase/sql/SqlDataTypeSpec.java
@@ -99,7 +99,7 @@
   //~ Methods ----------------------------------------------------------------
 
   public SqlNode clone(SqlParserPos pos) {
-    return (collectionsTypeName == null)
+    return (collectionsTypeName != null)
         ? new SqlDataTypeSpec(collectionsTypeName, typeName, precision, scale,
             charSetName, pos)
         : new SqlDataTypeSpec(typeName, precision, scale, charSetName, timeZone,
