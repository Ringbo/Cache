diff --git a/springloaded/src/main/java/org/springsource/loaded/ClassRenamer.java b/springloaded/src/main/java/org/springsource/loaded/ClassRenamer.java
index af6cd30..a51b3ef 100644
--- a/springloaded/src/main/java/org/springsource/loaded/ClassRenamer.java
+++ b/springloaded/src/main/java/org/springsource/loaded/ClassRenamer.java
@@ -106,7 +106,7 @@
 			if (value!=null) {
 				return value;
 			}
-			if (string.indexOf(oldname) != -1) {
+			if (string != null && string.indexOf(oldname) != -1) {
 				return string.replace(oldname, newname);
 			}
 			return string;
