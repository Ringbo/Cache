diff --git a/util-taglib/src/com/liferay/taglib/aui/InputTag.java b/util-taglib/src/com/liferay/taglib/aui/InputTag.java
index 5af8897..930f427 100644
--- a/util-taglib/src/com/liferay/taglib/aui/InputTag.java
+++ b/util-taglib/src/com/liferay/taglib/aui/InputTag.java
@@ -76,7 +76,8 @@
 
 				baseType = type;
 			}
-			else if (Validator.equals(type, "toggle-switch")) {
+			else if (Validator.equals(type, "toggle-card") ||
+				Validator.equals(type, "toggle-switch")) {
 				baseType = "checkbox";
 			}
 		}
