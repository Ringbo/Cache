diff --git a/src/org/jetbrains/jet/j2k/visitors/TypeVisitor.java b/src/org/jetbrains/jet/j2k/visitors/TypeVisitor.java
index d77ca62..ac5555b 100644
--- a/src/org/jetbrains/jet/j2k/visitors/TypeVisitor.java
+++ b/src/org/jetbrains/jet/j2k/visitors/TypeVisitor.java
@@ -95,7 +95,7 @@
   }
 
   @NotNull
-  private String getClassTypeName(@NotNull PsiClassType classType) {
+  private static String getClassTypeName(@NotNull PsiClassType classType) {
     String canonicalTypeStr = classType.getCanonicalText();
     if (canonicalTypeStr.equals("java.lang.Object")) return "Any";
     if (canonicalTypeStr.equals("java.lang.Byte")) return "Byte";
@@ -106,7 +106,7 @@
     if (canonicalTypeStr.equals("java.lang.Long")) return "Long";
     if (canonicalTypeStr.equals("java.lang.Short")) return "Short";
     if (canonicalTypeStr.equals("java.lang.Boolean")) return "Boolean";
-    return classType.getClassName();
+    return classType.getClassName() != null ? classType.getClassName() : classType.getCanonicalText();
   }
 
   @Override
