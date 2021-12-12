diff --git a/src/main/java/org/apache/ibatis/type/TypeAliasRegistry.java b/src/main/java/org/apache/ibatis/type/TypeAliasRegistry.java
index 6679e1f..af0b681 100644
--- a/src/main/java/org/apache/ibatis/type/TypeAliasRegistry.java
+++ b/src/main/java/org/apache/ibatis/type/TypeAliasRegistry.java
@@ -124,7 +124,8 @@
     Set<Class<? extends Class<?>>> typeSet = resolverUtil.getClasses();
     for(Class<?> type : typeSet){
       //Ignore inner classes and interfaces (including package-info.java)
-      if (!type.isAnonymousClass() && !type.isInterface()) {
+      // Skip also inner classes. See issue #6
+      if (!type.isAnonymousClass() && !type.isInterface() && !type.isMemberClass()) {
         registerAlias(type);
       }
     }
