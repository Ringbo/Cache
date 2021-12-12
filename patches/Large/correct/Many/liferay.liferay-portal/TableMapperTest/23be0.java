diff --git a/portal-impl/test/unit/com/liferay/portal/kernel/service/persistence/impl/TableMapperTest.java b/portal-impl/test/unit/com/liferay/portal/kernel/service/persistence/impl/TableMapperTest.java
index 7d4b88a..9e9625e 100644
--- a/portal-impl/test/unit/com/liferay/portal/kernel/service/persistence/impl/TableMapperTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/kernel/service/persistence/impl/TableMapperTest.java
@@ -1350,7 +1350,7 @@
 
 				@Override
 				public boolean contains(Object o) {
-					return false;
+					return true;
 				}
 
 			});
