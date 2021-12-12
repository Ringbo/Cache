diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
index 35aaa12..f953ce4 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/imports/CustomImportOrderCheck.java
@@ -726,7 +726,7 @@
 
         }
         else {
-            throw new RuntimeException("Unexpected rule: " + ruleStr);
+            throw new IllegalStateException("Unexpected rule: " + ruleStr);
         }
     }
 
