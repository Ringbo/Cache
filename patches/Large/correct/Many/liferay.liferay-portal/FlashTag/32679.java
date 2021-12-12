diff --git a/util-taglib/src/com/liferay/taglib/ui/FlashTag.java b/util-taglib/src/com/liferay/taglib/ui/FlashTag.java
index ef28afe..06a37c5 100644
--- a/util-taglib/src/com/liferay/taglib/ui/FlashTag.java
+++ b/util-taglib/src/com/liferay/taglib/ui/FlashTag.java
@@ -210,7 +210,7 @@
 
 	public void setVersion(String version) {
 		if (Validator.isNotNull(version)) {
-			_width = version;
+			_version = version;
 		}
 	}
 
