diff --git a/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/JavadocMethodCheck.java b/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/JavadocMethodCheck.java
index 469e3f1..91e69a2 100644
--- a/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/JavadocMethodCheck.java
+++ b/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/JavadocMethodCheck.java
@@ -39,7 +39,8 @@
  * <p>
  * Checks the Javadoc of a method or constructor.
  * By default, does not check for unused throws.
- * To check for unused throws, set property checkUnusedThrows to true.
+ * To allow documented <code>java.lang.RuntimeException</code>s
+ * that are not declared, set property allowUndeclaredRTE to true.
  * The scope to verify is specified using the {@link Scope} class and
  * defaults to {@link Scope#PRIVATE}. To verify another scope,
  * set property scope to one of the {@link Scope} constants.
@@ -50,13 +51,14 @@
  * <pre>
  * &lt;module name="JavadocMethod"/&gt;
  * </pre>
- * <p> An example of how to configure the check to check for unused imports
+ * <p> An example of how to configure the check to check to allow
+ * documentation of undeclared RuntimeExceptions
  * and for the {@link Scope#PUBLIC} scope is:
  *</p>
  * <pre>
  * &lt;module name="JavadocMethod"&gt;
  *    &lt;property name="scope" value="public"/&gt;
- *    &lt;property name="checkUnusedThrows" value="true"/&gt;
+ *    &lt;property name="allowUndeclaredRTE" value="true"/&gt;
  * &lt;/module&gt;
  * </pre>
  *
@@ -121,8 +123,12 @@
     /** the visibility scope where Javadoc comments are checked **/
     private Scope mScope = Scope.PRIVATE;
 
-    /** check for unused throws **/
-    private boolean mCheckUnusedThrows = false;
+    /**
+     * controls whether to allow documented exceptions that
+     * are not declared if they are a subclass of
+     * java.lang.RuntimeException.
+     **/
+    private boolean mAllowUndeclaredRTE = false;
 
     /**
      * Set the scope.
@@ -134,12 +140,14 @@
     }
 
     /**
-     * Set whether to check for unused throws.
+     * controls whether to allow documented exceptions that
+     * are not declared if they are a subclass of
+     * java.lang.RuntimeException.
      * @param aFlag a <code>Boolean</code> value
      */
-    public void setCheckUnusedThrows(boolean aFlag)
+    public void setAllowUndeclaredRTE(boolean aFlag)
     {
-        mCheckUnusedThrows = aFlag;
+        mAllowUndeclaredRTE = aFlag;
     }
 
     /** @see com.puppycrawl.tools.checkstyle.api.Check */
@@ -179,12 +187,12 @@
     public void visitToken(DetailAST aAST)
     {
         if (aAST.getType() == TokenTypes.PACKAGE_DEF) {
-            if (mCheckUnusedThrows) {
+            if (mAllowUndeclaredRTE) {
                 processPackage(aAST);
             }
         }
         else if (aAST.getType() == TokenTypes.IMPORT) {
-            if (mCheckUnusedThrows) {
+            if (mAllowUndeclaredRTE) {
                 processImport(aAST);
             }
         }
@@ -510,7 +518,7 @@
             // Handle extra JavadocTag.
             if (!found) {
                 boolean reqd = true;
-                if (mCheckUnusedThrows) {
+                if (mAllowUndeclaredRTE) {
                     final ClassResolver cr =
                         new ClassResolver(
                             getClassLoader(),
