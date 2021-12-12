diff --git a/jodd-core/src/main/java/jodd/io/FileUtil.java b/jodd-core/src/main/java/jodd/io/FileUtil.java
index b084cf9..85eb5e2 100644
--- a/jodd-core/src/main/java/jodd/io/FileUtil.java
+++ b/jodd-core/src/main/java/jodd/io/FileUtil.java
@@ -1029,7 +1029,7 @@
 			return false;
 		}
 
-		if (equals(file1, file1)) {
+		if (equals(file1, file2)) {
 			return true;
 		}
 
