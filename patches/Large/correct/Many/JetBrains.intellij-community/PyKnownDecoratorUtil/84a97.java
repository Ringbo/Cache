diff --git a/python/src/com/jetbrains/python/psi/PyKnownDecoratorUtil.java b/python/src/com/jetbrains/python/psi/PyKnownDecoratorUtil.java
index f09a48f..3c872b2 100644
--- a/python/src/com/jetbrains/python/psi/PyKnownDecoratorUtil.java
+++ b/python/src/com/jetbrains/python/psi/PyKnownDecoratorUtil.java
@@ -96,17 +96,18 @@
    * Map decorators of element to {@link com.jetbrains.python.psi.PyKnownDecoratorUtil.KnownDecorator}.
    *
    * @param element decoratable element to check
-   * @param context type evaluation context. If it's {@code null} or doesn't allow switch to AST only textual comparison will be performed.
+   * @param context type evaluation context. If it doesn't allow switch to AST, decorators will be compared by the text of the last component
+   *                of theirs qualified names.
    * @return list of known decorators in declaration order with duplicates (with any)
    */
   @NotNull
-  public static List<KnownDecorator> getKnownDecorators(@NotNull PyDecoratable element, @Nullable TypeEvalContext context) {
+  public static List<KnownDecorator> getKnownDecorators(@NotNull PyDecoratable element, @NotNull TypeEvalContext context) {
     final PyDecoratorList decoratorList = element.getDecoratorList();
     if (decoratorList == null) {
       return Collections.emptyList();
     }
     final List<KnownDecorator> result = new ArrayList<KnownDecorator>();
-    final boolean allowResolve = context != null && context.maySwitchToAST((PsiElement)element);
+    final boolean allowResolve = context.maySwitchToAST((PsiElement)element);
     for (PyDecorator decorator : decoratorList.getDecorators()) {
       final QualifiedName qualifiedName = decorator.getQualifiedName();
       if (qualifiedName == null) {
@@ -152,10 +153,11 @@
    * Check that given element has any non-standard (read "unreliable") decorators.
    *
    * @param element decoratable element to check
-   * @param context type evaluation context. If it's {@code null} or doesn't allow switch to AST only textual comparison will be performed.
+   * @param context type evaluation context. If it doesn't allow switch to AST, decorators will be compared by the text of the last component
+   *                of theirs qualified names.
    * @see PyKnownDecoratorUtil.KnownDecorator
    */
-  public static boolean hasUnknownDecorator(@NotNull PyDecoratable element, @Nullable TypeEvalContext context) {
+  public static boolean hasUnknownDecorator(@NotNull PyDecoratable element, @NotNull TypeEvalContext context) {
     return !allDecoratorsAreKnown(element, getKnownDecorators(element, context));
   }
 
@@ -163,10 +165,11 @@
    * Checks that given element has any non-builtin decorators.
    *
    * @param element decoratable element to check
-   * @param context type evaluation context. If it's {@code null} or doesn't allow switch to AST only textual comparison will be performed.
+   * @param context type evaluation context. If it doesn't allow switch to AST, decorators will be compared by the text of the last component
+   *                of theirs qualified names.
    * @see PyKnownDecoratorUtil.KnownDecorator
    */
-  public static boolean hasNonBuiltinDecorator(@NotNull PyDecoratable element, @Nullable TypeEvalContext context) {
+  public static boolean hasNonBuiltinDecorator(@NotNull PyDecoratable element, @NotNull TypeEvalContext context) {
     final List<KnownDecorator> knownDecorators = getKnownDecorators(element, context);
     if (!allDecoratorsAreKnown(element, knownDecorators)) {
       return true;
@@ -179,10 +182,11 @@
    * Checks that given function has any decorators from {@code abc} module.
    *
    * @param element Python function to check
-   * @param context type evaluation context. If it's {@code null} or doesn't allow switch to AST only textual comparison will be performed.
+   * @param context type evaluation context. If it doesn't allow switch to AST, decorators will be compared by the text of the last component
+   *                of theirs qualified names.
    * @see PyKnownDecoratorUtil.KnownDecorator
    */
-  public static boolean hasAbstractDecorator(@NotNull PyDecoratable element, @Nullable TypeEvalContext context) {
+  public static boolean hasAbstractDecorator(@NotNull PyDecoratable element, @NotNull TypeEvalContext context) {
     final List<KnownDecorator> knownDecorators = getKnownDecorators(element, context);
     if (knownDecorators.isEmpty()) {
       return false;
