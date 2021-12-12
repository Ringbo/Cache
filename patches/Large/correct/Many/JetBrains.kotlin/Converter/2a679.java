diff --git a/src/org/jetbrains/jet/j2k/Converter.java b/src/org/jetbrains/jet/j2k/Converter.java
index 84531d4..016bcd0 100644
--- a/src/org/jetbrains/jet/j2k/Converter.java
+++ b/src/org/jetbrains/jet/j2k/Converter.java
@@ -196,7 +196,7 @@
     private static List<Parameter> createParametersFromFields(@NotNull List<? extends Field> fields) {
         List<Parameter> result = new LinkedList<Parameter>();
         for (Field f : fields)
-            result.add(new Parameter(new IdentifierImpl("_" + f.getIdentifier().getName()), f.getType(), false));
+            result.add(new Parameter(new IdentifierImpl("_" + f.getIdentifier().getName()), f.getType(), true));
         return result;
     }
 
@@ -670,7 +670,7 @@
         return new Parameter(
                 new IdentifierImpl(parameter.getName()),
                 typeToType(parameter.getType(), ConverterUtil.isAnnotatedAsNotNull(parameter.getModifierList())),
-                false
+                true
         );
     }
 
