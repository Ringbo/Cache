diff --git a/modules/apps/static/portal-osgi-web/portal-osgi-web-wab-extender/src/main/java/com/liferay/portal/osgi/web/wab/extender/internal/event/EventUtil.java b/modules/apps/static/portal-osgi-web/portal-osgi-web-wab-extender/src/main/java/com/liferay/portal/osgi/web/wab/extender/internal/event/EventUtil.java
index 7b54e59..1015963 100644
--- a/modules/apps/static/portal-osgi-web/portal-osgi-web-wab-extender/src/main/java/com/liferay/portal/osgi/web/wab/extender/internal/event/EventUtil.java
+++ b/modules/apps/static/portal-osgi-web/portal-osgi-web-wab-extender/src/main/java/com/liferay/portal/osgi/web/wab/extender/internal/event/EventUtil.java
@@ -129,10 +129,11 @@
 
 				properties.put("collision.bundles", collidedBundleIds);
 
-				_log.warn("Bundles " + collidedBundleNames +
+				_log.error(
+					"Bundles " + collidedBundleNames +
 				" have the same Web-ContextPath. This can lead to" +
-				" unexpected behavior when the bundles are deployed" +
-				" to the same layout");
+							"unexpected behavior when the bundles are " +
+								"deployed to the same layout");
 			}
 		}
 
