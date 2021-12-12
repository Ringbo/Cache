diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/parser/JavaSignatureParser.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/parser/JavaSignatureParser.java
index 3828625..286b295 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/parser/JavaSignatureParser.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/parser/JavaSignatureParser.java
@@ -97,7 +97,7 @@
 				return javaSignature;
 			}
 
-			String parameterName = parameters.substring(x + 1);
+			String parameterName = parameters.substring(x + 1, y);
 
 			javaSignature.addParameter(parameterName, parameterType);
 
