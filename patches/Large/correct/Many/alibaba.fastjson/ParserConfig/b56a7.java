diff --git a/src/main/java/com/alibaba/fastjson/parser/ParserConfig.java b/src/main/java/com/alibaba/fastjson/parser/ParserConfig.java
index 4226ed7..b4a4403 100644
--- a/src/main/java/com/alibaba/fastjson/parser/ParserConfig.java
+++ b/src/main/java/com/alibaba/fastjson/parser/ParserConfig.java
@@ -311,7 +311,7 @@
             return derializer;
         }
 
-        if (type instanceof WildcardType || type instanceof TypeVariable) {
+        if (type instanceof WildcardType || type instanceof TypeVariable || type instanceof ParameterizedType) {
             derializer = derializers.get(clazz);
         }
 
