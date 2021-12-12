diff --git a/org.springframework.expression/src/main/java/org/springframework/expression/ParseException.java b/org.springframework.expression/src/main/java/org/springframework/expression/ParseException.java
index 5c94688..cb0ff8a 100644
--- a/org.springframework.expression/src/main/java/org/springframework/expression/ParseException.java
+++ b/org.springframework.expression/src/main/java/org/springframework/expression/ParseException.java
@@ -41,7 +41,7 @@
 	 * @param cause the underlying cause of this exception
 	 */ 
 	public ParseException(int position, String message, Throwable cause) {
-		super(message);
+		super(position, message, cause);
 	}
 	
 	/**
@@ -50,7 +50,7 @@
 	 * @param message description of the problem that occurred
 	 */ 
 	public ParseException(int position, String message) {
-		super(message);
+		super(position, message);
 	}
 
 }
