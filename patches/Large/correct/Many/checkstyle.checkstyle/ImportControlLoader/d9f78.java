diff --git a/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java b/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java
index d316277..fef63fe 100755
--- a/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java
+++ b/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/imports/ImportControlLoader.java
@@ -102,7 +102,7 @@
         final String aQName)
     {
         if (aQName.equals("subpackage")) {
-            assert mStack.size() > 2;
+            assert mStack.size() > 1;
             mStack.pop();
         }
     }
