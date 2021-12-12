diff --git a/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFDateAdd.java b/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFDateAdd.java
index e2db7b1..0073812 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFDateAdd.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFDateAdd.java
@@ -89,7 +89,7 @@
     if (arguments[1].getCategory() != ObjectInspector.Category.PRIMITIVE) {
       throw new UDFArgumentTypeException(1,
         "Only primitive type arguments are accepted but "
-        + arguments[2].getTypeName() + " is passed. as second arguments");
+        + arguments[1].getTypeName() + " is passed. as second arguments");
     }
 
     inputType1 = ((PrimitiveObjectInspector) arguments[0]).getPrimitiveCategory();
