diff --git a/core/src/main/java/org/hibernate/property/BasicPropertyAccessor.java b/core/src/main/java/org/hibernate/property/BasicPropertyAccessor.java
index b12959a..9085feb 100644
--- a/core/src/main/java/org/hibernate/property/BasicPropertyAccessor.java
+++ b/core/src/main/java/org/hibernate/property/BasicPropertyAccessor.java
@@ -316,8 +316,8 @@
 
 		Method[] methods = theClass.getDeclaredMethods();
 		for (int i=0; i<methods.length; i++) {
-			// only carry on if the method has no parameters
-			if ( methods[i].getParameterTypes().length==0 ) {
+			// only carry on if the method has no parameters and is not a bridge
+			if ( methods[i].getParameterTypes().length == 0 && !methods[i].isBridge() ) {
 				String methodName = methods[i].getName();
 
 				// try "get"
@@ -330,9 +330,7 @@
 
 				}
 
-				// if not "get" then try "is"
-				/*boolean isBoolean = methods[i].getReturnType().equals(Boolean.class) ||
-					methods[i].getReturnType().equals(boolean.class);*/
+				// if not "get", then try "is"
 				if ( methodName.startsWith("is") ) {
 					String testStdMethod = Introspector.decapitalize( methodName.substring(2) );
 					String testOldMethod = methodName.substring(2);
