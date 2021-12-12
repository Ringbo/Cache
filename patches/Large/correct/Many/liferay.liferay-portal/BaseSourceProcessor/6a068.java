diff --git a/modules/util/source-formatter/src/com/liferay/source/formatter/BaseSourceProcessor.java b/modules/util/source-formatter/src/com/liferay/source/formatter/BaseSourceProcessor.java
index 1863de1..8ba9cad 100644
--- a/modules/util/source-formatter/src/com/liferay/source/formatter/BaseSourceProcessor.java
+++ b/modules/util/source-formatter/src/com/liferay/source/formatter/BaseSourceProcessor.java
@@ -1494,7 +1494,7 @@
 			}
 
 			if (Validator.isNotNull(previousAttribute) &&
-				(previousAttribute.compareTo(attribute) > 0)) {
+				(previousAttribute.compareToIgnoreCase(attribute) > 0)) {
 
 				wrongOrder = true;
 			}
