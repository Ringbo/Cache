diff --git a/querydsl-core/src/main/java/com/mysema/query/codegen/TypeUtil.java b/querydsl-core/src/main/java/com/mysema/query/codegen/TypeUtil.java
index 94fb434..b3b5858 100644
--- a/querydsl-core/src/main/java/com/mysema/query/codegen/TypeUtil.java
+++ b/querydsl-core/src/main/java/com/mysema/query/codegen/TypeUtil.java
@@ -2,20 +2,20 @@
 
 public final class TypeUtil {
 
-    public static Type transform(Type type, Type declaringType, EntityType model){
+    public static Type transform(Type type, Type declaringType, EntityType context){
         if (type instanceof TypeExtends){
             TypeExtends extendsType = (TypeExtends)type;
             if (extendsType.getVarName() != null){
-                type = extendsType.resolve(model, declaringType);
+                type = extendsType.resolve(context, declaringType);
             }            
         }
 
-        if(type.getParameterCount() > 0){
+        if(type != null && type.getParameterCount() > 0){
             Type[] params = new Type[type.getParameterCount()];
             boolean transformed = false;
             for (int i = 0; i < type.getParameterCount(); i++){
                 Type param = type.getParameter(i);
-                params[i] = transform(param, declaringType, model);
+                params[i] = transform(param, declaringType, context);
                 if (params[i] != param){
                     transformed = true;
                 }
