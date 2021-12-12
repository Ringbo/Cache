diff --git a/modules/swagger-core/src/main/java/io/swagger/v3/core/jackson/ModelResolver.java b/modules/swagger-core/src/main/java/io/swagger/v3/core/jackson/ModelResolver.java
index df1d55f..739a52d 100644
--- a/modules/swagger-core/src/main/java/io/swagger/v3/core/jackson/ModelResolver.java
+++ b/modules/swagger-core/src/main/java/io/swagger/v3/core/jackson/ModelResolver.java
@@ -445,7 +445,7 @@
             final AnnotatedMember member = propDef.getPrimaryMember();
             if (member != null && !ignore(member, xmlAccessorTypeAnnotation, propName, propertiesToIgnore)) {
 
-                JavaType propType = member.getType(beanDesc.bindingsForBeanType());
+                JavaType propType = member.getType();
                 property = resolveAnnotatedType(propType, member, propName, context, model, (t, a) -> {
                     JsonUnwrapped uw = member.getAnnotation(JsonUnwrapped.class);
                     if (uw != null && uw.enabled()) {
@@ -636,7 +636,7 @@
                     final String name = def.getName();
                     if (name != null && name.equals(propertyName)) {
                         final AnnotatedMember propMember = def.getPrimaryMember();
-                        final JavaType propType = propMember.getType(beanDesc.bindingsForBeanType());
+                        final JavaType propType = propMember.getType();
                         if (PrimitiveType.fromType(propType) != null) {
                             return PrimitiveType.createProperty(propType);
                         } else {
