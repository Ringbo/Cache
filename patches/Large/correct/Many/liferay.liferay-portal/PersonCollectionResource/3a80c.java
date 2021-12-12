diff --git a/modules/apps/headless-apio/person/person-apio-impl/src/main/java/com/liferay/person/apio/internal/architect/resource/PersonCollectionResource.java b/modules/apps/headless-apio/person/person-apio-impl/src/main/java/com/liferay/person/apio/internal/architect/resource/PersonCollectionResource.java
index 37628c9..5cdf023 100644
--- a/modules/apps/headless-apio/person/person-apio-impl/src/main/java/com/liferay/person/apio/internal/architect/resource/PersonCollectionResource.java
+++ b/modules/apps/headless-apio/person/person-apio-impl/src/main/java/com/liferay/person/apio/internal/architect/resource/PersonCollectionResource.java
@@ -142,11 +142,11 @@
 			contactBuilder -> contactBuilder.types(
 				"ContactInformation"
 			).addString(
-				"facebookSn", ContactModel::getSmsSn
+				"facebookSn", ContactModel::getFacebookSn
 			).addString(
-				"skypeSn", ContactModel::getSmsSn
+				"skypeSn", ContactModel::getSkypeSn
 			).addString(
-				"twitterSn", ContactModel::getSmsSn
+				"twitterSn", ContactModel::getTwitterSn
 			).build()
 		).addRelatedCollection(
 			"roles", RoleIdentifier.class
