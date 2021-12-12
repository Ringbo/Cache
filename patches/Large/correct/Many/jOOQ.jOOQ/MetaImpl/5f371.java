diff --git a/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java b/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
index 6249821..2186660 100644
--- a/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/MetaImpl.java
@@ -625,7 +625,7 @@
                 // TODO: Exception handling should be moved inside SQLDataType
                 DataType<?> type = null;
                 try {
-                    type = DefaultDataType.getDataType(configuration.dialect(), typeName, precision, scale);
+                    type = DefaultDataType.getDataType(configuration.family(), typeName, precision, scale);
 
                     // JDBC doesn't distinguish between precision and length
                     type = type.precision(precision, scale);
