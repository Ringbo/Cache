diff --git a/modules/apps/frontend-taglib/frontend-taglib-clay/src/main/java/com/liferay/frontend/taglib/clay/servlet/taglib/display/context/BaseManagementToolbarDisplayContext.java b/modules/apps/frontend-taglib/frontend-taglib-clay/src/main/java/com/liferay/frontend/taglib/clay/servlet/taglib/display/context/BaseManagementToolbarDisplayContext.java
index bbf5efd..c2a5573 100644
--- a/modules/apps/frontend-taglib/frontend-taglib-clay/src/main/java/com/liferay/frontend/taglib/clay/servlet/taglib/display/context/BaseManagementToolbarDisplayContext.java
+++ b/modules/apps/frontend-taglib/frontend-taglib-clay/src/main/java/com/liferay/frontend/taglib/clay/servlet/taglib/display/context/BaseManagementToolbarDisplayContext.java
@@ -143,7 +143,7 @@
 					add(
 						dropdownItem -> {
 							dropdownItem.setActive(
-								parameterValue.equals(entry.getKey()));
+								parameterValue.equals(entry.getValue()));
 							dropdownItem.setHref(
 								entryURL, parameterName, entry.getValue());
 							dropdownItem.setLabel(
