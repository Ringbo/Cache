diff --git a/src/main/java/org/junit/runner/Description.java b/src/main/java/org/junit/runner/Description.java
index b3083d5..b90df7f 100644
--- a/src/main/java/org/junit/runner/Description.java
+++ b/src/main/java/org/junit/runner/Description.java
@@ -204,7 +204,7 @@
 		if (name == null)
 			return null;
 		try {
-			return Class.forName(name);
+			return Class.forName(name, false, getClass().getClassLoader());
 		} catch (ClassNotFoundException e) {
 			return null;
 		}
