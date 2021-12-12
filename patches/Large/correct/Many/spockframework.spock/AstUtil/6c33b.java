diff --git a/spock-core/src/main/java/org/spockframework/compiler/AstUtil.java b/spock-core/src/main/java/org/spockframework/compiler/AstUtil.java
index 166987e..ba77ace 100755
--- a/spock-core/src/main/java/org/spockframework/compiler/AstUtil.java
+++ b/spock-core/src/main/java/org/spockframework/compiler/AstUtil.java
@@ -190,7 +190,7 @@
   public static Expression toArgumentArray(List<Expression> argList, IRewriteResourceProvider resourceProvider) {
     List<Expression> normalArgs = new ArrayList<Expression>();
     List<Expression> spreadArgs = new ArrayList<Expression>();
-    List<ConstantExpression> spreadPositions = new ArrayList<ConstantExpression>();
+    List<Expression> spreadPositions = new ArrayList<Expression>();
 
     for (int i = 0; i < argList.size(); i++) {
       Expression arg = argList.get(i);
