diff --git a/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFDateSub.java b/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFDateSub.java
index cb13060..290a5bc 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFDateSub.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFDateSub.java
@@ -89,7 +89,7 @@
     if (arguments[1].getCategory() != ObjectInspector.Category.PRIMITIVE) {
       throw new UDFArgumentTypeException(1,
           "Only primitive type arguments are accepted but "
-              + arguments[2].getTypeName() + " is passed. as second arguments");
+              + arguments[1].getTypeName() + " is passed. as second arguments");
     }
 
     inputType1 = ((PrimitiveObjectInspector) arguments[0]).getPrimitiveCategory();
