diff --git a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/BoxingSnippets.java b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/BoxingSnippets.java
index cf595c9..eb66246 100644
--- a/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/BoxingSnippets.java
+++ b/graal/com.oracle.graal.replacements/src/com/oracle/graal/replacements/BoxingSnippets.java
@@ -177,7 +177,7 @@
         if (value.isConstant()) {
             JavaConstant sourceConstant = value.asJavaConstant();
             JavaConstant boxedConstant = constantReflection.boxPrimitive(sourceConstant);
-            if (boxedConstant != null && boxedConstant.getKind() == box.getBoxingKind()) {
+            if (boxedConstant != null && sourceConstant.getKind() == box.getBoxingKind()) {
                 return ConstantNode.forConstant(boxedConstant, metaAccess, box.graph());
             }
         }
