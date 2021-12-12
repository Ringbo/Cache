diff --git a/modules/apps/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/message/json/DocumentationMessageMapper.java b/modules/apps/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/message/json/DocumentationMessageMapper.java
index e66789b..106f77d 100644
--- a/modules/apps/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/message/json/DocumentationMessageMapper.java
+++ b/modules/apps/apio-architect/apio-architect-api/src/main/java/com/liferay/apio/architect/message/json/DocumentationMessageMapper.java
@@ -55,7 +55,7 @@
 	}
 
 	public default void mapFormField(
-		JSONObjectBuilder jsonObjectBuilder, Object name,
+		JSONObjectBuilder jsonObjectBuilder, String name,
 		Optional<FormField> formFieldOptional) {
 	}
 
