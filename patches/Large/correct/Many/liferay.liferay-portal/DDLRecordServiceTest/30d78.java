diff --git a/portal-impl/test/integration/com/liferay/portlet/dynamicdatalists/service/DDLRecordServiceTest.java b/portal-impl/test/integration/com/liferay/portlet/dynamicdatalists/service/DDLRecordServiceTest.java
index d0e9e34..f173461 100644
--- a/portal-impl/test/integration/com/liferay/portlet/dynamicdatalists/service/DDLRecordServiceTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/dynamicdatalists/service/DDLRecordServiceTest.java
@@ -120,7 +120,7 @@
 
 		hits = DDLRecordLocalServiceUtil.search(searchContext);
 
-		Assert.assertEquals(1, hits.getLength());
+		Assert.assertEquals(2, hits.getLength());
 	}
 
 	protected DDLRecord addRecord(
