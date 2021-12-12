diff --git a/runtime/Java/src/org/antlr/v4/runtime/Recognizer.java b/runtime/Java/src/org/antlr/v4/runtime/Recognizer.java
index 990578f..6b407bc 100644
--- a/runtime/Java/src/org/antlr/v4/runtime/Recognizer.java
+++ b/runtime/Java/src/org/antlr/v4/runtime/Recognizer.java
@@ -69,7 +69,7 @@
 			Map<String, Integer> result = tokenTypeMapCache.get(vocabulary);
 			if (result == null) {
 				result = new HashMap<String, Integer>();
-				for (int i = 0; i < getATN().maxTokenType; i++) {
+				for (int i = 0; i <= getATN().maxTokenType; i++) {
 					String literalName = vocabulary.getLiteralName(i);
 					if (literalName != null) {
 						result.put(literalName, i);
