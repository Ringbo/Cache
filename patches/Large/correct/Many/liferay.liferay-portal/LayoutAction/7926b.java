diff --git a/portal-impl/src/com/liferay/portal/action/LayoutAction.java b/portal-impl/src/com/liferay/portal/action/LayoutAction.java
index 4b6c052..4a62224 100644
--- a/portal-impl/src/com/liferay/portal/action/LayoutAction.java
+++ b/portal-impl/src/com/liferay/portal/action/LayoutAction.java
@@ -502,7 +502,7 @@
 			javax.xml.namespace.QName qName = event.getQName();
 
 			for (LayoutTypePortlet layoutTypePortlet : layoutTypePortlets) {
-				List<Portlet> portlets = layoutTypePortlet.getPortlets();
+				List<Portlet> portlets = layoutTypePortlet.getAllPortlets();
 
 				for (Portlet portlet : portlets) {
 					QName processingQName = portlet.getProcessingEvent(
