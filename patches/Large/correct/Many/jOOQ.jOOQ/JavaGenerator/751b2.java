diff --git a/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java b/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java
index f653963..42f46e2 100644
--- a/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java
+++ b/jOOQ-codegen/src/main/java/org/jooq/util/JavaGenerator.java
@@ -1243,7 +1243,7 @@
     private final void generateRecordSetter0(TypedElementDefinition<?> column, int index, JavaWriter out) {
         final String comment = StringUtils.defaultString(column.getComment());
         final String className = getStrategy().getJavaClassName(column.getContainer(), Mode.RECORD);
-        final String setterReturnType = fluentSetters() ? className : tokenVoid;
+        final String setterReturnType = generateFluentSetters() ? className : tokenVoid;
         final String setter = getStrategy().getJavaSetterName(column, Mode.RECORD);
         final String type = out.ref(getJavaType(column.getType()));
         final String name = column.getQualifiedOutputName();
@@ -1259,7 +1259,7 @@
             if (scala) {
                 out.tab(1).println("def %s(value : %s) : %s = {", setter, type, setterReturnType);
                 out.tab(2).println("set(%s, value)", index);
-                if (fluentSetters())
+                if (generateFluentSetters())
                     out.tab(2).println("this");
                 out.tab(1).println("}");
             }
@@ -1267,7 +1267,7 @@
                 out.tab(1).overrideIf(generateInterfaces() && !generateImmutableInterfaces() && !isUDT);
                 out.tab(1).println("public %s %s(%s value) {", setterReturnType, setter, varargsIfArray(type));
                 out.tab(2).println("set(%s, value);", index);
-                if (fluentSetters())
+                if (generateFluentSetters())
                     out.tab(2).println("return this;");
                 out.tab(1).println("}");
             }
@@ -1289,7 +1289,7 @@
                 out.tab(3).println("set(%s, null)", index);
                 out.tab(2).println("else");
                 out.tab(3).println("set(%s, value.into(new %s()))", index, type);
-                if (fluentSetters())
+                if (generateFluentSetters())
                     out.tab(2).println("this");
                 out.tab(1).println("}");
             }
@@ -1322,7 +1322,7 @@
                     out.tab(2).println("}");
                 }
 
-                if (fluentSetters())
+                if (generateFluentSetters())
                     out.tab(2).println("return this;");
 
                 out.tab(1).println("}");
@@ -1525,7 +1525,7 @@
     private final void generateInterfaceSetter0(TypedElementDefinition<?> column, @SuppressWarnings("unused") int index, JavaWriter out) {
         final String className = getStrategy().getJavaClassName(column.getContainer(), Mode.INTERFACE);
         final String comment = StringUtils.defaultString(column.getComment());
-        final String setterReturnType = fluentSetters() ? className : "void";
+        final String setterReturnType = generateFluentSetters() ? className : "void";
         final String setter = getStrategy().getJavaSetterName(column, Mode.INTERFACE);
         final String type = out.ref(getJavaType(column.getType(), Mode.INTERFACE));
         final String name = column.getQualifiedOutputName();
@@ -2964,7 +2964,7 @@
     private final void generatePojoSetter0(TypedElementDefinition<?> column, @SuppressWarnings("unused") int index, JavaWriter out) {
         final String className = getStrategy().getJavaClassName(column.getContainer(), Mode.POJO);
         final String columnType = out.ref(getJavaType(column.getType(), Mode.POJO));
-        final String columnSetterReturnType = fluentSetters() ? className : (scala ? "Unit" : "void");
+        final String columnSetterReturnType = generateFluentSetters() ? className : (scala ? "Unit" : "void");
         final String columnSetter = getStrategy().getJavaSetterName(column, Mode.POJO);
         final String columnMember = getStrategy().getJavaMemberName(column, Mode.POJO);
         final boolean isUDT = column.getType().isUDT();
@@ -2977,7 +2977,7 @@
             if (scala) {
                 out.tab(1).println("def %s(%s : %s) : %s = {", columnSetter, columnMember, columnType, columnSetterReturnType);
                 out.tab(2).println("this.%s = %s", columnMember, columnMember);
-                if (fluentSetters())
+                if (generateFluentSetters())
                     out.tab(2).println("this");
                 out.tab(1).println("}");
             }
@@ -2985,7 +2985,7 @@
                 out.tab(1).overrideIf(generateInterfaces() && !generateImmutableInterfaces() && !isUDT);
                 out.tab(1).println("public %s %s(%s %s) {", columnSetterReturnType, columnSetter, varargsIfArray(columnType), columnMember);
                 out.tab(2).println("this.%s = %s;", columnMember, columnMember);
-                if (fluentSetters())
+                if (generateFluentSetters())
                     out.tab(2).println("return this;");
                 out.tab(1).println("}");
             }
@@ -3006,7 +3006,7 @@
                 out.tab(2).println("else");
                 out.tab(3).println("this.%s = %s.into(new %s)", columnMember, columnMember, columnType);
 
-                if (fluentSetters())
+                if (generateFluentSetters())
                     out.tab(2).println("this");
 
                 out.tab(1).println("}");
@@ -3034,7 +3034,7 @@
                     out.tab(2).println("}");
                 }
 
-                if (fluentSetters())
+                if (generateFluentSetters())
                     out.tab(2).println("return this;");
 
                 out.tab(1).println("}");
@@ -4383,7 +4383,7 @@
         out.tab(1).println("}");
 
         for (ParameterDefinition parameter : routine.getInParameters()) {
-            final String setterReturnType = fluentSetters() ? className : (scala ? "Unit" : "void");
+            final String setterReturnType = generateFluentSetters() ? className : (scala ? "Unit" : "void");
             final String setter = getStrategy().getJavaSetterName(parameter, Mode.DEFAULT);
             final String numberValue = parameter.getType().isGenericNumberType() ? "Number" : "Value";
             final String numberField = parameter.getType().isGenericNumberType() ? "Number" : "Field";
@@ -4409,14 +4409,14 @@
                 if (scala) {
                     out.tab(1).println("def %s(field : %s[%s]) : %s = {", setter, Field.class, refExtendsNumberType(out, parameter.getType()), setterReturnType);
                     out.tab(2).println("set%s(%s.%s, field)", numberField, className, paramId);
-                    if (fluentSetters())
+                    if (generateFluentSetters())
                         out.tab(2).println("this");
                     out.tab(1).println("}");
                 }
                 else {
                     out.tab(1).println("public %s %s(%s<%s> field) {", setterReturnType, setter, Field.class, refExtendsNumberType(out, parameter.getType()));
                     out.tab(2).println("set%s(%s, field);", numberField, paramId);
-                    if (fluentSetters())
+                    if (generateFluentSetters())
                         out.tab(2).println("return this;");
                     out.tab(1).println("}");
                 }
