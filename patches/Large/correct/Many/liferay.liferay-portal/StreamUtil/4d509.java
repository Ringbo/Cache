diff --git a/portal-service/src/com/liferay/portal/kernel/util/StreamUtil.java b/portal-service/src/com/liferay/portal/kernel/util/StreamUtil.java
index 8fc495b..733e247 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/StreamUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/StreamUtil.java
@@ -214,7 +214,7 @@
 			long length)
 		throws IOException {
 
-		if (length < 0) {
+		if (length <= 0) {
 			length = inputFileChannel.size() - inputFileChannel.position();
 		}
 
