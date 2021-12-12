diff --git a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/codeInspection/type/GroovyTypeCheckVisitorHelper.java b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/codeInspection/type/GroovyTypeCheckVisitorHelper.java
index 4b31efe..53433fe 100644
--- a/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/codeInspection/type/GroovyTypeCheckVisitorHelper.java
+++ b/plugins/groovy/groovy-psi/src/org/jetbrains/plugins/groovy/codeInspection/type/GroovyTypeCheckVisitorHelper.java
@@ -191,7 +191,7 @@
 
     final ArrayList<LocalQuickFix> fixes = new ArrayList<LocalQuickFix>();
     for (Pair<Integer, PsiType> error : allErrors) {
-      if (args.size() > error.first) {
+      if (args.size() > error.first && error.second != null) {
         fixes.add(new ParameterCastFix(error.first, error.second, args.get(error.first)));
       }
     }
