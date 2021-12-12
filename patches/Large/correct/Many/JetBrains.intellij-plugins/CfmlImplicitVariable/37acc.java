diff --git a/CFML/src/com/intellij/coldFusion/model/psi/CfmlImplicitVariable.java b/CFML/src/com/intellij/coldFusion/model/psi/CfmlImplicitVariable.java
index 7479b38..187479a 100644
--- a/CFML/src/com/intellij/coldFusion/model/psi/CfmlImplicitVariable.java
+++ b/CFML/src/com/intellij/coldFusion/model/psi/CfmlImplicitVariable.java
@@ -50,7 +50,7 @@
   private String cutScope(String name) {
     final int i = name.indexOf(".");
     if (i != -1 && CfmlScopesInfo.getScopeByString(name.substring(0, i)) != CfmlScopesInfo.DEFAULT_SCOPE) {
-      return name.substring(i + 1, name.length());
+      return name.substring(i + 1);
     }
     return name;
   }
