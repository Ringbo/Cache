diff --git a/java/org/apache/el/lang/FunctionMapperImpl.java b/java/org/apache/el/lang/FunctionMapperImpl.java
index 0a938d0..a101994 100644
--- a/java/org/apache/el/lang/FunctionMapperImpl.java
+++ b/java/org/apache/el/lang/FunctionMapperImpl.java
@@ -144,7 +144,7 @@
         public Method getMethod() {
             if (this.m == null) {
                 try {
-                    Class t = Class.forName(this.owner);
+                    Class t = ReflectionUtil.forName(this.owner);
                     Class[] p = ReflectionUtil.toTypeArray(this.types);
                     this.m = t.getMethod(this.name, p);
                 } catch (Exception e) {
