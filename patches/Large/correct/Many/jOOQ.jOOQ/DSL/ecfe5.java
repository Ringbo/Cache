diff --git a/jOOQ/src/main/java/org/jooq/impl/DSL.java b/jOOQ/src/main/java/org/jooq/impl/DSL.java
index a8d0e36..483de7d 100644
--- a/jOOQ/src/main/java/org/jooq/impl/DSL.java
+++ b/jOOQ/src/main/java/org/jooq/impl/DSL.java
@@ -11490,7 +11490,14 @@
      * @return The most specific data type
      */
     private static <T> DataType<T> mostSpecific(T value, DataType<T> dataType) {
-        if (value != null) {
+
+        // [#3888] With custom data type conversion, users may wish to
+        // allow for a less specific data type than the actual value. Example:
+        //   data type: Serializable
+        //   value    : byte[]
+        // [#3889] TODO: Improve this once DataType.getBinding() is available
+
+        if (value != null && !(dataType instanceof ConvertedDataType)) {
             Class<T> valueType = (Class<T>) value.getClass();
             Class<T> coercionType = dataType.getType();
 
