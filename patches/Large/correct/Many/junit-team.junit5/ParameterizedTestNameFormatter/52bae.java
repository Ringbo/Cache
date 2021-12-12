diff --git a/junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestNameFormatter.java b/junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestNameFormatter.java
index c91f0a5..8fda1e3 100644
--- a/junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestNameFormatter.java
+++ b/junit-jupiter-params/src/main/java/org/junit/jupiter/params/ParameterizedTestNameFormatter.java
@@ -41,7 +41,9 @@
 		}
 
 		// Convert arguments to human readable formats
-		String[] humanReadableArguments = new String[arguments.length];
+		// Note: humanReadableArguments must be an Object[] in order to
+		// avoid varargs issues with non-Eclipse compilers.
+		Object[] humanReadableArguments = new String[arguments.length];
 		for (int i = 0; i < arguments.length; i++) {
 			humanReadableArguments[i] = StringUtils.nullSafeToString(arguments[i]);
 		}
