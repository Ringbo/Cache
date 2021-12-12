diff --git a/modules/apps/foundation/apio-architect/apio-architect-sample-liferay-portal/src/main/java/com/liferay/apio/architect/sample/liferay/portal/internal/form/WebPageElementUpdaterForm.java b/modules/apps/foundation/apio-architect/apio-architect-sample-liferay-portal/src/main/java/com/liferay/apio/architect/sample/liferay/portal/internal/form/WebPageElementUpdaterForm.java
index 2560f49..cb7c6ea 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-sample-liferay-portal/src/main/java/com/liferay/apio/architect/sample/liferay/portal/internal/form/WebPageElementUpdaterForm.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-sample-liferay-portal/src/main/java/com/liferay/apio/architect/sample/liferay/portal/internal/form/WebPageElementUpdaterForm.java
@@ -82,7 +82,7 @@
 	 * @review
 	 */
 	public long getFolder() {
-		if (_folder != null) {
+		if (_folder == null) {
 			return 0;
 		}
 
