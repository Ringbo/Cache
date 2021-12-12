diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/ArrayInitHandler.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/ArrayInitHandler.java
index 4a18774..6403f76 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/ArrayInitHandler.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/ArrayInitHandler.java
@@ -50,8 +50,8 @@
             return new IndentLevel(getLineStart(parentAST));
         }
         else {
-            // at this point getParent() is instance of ArrayInitHandler
-            return ((ArrayInitHandler) getParent()).getChildrenExpectedLevel();
+            // at this point getParent() is instance of BlockParentHandler
+            return ((BlockParentHandler) getParent()).getChildrenExpectedLevel();
         }
     }
 
