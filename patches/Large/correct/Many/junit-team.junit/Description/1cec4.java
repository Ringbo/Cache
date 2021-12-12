diff --git a/src/main/java/org/junit/runner/Description.java b/src/main/java/org/junit/runner/Description.java
index 191dfc1..7cbd254 100644
--- a/src/main/java/org/junit/runner/Description.java
+++ b/src/main/java/org/junit/runner/Description.java
@@ -207,7 +207,7 @@
 		if (name == null)
 			return null;
 		try {
-			return Class.forName(name);
+			return Class.forName(name, false, getClass().getClassLoader());
 		} catch (ClassNotFoundException e) {
 			return null;
 		}
