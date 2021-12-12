diff --git a/modules/apps/apio-architect/apio-architect-message-json-ld/src/main/java/com/liferay/apio/architect/message/json/ld/internal/JSONLDDocumentationMessageMapper.java b/modules/apps/apio-architect/apio-architect-message-json-ld/src/main/java/com/liferay/apio/architect/message/json/ld/internal/JSONLDDocumentationMessageMapper.java
index e138764..b7529d1 100644
--- a/modules/apps/apio-architect/apio-architect-message-json-ld/src/main/java/com/liferay/apio/architect/message/json/ld/internal/JSONLDDocumentationMessageMapper.java
+++ b/modules/apps/apio-architect/apio-architect-message-json-ld/src/main/java/com/liferay/apio/architect/message/json/ld/internal/JSONLDDocumentationMessageMapper.java
@@ -73,7 +73,7 @@
 
 	@Override
 	public void mapFormField(
-		JSONObjectBuilder jsonObjectBuilder, Object name,
+		JSONObjectBuilder jsonObjectBuilder, String name,
 		Optional<FormField> formFieldOptional) {
 
 		jsonObjectBuilder.field(
