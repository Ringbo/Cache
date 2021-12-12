diff --git a/portal-service/src/com/liferay/portlet/asset/model/BaseAssetRendererFactory.java b/portal-service/src/com/liferay/portlet/asset/model/BaseAssetRendererFactory.java
index abc40a5..ad4cd1e 100644
--- a/portal-service/src/com/liferay/portlet/asset/model/BaseAssetRendererFactory.java
+++ b/portal-service/src/com/liferay/portlet/asset/model/BaseAssetRendererFactory.java
@@ -188,7 +188,8 @@
 			String label = fieldMap.get("label");
 			String name = fieldMap.get("name");
 
-			fields.add(new Tuple(label, name));
+			fields.add(
+				new Tuple(label, name, type, ddmStructure.getStructureId()));
 		}
 
 		return fields;
