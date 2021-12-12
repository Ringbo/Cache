diff --git a/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSourceFileGenerator.java b/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSourceFileGenerator.java
index dc32432..49a89b7 100644
--- a/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSourceFileGenerator.java
+++ b/translator/src/main/java/com/google/devtools/j2objc/gen/ObjectiveCSourceFileGenerator.java
@@ -599,7 +599,7 @@
     for (Iterator<SingleVariableDeclaration> iter = function.getParameters().iterator();
          iter.hasNext(); ) {
       IVariableBinding var = iter.next().getVariableBinding();
-      String paramType = NameTable.getObjCType(var.getType());
+      String paramType = NameTable.getSpecificObjCType(var.getType());
       paramType += (paramType.endsWith("*") ? "" : " ");
       sb.append(paramType + NameTable.getName(var));
       if (iter.hasNext()) {
