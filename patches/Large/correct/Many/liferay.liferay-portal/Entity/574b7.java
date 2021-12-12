diff --git a/modules/util/portal-tools-service-builder/src/main/java/com/liferay/portal/tools/service/builder/Entity.java b/modules/util/portal-tools-service-builder/src/main/java/com/liferay/portal/tools/service/builder/Entity.java
index bc74900..9069b65 100644
--- a/modules/util/portal-tools-service-builder/src/main/java/com/liferay/portal/tools/service/builder/Entity.java
+++ b/modules/util/portal-tools-service-builder/src/main/java/com/liferay/portal/tools/service/builder/Entity.java
@@ -1046,7 +1046,7 @@
 			_name.concat("Localization"), _humanName.concat(" localization"),
 			_table.concat("Localization"), _alias.concat("Localization"),
 			persistenceClass, _dataSource, _sessionFactory, _txManager,
-			_cacheEnabled, _dynamicUpdateEnabled, _mvccEnabled, _deprecated,
+			_cacheEnabled, _dynamicUpdateEnabled, _deprecated,
 			Collections.singletonList(entityLocalizationIDColumn),
 			regularColList, Collections.<EntityColumn>emptyList(),
 			Collections.<EntityColumn>emptyList(), columnList, finderList,
