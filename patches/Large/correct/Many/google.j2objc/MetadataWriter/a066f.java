diff --git a/translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java b/translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java
index a5fc428..aa7a3bd 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/translate/MetadataWriter.java
@@ -208,7 +208,7 @@
         // Add property accessor and static default methods.
         for (AnnotationTypeMemberDeclaration decl : TreeUtil.getAnnotationMembers(typeNode)) {
           String name = decl.getName().getIdentifier();
-          String returnType = getTypeName(decl.getMethodBinding().getReturnType());
+          String returnType = getTypeName2(decl.getMethodBinding().getReturnType());
           String metadata = UnicodeUtils.format("    { %s, %s, 0x%x, -1, -1, -1, -1, -1 },\n",
               cStr(name), cStr(returnType),
               java.lang.reflect.Modifier.PUBLIC | java.lang.reflect.Modifier.ABSTRACT);
@@ -236,7 +236,7 @@
       }
 
       int modifiers = getMethodModifiers(method) & BindingUtil.ACC_FLAG_MASK;
-      String returnTypeStr = method.isConstructor() ? null : getTypeName(method.getReturnType());
+      String returnTypeStr = method.isConstructor() ? null : getTypeName2(method.getReturnType());
       return UnicodeUtils.format("    { \"%s\", %s, 0x%x, %s, %s, %s, %s, %s },\n",
           selector, cStr(returnTypeStr), modifiers, cStrIdx(methodName),
           cStrIdx(getTypeList(method.getExceptionTypes())),
