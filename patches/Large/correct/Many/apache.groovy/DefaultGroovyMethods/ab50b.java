diff --git a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
index 8e93a84..9ae883a 100644
--- a/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
+++ b/src/main/org/codehaus/groovy/runtime/DefaultGroovyMethods.java
@@ -11951,19 +11951,19 @@
             return toBigDecimal(self);
         } else if (c == BigInteger.class) {
             return toBigInteger(self);
-        } else if (c == Long.class) {
+        } else if (c == Long.class || c == Long.TYPE) {
             return toLong(self);
-        } else if (c == Integer.class) {
+        } else if (c == Integer.class || c == Integer.TYPE) {
             return toInteger(self);
-        } else if (c == Short.class) {
+        } else if (c == Short.class || c == Short.TYPE) {
             return toShort(self);
-        } else if (c == Byte.class) {
+        } else if (c == Byte.class || c == Byte.TYPE) {
             return Byte.valueOf(self.trim());
-        } else if (c == Character.class) {
+        } else if (c == Character.class || c == Character.TYPE) {
             return toCharacter(self);
-        } else if (c == Double.class) {
+        } else if (c == Double.class || c == Double.TYPE) {
             return toDouble(self);
-        } else if (c == Float.class) {
+        } else if (c == Float.class || c == Float.TYPE) {
             return toFloat(self);
         } else if (c == File.class) {
             return new File(self);
