diff --git a/src/lombok/javac/HandlerLibrary.java b/src/lombok/javac/HandlerLibrary.java
index ff21bd3..20902e8 100644
--- a/src/lombok/javac/HandlerLibrary.java
+++ b/src/lombok/javac/HandlerLibrary.java
@@ -140,7 +140,7 @@
 	
 	/** Generates an error in the Messager that was used to initialize this HandlerLibrary. */
 	public void javacError(String message) {
-		javacWarning(message, null);
+		javacError(message, null);
 	}
 	
 	/** Generates an error in the Messager that was used to initialize this HandlerLibrary. */
