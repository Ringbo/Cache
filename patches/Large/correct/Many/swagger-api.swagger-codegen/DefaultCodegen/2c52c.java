diff --git a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java
index 8c2d0e7..219c5a5 100644
--- a/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java
+++ b/modules/swagger-codegen/src/main/java/io/swagger/codegen/DefaultCodegen.java
@@ -1496,15 +1496,15 @@
             p.pattern = qp.getPattern();
             
             p.maximum = qp.getMaximum();
-            p.exclusiveMaximum = qp.getExclusiveMaximum();
+            p.exclusiveMaximum = qp.isExclusiveMaximum();
             p.minimum = qp.getMinimum();
-            p.exclusiveMinimum = qp.getExclusiveMinimum();
+            p.exclusiveMinimum = qp.isExclusiveMinimum();
             p.maxLength = qp.getMaxLength();
             p.minLength = qp.getMinLength();
             p.pattern = qp.getPattern();
             p.maxItems = qp.getMaxItems();
             p.minItems = qp.getMinItems();
-            p.uniqueItems = qp.getUniqueItems();
+            p.uniqueItems = qp.isUniqueItems();
             p.multipleOf = qp.getMultipleOf();
         } else {
             if (!(param instanceof BodyParameter)) {
