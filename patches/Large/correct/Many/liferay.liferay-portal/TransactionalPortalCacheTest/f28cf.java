diff --git a/portal-impl/test/unit/com/liferay/portal/cache/transactional/TransactionalPortalCacheTest.java b/portal-impl/test/unit/com/liferay/portal/cache/transactional/TransactionalPortalCacheTest.java
index db8f685..0056258 100644
--- a/portal-impl/test/unit/com/liferay/portal/cache/transactional/TransactionalPortalCacheTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/cache/transactional/TransactionalPortalCacheTest.java
@@ -443,7 +443,7 @@
 		}
 		else {
 			Assert.assertEquals(_KEY_2, _recordCacheListener._key);
-			Assert.assertEquals(_VALUE_2, _recordCacheListener._value);
+			Assert.assertEquals(_VALUE_1, _recordCacheListener._value);
 		}
 
 		_recordCacheListener.reset();
