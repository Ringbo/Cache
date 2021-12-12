diff --git a/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerVariablesUtil.java b/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerVariablesUtil.java
index 4429c97..480fab8 100644
--- a/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerVariablesUtil.java
+++ b/modules/test/poshi-runner/poshi-runner/src/main/java/com/liferay/poshi/runner/PoshiRunnerVariablesUtil.java
@@ -48,7 +48,7 @@
 	}
 
 	public static String getStringFromCommandMap(String key) throws Exception {
-		if (containsKeyInCommandMap(replaceCommandVars(key))) {
+		if (containsKeyInCommandMap((String)replaceCommandVars(key))) {
 			Object object = getValueFromCommandMap(key);
 
 			return object.toString();
@@ -58,7 +58,7 @@
 	}
 
 	public static String getStringFromExecuteMap(String key) throws Exception {
-		if (containsKeyInExecuteMap(replaceCommandVars(key))) {
+		if (containsKeyInExecuteMap((String)replaceCommandVars(key))) {
 			Object object = getValueFromExecuteMap(key);
 
 			return object.toString();
@@ -98,10 +98,11 @@
 
 		if (value instanceof String) {
 			_commandMap.put(
-				replaceCommandVars(key), replaceCommandVars((String)value));
+				(String)replaceCommandVars(key),
+				replaceCommandVars((String)value));
 		}
 		else {
-			_commandMap.put(replaceCommandVars(key), value);
+			_commandMap.put((String)replaceCommandVars(key), value);
 		}
 	}
 
@@ -110,10 +111,11 @@
 
 		if (value instanceof String) {
 			_executeMap.put(
-				replaceCommandVars(key), replaceCommandVars((String)value));
+				(String)replaceCommandVars(key),
+				replaceCommandVars((String)value));
 		}
 		else {
-			_executeMap.put(replaceCommandVars(key), value);
+			_executeMap.put((String)replaceCommandVars(key), value);
 		}
 	}
 
@@ -122,14 +124,15 @@
 
 		if (value instanceof String) {
 			_staticMap.put(
-				replaceCommandVars(key), replaceCommandVars((String)value));
+				(String)replaceCommandVars(key),
+				replaceCommandVars((String)value));
 		}
 		else {
-			_staticMap.put(replaceCommandVars(key), value);
+			_staticMap.put((String)replaceCommandVars(key), value);
 		}
 	}
 
-	public static String replaceCommandVars(String token) throws Exception {
+	public static Object replaceCommandVars(String token) throws Exception {
 		Matcher matcher = _pattern.matcher(token);
 
 		if (matcher.matches() && _commandMap.containsKey(matcher.group(1))) {
@@ -147,7 +150,7 @@
 		return token;
 	}
 
-	public static String replaceExecuteVars(String token) throws Exception {
+	public static Object replaceExecuteVars(String token) throws Exception {
 		Matcher matcher = _pattern.matcher(token);
 
 		if (matcher.matches() && _executeMap.containsKey(matcher.group(1))) {
