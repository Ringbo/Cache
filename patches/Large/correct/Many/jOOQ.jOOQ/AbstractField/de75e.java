diff --git a/jOOQ/src/main/java/org/jooq/impl/AbstractField.java b/jOOQ/src/main/java/org/jooq/impl/AbstractField.java
index 167711b..242af5f 100644
--- a/jOOQ/src/main/java/org/jooq/impl/AbstractField.java
+++ b/jOOQ/src/main/java/org/jooq/impl/AbstractField.java
@@ -131,7 +131,7 @@
           ? binding
           : type instanceof ConvertedDataType
           ? ((ConvertedDataType<?, T>) type).binding()
-          : new DefaultBinding<T, T>(new IdentityConverter<T>(type.getType()));
+          : new DefaultBinding<T, T>(new IdentityConverter<T>(type.getType()), type.isLob());
     }
 
     // ------------------------------------------------------------------------
