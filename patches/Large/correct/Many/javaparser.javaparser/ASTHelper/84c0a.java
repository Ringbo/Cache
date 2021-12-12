diff --git a/javaparser-core/src/main/java/com/github/javaparser/ASTHelper.java b/javaparser-core/src/main/java/com/github/javaparser/ASTHelper.java
index 7e706cd..ba0d237 100644
--- a/javaparser-core/src/main/java/com/github/javaparser/ASTHelper.java
+++ b/javaparser-core/src/main/java/com/github/javaparser/ASTHelper.java
@@ -168,7 +168,7 @@
      */
     public static void addParameter(MethodDeclaration method, Parameter parameter) {
         List<Parameter> parameters = method.getParameters();
-        if (parameters == null) {
+        if (parameters == null || parameters.isEmpty()) {
             parameters = new ArrayList<Parameter>();
             method.setParameters(parameters);
         }
@@ -186,7 +186,7 @@
      */
     public static void addArgument(MethodCallExpr call, Expression arg) {
         List<Expression> args = call.getArgs();
-        if (args == null) {
+        if (args == null || args.isEmpty()) {
             args = new ArrayList<Expression>();
             call.setArgs(args);
         }
@@ -204,7 +204,7 @@
      */
     public static void addTypeDeclaration(CompilationUnit cu, TypeDeclaration type) {
         List<TypeDeclaration> types = cu.getTypes();
-        if (types == null) {
+        if (types == null || types.isEmpty()) {
             types = new ArrayList<TypeDeclaration>();
             cu.setTypes(types);
         }
@@ -247,7 +247,7 @@
      */
     public static void addStmt(BlockStmt block, Statement stmt) {
         List<Statement> stmts = block.getStmts();
-        if (stmts == null) {
+        if (stmts == null || stmts.isEmpty()) {
             stmts = new ArrayList<Statement>();
             block.setStmts(stmts);
         }
@@ -276,7 +276,7 @@
      */
     public static void addMember(TypeDeclaration type, BodyDeclaration decl) {
         List<BodyDeclaration> members = type.getMembers();
-        if (members == null) {
+        if (members == null || members.isEmpty()) {
             members = new ArrayList<BodyDeclaration>();
             type.setMembers(members);
         }
