diff --git a/util-taglib/src/com/liferay/taglib/aui/InputTag.java b/util-taglib/src/com/liferay/taglib/aui/InputTag.java
index b7c1297..96cfc26 100644
--- a/util-taglib/src/com/liferay/taglib/aui/InputTag.java
+++ b/util-taglib/src/com/liferay/taglib/aui/InputTag.java
@@ -309,7 +309,7 @@
 	}
 
 	protected void updateFormCheckboxNames() {
-		if (!Validator.equals(getType(), "checkbox")) {
+		if (!Validator.equals(getBaseType(), "checkbox")) {
 			return;
 		}
 
