diff --git a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
index b8882a1..f1d71fc 100644
--- a/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
+++ b/portal-impl/src/com/liferay/portal/lar/LayoutImporter.java
@@ -1523,7 +1523,7 @@
 		throws Exception {
 
 		if ((_rootElement != null) && (_headerElement != null) &&
-			(_layoutsElement != null) && (_layoutsElement != null)) {
+			(_layoutsElement != null) && (_layoutElements != null)) {
 
 			return;
 		}
