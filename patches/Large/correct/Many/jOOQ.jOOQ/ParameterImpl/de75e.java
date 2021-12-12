diff --git a/jOOQ/src/main/java/org/jooq/impl/ParameterImpl.java b/jOOQ/src/main/java/org/jooq/impl/ParameterImpl.java
index 405691e..d02a758 100644
--- a/jOOQ/src/main/java/org/jooq/impl/ParameterImpl.java
+++ b/jOOQ/src/main/java/org/jooq/impl/ParameterImpl.java
@@ -75,7 +75,7 @@
             ? binding
             : type instanceof ConvertedDataType
             ? ((ConvertedDataType<?, T>) type).binding()
-            : new DefaultBinding<T, T>(new IdentityConverter<T>(type.getType()));
+            : new DefaultBinding<T, T>(new IdentityConverter<T>(type.getType()), type.isLob());
     }
 
     @Override
