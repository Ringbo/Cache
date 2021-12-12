diff --git a/org.springframework.context/src/main/java/org/springframework/cache/interceptor/ExpressionEvaluator.java b/org.springframework.context/src/main/java/org/springframework/cache/interceptor/ExpressionEvaluator.java
index 0d639bb..1ae2221 100644
--- a/org.springframework.context/src/main/java/org/springframework/cache/interceptor/ExpressionEvaluator.java
+++ b/org.springframework.context/src/main/java/org/springframework/cache/interceptor/ExpressionEvaluator.java
@@ -56,7 +56,7 @@
 	}
 
 	boolean condition(String conditionExpression, Method method, EvaluationContext evalContext) {
-		Expression condExp = conditionCache.get(conditionExpression);
+		Expression condExp = conditionCache.get(method);
 		if (condExp == null) {
 			condExp = parser.parseExpression(conditionExpression);
 			conditionCache.put(method, condExp);
@@ -65,7 +65,7 @@
 	}
 
 	Object key(String keyExpression, Method method, EvaluationContext evalContext) {
-		Expression keyExp = keyCache.get(keyExpression);
+		Expression keyExp = keyCache.get(method);
 		if (keyExp == null) {
 			keyExp = parser.parseExpression(keyExpression);
 			keyCache.put(method, keyExp);
