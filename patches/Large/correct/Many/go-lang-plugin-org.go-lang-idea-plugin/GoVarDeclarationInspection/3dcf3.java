diff --git a/src/com/goide/inspections/GoVarDeclarationInspection.java b/src/com/goide/inspections/GoVarDeclarationInspection.java
index c911f1d..1046aa5 100644
--- a/src/com/goide/inspections/GoVarDeclarationInspection.java
+++ b/src/com/goide/inspections/GoVarDeclarationInspection.java
@@ -87,7 +87,7 @@
     if (assign == null) {
       return Pair.<List<? extends GoCompositeElement>, List<GoExpression>>create(ContainerUtil.<GoCompositeElement>emptyList(), ContainerUtil.<GoExpression>emptyList());
     }
-    if (varDeclaration instanceof GoRecvStatement) {
+    if (varDeclaration instanceof GoRecvStatement || varDeclaration instanceof GoRangeClause) {
       List<GoCompositeElement> v= ContainerUtil.newArrayList();
       List<GoExpression> e = ContainerUtil.newArrayList();
       for (PsiElement c : varDeclaration.getChildren()) {
