diff --git a/junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/OS.java b/junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/OS.java
index ad7504f..ec62c24 100644
--- a/junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/OS.java
+++ b/junit-jupiter-api/src/main/java/org/junit/jupiter/api/condition/OS.java
@@ -100,7 +100,7 @@
 		if (osName.contains("mac")) {
 			return MAC;
 		}
-		if (osName.contains("solaris")) {
+		if (osName.contains("sunos") || osName.contains("solaris")) {
 			return SOLARIS;
 		}
 		if (osName.contains("win")) {
