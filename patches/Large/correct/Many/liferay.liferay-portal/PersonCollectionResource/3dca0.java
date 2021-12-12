diff --git a/modules/apps/headless-apio/person/person-apio-impl/src/main/java/com/liferay/person/apio/internal/architect/resource/PersonCollectionResource.java b/modules/apps/headless-apio/person/person-apio-impl/src/main/java/com/liferay/person/apio/internal/architect/resource/PersonCollectionResource.java
index 019d5dd..b8c91d0 100644
--- a/modules/apps/headless-apio/person/person-apio-impl/src/main/java/com/liferay/person/apio/internal/architect/resource/PersonCollectionResource.java
+++ b/modules/apps/headless-apio/person/person-apio-impl/src/main/java/com/liferay/person/apio/internal/architect/resource/PersonCollectionResource.java
@@ -118,7 +118,7 @@
 		Representor.Builder<UserWrapper, Long> builder) {
 
 		return builder.types(
-			"Person"
+			"Liferay:UserAccount", "Person"
 		).identifier(
 			User::getUserId
 		).addDate(
