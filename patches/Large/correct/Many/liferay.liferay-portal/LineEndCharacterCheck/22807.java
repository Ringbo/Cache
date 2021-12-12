diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checkstyle/checks/LineEndCharacterCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checkstyle/checks/LineEndCharacterCheck.java
index 7426a9f..536d48d 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checkstyle/checks/LineEndCharacterCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checkstyle/checks/LineEndCharacterCheck.java
@@ -46,7 +46,7 @@
 			}
 		}
 
-		if (!_isAtLineEnd(detailAST)) {
+		if (_isAtLineEnd(detailAST)) {
 			log(detailAST.getLineNo(), _MSG_INCORRECT_END_LINE_CHARACTER, "(");
 		}
 	}
