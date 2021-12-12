diff --git a/src/main/bugtraq/com/syntevo/bugtraq/BugtraqConfig.java b/src/main/bugtraq/com/syntevo/bugtraq/BugtraqConfig.java
index 7776e6f..60b4ecc 100644
--- a/src/main/bugtraq/com/syntevo/bugtraq/BugtraqConfig.java
+++ b/src/main/bugtraq/com/syntevo/bugtraq/BugtraqConfig.java
@@ -214,7 +214,7 @@
 			}
 			finally {
 				rw.dispose();
-				tw.release();
+				tw.close();
 			}
 
 			if (content == null) {
