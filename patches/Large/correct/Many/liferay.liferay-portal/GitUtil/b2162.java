diff --git a/portal-impl/src/com/liferay/portal/tools/GitUtil.java b/portal-impl/src/com/liferay/portal/tools/GitUtil.java
index 1b7304c..2de4e89 100644
--- a/portal-impl/src/com/liferay/portal/tools/GitUtil.java
+++ b/portal-impl/src/com/liferay/portal/tools/GitUtil.java
@@ -265,7 +265,7 @@
 
 			dir = dir.getParentFile();
 
-			if (baseDir.equals(dir)) {
+			if ((dir == null) || baseDir.equals(dir)) {
 				return null;
 			}
 		}
