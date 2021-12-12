diff --git a/modules/apps/web-experience/layout/layout-set-prototype-impl/src/main/java/com/liferay/layout/set/prototype/internal/exportimport/data/handler/LayoutSetPrototypeStagedModelDataHandler.java b/modules/apps/web-experience/layout/layout-set-prototype-impl/src/main/java/com/liferay/layout/set/prototype/internal/exportimport/data/handler/LayoutSetPrototypeStagedModelDataHandler.java
index 343a1df..7701294 100644
--- a/modules/apps/web-experience/layout/layout-set-prototype-impl/src/main/java/com/liferay/layout/set/prototype/internal/exportimport/data/handler/LayoutSetPrototypeStagedModelDataHandler.java
+++ b/modules/apps/web-experience/layout/layout-set-prototype-impl/src/main/java/com/liferay/layout/set/prototype/internal/exportimport/data/handler/LayoutSetPrototypeStagedModelDataHandler.java
@@ -324,7 +324,7 @@
 		}
 		catch (IOException ioe) {
 			if (_log.isWarnEnabled()) {
-				_log.error(ioe, ioe);
+				_log.warn(ioe, ioe);
 			}
 		}
 	}
