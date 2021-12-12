diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalThrowsCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalThrowsCheck.java
index 0f9d635..14bec5f 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalThrowsCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/IllegalThrowsCheck.java
@@ -40,7 +40,7 @@
  * <b>ignoredMethodNames</b> - names of methods to ignore.
  * </p>
  * <p>
- * <b>ignoreOverridenMethods</b> - ignore checking overriden methods (marked with Override
+ * <b>ignoreOverriddenMethods</b> - ignore checking overridden methods (marked with Override
  *  or java.lang.Override annotation) default value is <b>true</b>.
  * </p>
  *
@@ -56,8 +56,8 @@
         "finalize",
     };
 
-    /** property for ignoring overriden methods. */
-    private boolean ignoreOverridenMethods = true;
+    /** property for ignoring overridden methods. */
+    private boolean ignoreOverriddenMethods = true;
 
     /** methods which should be ignored. */
     private final Set<String> ignoredMethodNames = Sets.newHashSet();
@@ -119,7 +119,7 @@
     private boolean isIgnorableMethod(DetailAST methodDef)
     {
         return shouldIgnoreMethod(methodDef.findFirstToken(TokenTypes.IDENT).getText())
-            || ignoreOverridenMethods
+            || ignoreOverriddenMethods
                && (AnnotationUtility.containsAnnotation(methodDef, "Override")
                   || AnnotationUtility.containsAnnotation(methodDef, "java.lang.Override"));
     }
@@ -145,11 +145,11 @@
     }
 
     /**
-     * Sets <b>ignoreOverridenMethods</b> property value.
-     * @param ignoreOverridenMethods Check's property.
+     * Sets <b>ignoreOverriddenMethods</b> property value.
+     * @param ignoreOverriddenMethods Check's property.
      */
-    public void setIgnoreOverridenMethods(boolean ignoreOverridenMethods)
+    public void setIgnoreOverriddenMethods(boolean ignoreOverriddenMethods)
     {
-        this.ignoreOverridenMethods = ignoreOverridenMethods;
+        this.ignoreOverriddenMethods = ignoreOverriddenMethods;
     }
 }
