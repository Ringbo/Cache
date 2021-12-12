diff --git a/src/org/jetbrains/postfixCompletion/lookupItems/StatementPostfixLookupElement.java b/src/org/jetbrains/postfixCompletion/lookupItems/StatementPostfixLookupElement.java
index 38ad044..e49b37c 100644
--- a/src/org/jetbrains/postfixCompletion/lookupItems/StatementPostfixLookupElement.java
+++ b/src/org/jetbrains/postfixCompletion/lookupItems/StatementPostfixLookupElement.java
@@ -9,14 +9,14 @@
 import org.jetbrains.annotations.NotNull;
 import org.jetbrains.postfixCompletion.infrastructure.PrefixExpressionContext;
 
-public abstract class StatementPostfixLookupElement<TStatement extends PsiStatement> extends PostfixLookupElementBase<TStatement> {
+public abstract class StatementPostfixLookupElement<T extends PsiStatement> extends PostfixLookupElementBase<T> {
   public StatementPostfixLookupElement(@NotNull String lookupString, @NotNull PrefixExpressionContext context) {
     super(lookupString, context);
   }
 
   @Override
   @NotNull
-  protected TStatement handlePostfixInsert(@NotNull InsertionContext context, @NotNull PrefixExpressionContext expressionContext) {
+  protected T handlePostfixInsert(@NotNull InsertionContext context, @NotNull PrefixExpressionContext expressionContext) {
     // get facade and factory while all elements are physical and valid
     Project project = expressionContext.expression.getProject();
     JavaPsiFacade psiFacade = JavaPsiFacade.getInstance(project);
@@ -30,19 +30,19 @@
     assert targetStatement != null;
 
     PsiElement expressionCopy = fixedContext.expression.copy();
-    TStatement newStatement = createNewStatement(elementFactory, expressionCopy, fixedContext.expression);
+    T newStatement = createNewStatement(elementFactory, expressionCopy, fixedContext.expression);
 
     @SuppressWarnings("unchecked")
-    TStatement replaced = (TStatement)targetStatement.replace(newStatement);
+    T replaced = (T)targetStatement.replace(newStatement);
 
     return replaced;
   }
 
   @NotNull
-  protected abstract TStatement createNewStatement(@NotNull PsiElementFactory factory, @NotNull PsiElement expression, @NotNull PsiElement context);
+  protected abstract T createNewStatement(@NotNull PsiElementFactory factory, @NotNull PsiElement expression, @NotNull PsiElement context);
 
   @Override
-  protected void postProcess(@NotNull InsertionContext context, @NotNull TStatement statement) {
+  protected void postProcess(@NotNull InsertionContext context, @NotNull T statement) {
     int offset = statement.getTextRange().getEndOffset();
     context.getEditor().getCaretModel().moveToOffset(offset);
   }
