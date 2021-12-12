diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/BlockParentHandler.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/BlockParentHandler.java
index a9eaa63..42bc180 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/BlockParentHandler.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/indentation/BlockParentHandler.java
@@ -162,7 +162,7 @@
             return;
         }
 
-        logError(lcurly, "lcurly", lcurlyPos);
+        logError(lcurly, "lcurly", lcurlyPos, curlyIndent());
     }
 
     /**
