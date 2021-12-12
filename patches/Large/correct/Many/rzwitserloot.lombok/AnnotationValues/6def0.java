diff --git a/src/core/lombok/core/AnnotationValues.java b/src/core/lombok/core/AnnotationValues.java
index b6e78de..a24330f 100644
--- a/src/core/lombok/core/AnnotationValues.java
+++ b/src/core/lombok/core/AnnotationValues.java
@@ -200,12 +200,12 @@
 	public boolean getAsBoolean(String methodName) {
 		AnnotationValue v = values.get(methodName);
 		if (v == null || v.valueGuesses.size() != 1) {
-			return getDefaultIf(methodName, Boolean.class, false);
+			return getDefaultIf(methodName, boolean.class, false);
 		}
 		
-		Object guess = guessToType(v.valueGuesses.get(0), Boolean.class, v, 0);
+		Object guess = guessToType(v.valueGuesses.get(0), boolean.class, v, 0);
 		if (guess instanceof Boolean) return ((Boolean) guess).booleanValue();
-		return getDefaultIf(methodName, Boolean.class, false);
+		return getDefaultIf(methodName, boolean.class, false);
 	}
 	
 	public <T> T getDefaultIf(String methodName, Class<T> type, T defaultValue) {
@@ -286,19 +286,19 @@
 	}
 	
 	private Object guessToType(Object guess, Class<?> expected, AnnotationValue v, int pos) {
-		if (expected == int.class) {
+		if (expected == int.class || expected == Integer.class) {
 			if (guess instanceof Integer || guess instanceof Short || guess instanceof Byte) {
 				return ((Number) guess).intValue();
 			}
 		}
 		
-		if (expected == long.class) {
+		if (expected == long.class || expected == Long.class) {
 			if (guess instanceof Long || guess instanceof Integer || guess instanceof Short || guess instanceof Byte) {
 				return ((Number) guess).longValue();
 			}
 		}
 		
-		if (expected == short.class) {
+		if (expected == short.class || expected == Short.class) {
 			if (guess instanceof Integer || guess instanceof Short || guess instanceof Byte) {
 				int intVal = ((Number) guess).intValue();
 				int shortVal = ((Number) guess).shortValue();
@@ -306,7 +306,7 @@
 			}
 		}
 		
-		if (expected == byte.class) {
+		if (expected == byte.class || expected == Byte.class) {
 			if (guess instanceof Integer || guess instanceof Short || guess instanceof Byte) {
 				int intVal = ((Number) guess).intValue();
 				int byteVal = ((Number) guess).byteValue();
@@ -314,19 +314,19 @@
 			}
 		}
 		
-		if (expected == double.class) {
+		if (expected == double.class || expected == Double.class) {
 			if (guess instanceof Number) return ((Number) guess).doubleValue();
 		}
 		
-		if (expected == float.class) {
+		if (expected == float.class || expected == Float.class) {
 			if (guess instanceof Number) return ((Number) guess).floatValue();
 		}
 		
-		if (expected == boolean.class) {
+		if (expected == boolean.class || expected == Boolean.class) {
 			if (guess instanceof Boolean) return ((Boolean) guess).booleanValue();
 		}
 		
-		if (expected == char.class) {
+		if (expected == char.class || expected == Character.class) {
 			if (guess instanceof Character) return ((Character) guess).charValue();
 		}
 		
@@ -346,7 +346,7 @@
 			}
 		}
 		
-		if (Class.class == expected) {
+		if (expected == Class.class) {
 			if (guess instanceof ClassLiteral) try {
 				String classLit = ((ClassLiteral) guess).getClassName();
 				return Class.forName(toFQ(classLit));
