diff --git a/querydsl-core/src/main/java/com/mysema/query/codegen/TypeResolver.java b/querydsl-core/src/main/java/com/mysema/query/codegen/TypeResolver.java
index c0199cd..490ee03 100644
--- a/querydsl-core/src/main/java/com/mysema/query/codegen/TypeResolver.java
+++ b/querydsl-core/src/main/java/com/mysema/query/codegen/TypeResolver.java
@@ -48,7 +48,7 @@
             }
         }
 
-        if (index > -1){
+        if (index > -1 && subtype.getSuperType() != null){
             // get binding of var via model supertype
             Supertype type = subtype.getSuperType();
             while (!type.getType().equals(declaringType)){
