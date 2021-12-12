diff --git a/src/main/java/org/apache/ibatis/executor/resultset/PrimitiveTypes.java b/src/main/java/org/apache/ibatis/executor/resultset/PrimitiveTypes.java
index 09a6cc6..24aa995 100644
--- a/src/main/java/org/apache/ibatis/executor/resultset/PrimitiveTypes.java
+++ b/src/main/java/org/apache/ibatis/executor/resultset/PrimitiveTypes.java
@@ -39,7 +39,7 @@
 
   private void add(final Class<?> primitiveType, final Class<?> wrapperType) {
     primitiveToWrappers.put(primitiveType, wrapperType);
-    primitiveToWrappers.put(wrapperType, primitiveType);
+    wrappersToPrimitives.put(wrapperType, primitiveType);
   }
 
   public Class<?> getWrapper(final Class<?> primitiveType) {
