diff --git a/core-metadata/src/main/java/org/apache/kylin/metadata/filter/UDF/MassInTupleFilter.java b/core-metadata/src/main/java/org/apache/kylin/metadata/filter/UDF/MassInTupleFilter.java
index edfde43..d0ff92e 100644
--- a/core-metadata/src/main/java/org/apache/kylin/metadata/filter/UDF/MassInTupleFilter.java
+++ b/core-metadata/src/main/java/org/apache/kylin/metadata/filter/UDF/MassInTupleFilter.java
@@ -150,7 +150,7 @@
         filterTableName = BytesUtil.readUTFString(buffer);
         filterTableResourceIdentifier = BytesUtil.readUTFString(buffer);
         filterTableType = Functions.FilterTableType.valueOf(BytesUtil.readUTFString(buffer));
-        reverse = Boolean.valueOf(BytesUtil.readUTFString(buffer));
+        reverse = Boolean.parseBoolean(BytesUtil.readUTFString(buffer));
     }
 
     public static boolean containsMassInTupleFilter(TupleFilter filter) {
