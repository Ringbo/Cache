diff --git a/jOOQ/src/main/java/org/jooq/impl/DSL.java b/jOOQ/src/main/java/org/jooq/impl/DSL.java
index 41d8361..c739bf6 100644
--- a/jOOQ/src/main/java/org/jooq/impl/DSL.java
+++ b/jOOQ/src/main/java/org/jooq/impl/DSL.java
@@ -9959,7 +9959,7 @@
      * @see #power(Field, Number)
      */
     @Support({ CUBRID, FIREBIRD, H2, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE })
-    public static <T extends Number> Field<T> shl(T value1, T value2) {
+    public static <T extends Number> Field<T> shl(T value1, Number value2) {
         return shl(Utils.field(value1), Utils.field(value2));
     }
 
@@ -9970,7 +9970,7 @@
      * @see #power(Field, Number)
      */
     @Support({ CUBRID, FIREBIRD, H2, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE })
-    public static <T extends Number> Field<T> shl(T value1, Field<T> value2) {
+    public static <T extends Number> Field<T> shl(T value1, Field<? extends Number> value2) {
         return shl(Utils.field(value1), nullSafe(value2));
     }
 
@@ -9981,7 +9981,7 @@
      * @see #power(Field, Number)
      */
     @Support({ CUBRID, FIREBIRD, H2, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE })
-    public static <T extends Number> Field<T> shl(Field<T>value1, T value2) {
+    public static <T extends Number> Field<T> shl(Field<T>value1, Number value2) {
         return shl(nullSafe(value1), Utils.field(value2));
     }
 
@@ -9995,7 +9995,7 @@
      * @see #power(Field, Field)
      */
     @Support({ CUBRID, FIREBIRD, H2, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE })
-    public static <T extends Number> Field<T> shl(Field<T> field1, Field<T> field2) {
+    public static <T extends Number> Field<T> shl(Field<T> field1, Field<? extends Number> field2) {
         return new Expression<T>(ExpressionOperator.SHL, nullSafe(field1), nullSafe(field2));
     }
 
@@ -10006,7 +10006,7 @@
      * @see #power(Field, Number)
      */
     @Support({ CUBRID, FIREBIRD, H2, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE })
-    public static <T extends Number> Field<T> shr(T value1, T value2) {
+    public static <T extends Number> Field<T> shr(T value1, Number value2) {
         return shr(Utils.field(value1), Utils.field(value2));
     }
 
@@ -10017,7 +10017,7 @@
      * @see #power(Field, Number)
      */
     @Support({ CUBRID, FIREBIRD, H2, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE })
-    public static <T extends Number> Field<T> shr(T value1, Field<T> value2) {
+    public static <T extends Number> Field<T> shr(T value1, Field<? extends Number> value2) {
         return shr(Utils.field(value1), nullSafe(value2));
     }
 
@@ -10028,7 +10028,7 @@
      * @see #power(Field, Number)
      */
     @Support({ CUBRID, FIREBIRD, H2, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE })
-    public static <T extends Number> Field<T> shr(Field<T> value1, T value2) {
+    public static <T extends Number> Field<T> shr(Field<T> value1, Number value2) {
         return shr(nullSafe(value1), Utils.field(value2));
     }
 
@@ -10042,7 +10042,7 @@
      * @see #power(Field, Field)
      */
     @Support({ CUBRID, H2, FIREBIRD, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE })
-    public static <T extends Number> Field<T> shr(Field<T> field1, Field<T> field2) {
+    public static <T extends Number> Field<T> shr(Field<T> field1, Field<? extends Number> field2) {
         return new Expression<T>(ExpressionOperator.SHR, nullSafe(field1), nullSafe(field2));
     }
 
