diff --git a/src/main/java/org/apache/ibatis/type/TypeReference.java b/src/main/java/org/apache/ibatis/type/TypeReference.java
index fd53937..4d6cb5e 100644
--- a/src/main/java/org/apache/ibatis/type/TypeReference.java
+++ b/src/main/java/org/apache/ibatis/type/TypeReference.java
@@ -31,7 +31,8 @@
   protected TypeReference() {
     Type superclass = getClass().getGenericSuperclass();
     if (superclass instanceof Class) {
-      throw new RuntimeException("Missing type parameter.");
+      throw new TypeException("TypeHandler '" + getClass() + "' extends TypeReference but misses the type parameter. "
+        + "Remove the extension or add a type parameter to it.");
     }
     rawType = ((ParameterizedType) superclass).getActualTypeArguments()[0];
     // TODO remove this when Reflector is fixed to return Types
