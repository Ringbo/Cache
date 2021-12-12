diff --git a/src/main/org/codehaus/groovy/runtime/StringGroovyMethods.java b/src/main/org/codehaus/groovy/runtime/StringGroovyMethods.java
index 7dd7bdf..e520bcc 100644
--- a/src/main/org/codehaus/groovy/runtime/StringGroovyMethods.java
+++ b/src/main/org/codehaus/groovy/runtime/StringGroovyMethods.java
@@ -147,7 +147,7 @@
     public static <T> T asType(GString self, Class<T> c) {
         if (c == File.class) {
             return (T) new File(self.toString());
-        } else if (Number.class.isAssignableFrom(c)) {
+        } else if (Number.class.isAssignableFrom(c) || c.isPrimitive()) {
             return asType(self.toString(), c);
         }
         return DefaultGroovyMethods.asType((Object) self, c);
