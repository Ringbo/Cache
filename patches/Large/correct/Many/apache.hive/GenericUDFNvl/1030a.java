diff --git a/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFNvl.java b/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFNvl.java
index 625b466..0a16da8 100644
--- a/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFNvl.java
+++ b/ql/src/java/org/apache/hadoop/hive/ql/udf/generic/GenericUDFNvl.java
@@ -42,7 +42,7 @@
     returnOIResolver = new GenericUDFUtils.ReturnObjectInspectorResolver(true);
     if (!(returnOIResolver.update(arguments[0]) && returnOIResolver
         .update(arguments[1]))) {
-      throw new UDFArgumentTypeException(2,
+      throw new UDFArgumentTypeException(1,
           "The first and seconds arguments of function NLV should have the same type, "
           + "but they are different: \"" + arguments[0].getTypeName()
           + "\" and \"" + arguments[1].getTypeName() + "\"");
