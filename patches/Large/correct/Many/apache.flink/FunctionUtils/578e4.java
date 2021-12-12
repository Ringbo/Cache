diff --git a/flink-core/src/main/java/org/apache/flink/api/common/functions/util/FunctionUtils.java b/flink-core/src/main/java/org/apache/flink/api/common/functions/util/FunctionUtils.java
index 8ab2184..2486074 100644
--- a/flink-core/src/main/java/org/apache/flink/api/common/functions/util/FunctionUtils.java
+++ b/flink-core/src/main/java/org/apache/flink/api/common/functions/util/FunctionUtils.java
@@ -99,7 +99,7 @@
 			String className = (String) implClassMethod.invoke(serializedLambda);
 			String methodName = (String) implMethodNameMethod.invoke(serializedLambda);
 
-			Class<?> implClass = Class.forName(className.replace('/', '.'));
+			Class<?> implClass = Class.forName(className.replace('/', '.'), true, Thread.currentThread().getContextClassLoader());
 
 			Method[] methods = implClass.getDeclaredMethods();
 			Method parameterizedMethod = null;
@@ -121,7 +121,7 @@
 			return parameterizedMethod;
 		}
 		catch(Exception e) {
-			throw new RuntimeException("Could not extract lambda method out of function.", e);
+			throw new RuntimeException("Could not extract lambda method out of function: " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
 		}
 	}
 }
