diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheck.java
index 03766f4..776effc 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/javadoc/JavadocMethodCheck.java
@@ -725,8 +725,8 @@
                         || child.getType() == TokenTypes.DOT)
                 {
                     final FullIdent fi = FullIdent.createFullIdent(child);
-                    final ExceptionInfo ei = new ExceptionInfo(new Token(fi),
-                            getCurrentClassName());
+                    final ExceptionInfo ei = new ExceptionInfo(createClassInfo(new Token(fi),
+                            getCurrentClassName()));
                     retVal.add(ei);
                 }
                 child = child.getNextSibling();
@@ -1076,7 +1076,7 @@
     }
 
     /** Stores useful information about declared exception. */
-    private class ExceptionInfo
+    private static class ExceptionInfo
     {
         /** does the exception have throws tag associated with. */
         private boolean found;
@@ -1086,12 +1086,11 @@
         /**
          * Creates new instance for <code>FullIdent</code>.
          *
-         * @param ident the exception
-         * @param currentClass name of current class.
+         * @param classInfo clas info
          */
-        ExceptionInfo(Token ident, String currentClass)
+        ExceptionInfo(ClassInfo classInfo)
         {
-            classInfo = createClassInfo(ident, currentClass);
+            this.classInfo = classInfo;
         }
 
         /** Mark that the exception has associated throws tag */
