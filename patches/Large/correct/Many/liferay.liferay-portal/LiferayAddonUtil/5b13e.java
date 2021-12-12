diff --git a/support-glassfish/src/com/liferay/support/glassfish/LiferayAddonUtil.java b/support-glassfish/src/com/liferay/support/glassfish/LiferayAddonUtil.java
index adf00cf..b1efd49 100644
--- a/support-glassfish/src/com/liferay/support/glassfish/LiferayAddonUtil.java
+++ b/support-glassfish/src/com/liferay/support/glassfish/LiferayAddonUtil.java
@@ -95,7 +95,7 @@
 			int len = 0;
 
 			while ((len = is.read(bytes)) > 0) {
-				out.write(bytes, 0, len);
+				os.write(bytes, 0, len);
 			}
 
 			is.close();
