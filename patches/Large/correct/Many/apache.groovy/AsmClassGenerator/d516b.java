diff --git a/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java b/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java
index 6019604..f8ecc7e 100644
--- a/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java
+++ b/src/main/org/codehaus/groovy/classgen/AsmClassGenerator.java
@@ -5845,11 +5845,11 @@
         }
         else if (object instanceof String) {
             String string = (String) object;
-            return string != null && "true".equalsIgnoreCase(string);
+            return string.length() > 0;
         }
         else if (object instanceof Number) {
             Number n = (Number) object;
-            return n.intValue() != 0;
+            return n.doubleValue() != 0;
         }
         else {
             return object != null;
