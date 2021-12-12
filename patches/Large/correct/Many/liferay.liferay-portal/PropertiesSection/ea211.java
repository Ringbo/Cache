diff --git a/portal-impl/src/com/liferay/portal/tools/propertiesdoc/PropertiesSection.java b/portal-impl/src/com/liferay/portal/tools/propertiesdoc/PropertiesSection.java
index fe41fb1..eb54e26 100644
--- a/portal-impl/src/com/liferay/portal/tools/propertiesdoc/PropertiesSection.java
+++ b/portal-impl/src/com/liferay/portal/tools/propertiesdoc/PropertiesSection.java
@@ -70,7 +70,7 @@
 	}
 
 	public boolean hasPropertyComments() {
-		if ((_propertyComments != null) && _propertyComments.isEmpty()) {
+		if ((_propertyComments != null) && !_propertyComments.isEmpty()) {
 			return true;
 		}
 		else {
