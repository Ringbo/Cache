diff --git a/portal-impl/src/com/liferay/portal/service/impl/PortletLocalServiceImpl.java b/portal-impl/src/com/liferay/portal/service/impl/PortletLocalServiceImpl.java
index 0cdd941..01b5105 100644
--- a/portal-impl/src/com/liferay/portal/service/impl/PortletLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portal/service/impl/PortletLocalServiceImpl.java
@@ -1167,7 +1167,7 @@
 								propertyKeyEl.getTextTrim());
 						}
 						else {
-							Element simpleTriggerValueEl = triggerEl.element(
+							Element simpleTriggerValueEl = simpleEl.element(
 								"simple-trigger-value");
 
 							String timeUnit =
