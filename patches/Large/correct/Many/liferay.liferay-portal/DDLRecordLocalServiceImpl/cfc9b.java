diff --git a/portal-impl/src/com/liferay/portlet/dynamicdatalists/service/impl/DDLRecordLocalServiceImpl.java b/portal-impl/src/com/liferay/portlet/dynamicdatalists/service/impl/DDLRecordLocalServiceImpl.java
index a0bcb4d..fcd1cf6 100644
--- a/portal-impl/src/com/liferay/portlet/dynamicdatalists/service/impl/DDLRecordLocalServiceImpl.java
+++ b/portal-impl/src/com/liferay/portlet/dynamicdatalists/service/impl/DDLRecordLocalServiceImpl.java
@@ -494,7 +494,7 @@
 			}
 		}
 
-		boolean visible = false;
+		boolean visible = true;
 
 		if ((recordVersion != null) && !recordVersion.isApproved()) {
 			visible = false;
