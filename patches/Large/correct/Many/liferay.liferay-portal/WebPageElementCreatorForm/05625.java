diff --git a/modules/apps/foundation/apio-architect/apio-architect-sample-liferay-portal/src/main/java/com/liferay/apio/architect/sample/liferay/portal/internal/form/WebPageElementCreatorForm.java b/modules/apps/foundation/apio-architect/apio-architect-sample-liferay-portal/src/main/java/com/liferay/apio/architect/sample/liferay/portal/internal/form/WebPageElementCreatorForm.java
index ffb5cf7..30422e4 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-sample-liferay-portal/src/main/java/com/liferay/apio/architect/sample/liferay/portal/internal/form/WebPageElementCreatorForm.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-sample-liferay-portal/src/main/java/com/liferay/apio/architect/sample/liferay/portal/internal/form/WebPageElementCreatorForm.java
@@ -134,7 +134,7 @@
 	 * @review
 	 */
 	public long getFolder() {
-		if (_folder != null) {
+		if (_folder == null) {
 			return 0;
 		}
 
