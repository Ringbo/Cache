diff --git a/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java b/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java
index 3be2daf..d7c139e 100644
--- a/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java
+++ b/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java
@@ -4249,7 +4249,7 @@
 
                 out.tab(1).javadoc("The parameter <code>%s</code>.%s", parameter.getQualifiedOutputName(), defaultIfBlank(" " + paramComment, ""));
 
-                out.tab(1).println("public static final %s<%s> %s = createParameter(\"%s\", %s, %s, %s" + converterTemplate(returnConverter) + converterTemplate(returnBinding) + ");",
+                out.tab(1).println("public static final %s<%s> %s = createParameter(\"%s\", %s, %s, %s" + converterTemplate(converter) + converterTemplate(binding) + ");",
                         Parameter.class, paramType, paramId, paramName, paramTypeRef, isDefaulted, isUnnamed, converter, binding);
             }
         }
