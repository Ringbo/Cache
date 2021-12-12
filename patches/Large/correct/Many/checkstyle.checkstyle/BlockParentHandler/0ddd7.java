diff --git a/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/indentation/BlockParentHandler.java b/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/indentation/BlockParentHandler.java
index 3f6b8a6..69d7b77 100644
--- a/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/indentation/BlockParentHandler.java
+++ b/src/checkstyle/com/puppycrawl/tools/checkstyle/checks/indentation/BlockParentHandler.java
@@ -204,7 +204,7 @@
         {
             return;
         }
-        logError(rcurly, "rcurly", expandedTabsColumnNo(rcurly));
+        logError(rcurly, "rcurly", expandedTabsColumnNo(rcurly), curlyLevel());
     }
 
     /**
