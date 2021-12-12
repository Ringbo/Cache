diff --git a/modules/apps/foundation/apio-architect/apio-architect-jaxrs-json/src/main/java/com/liferay/apio/architect/jaxrs/json/internal/writer/BinaryResourceBodyWriter.java b/modules/apps/foundation/apio-architect/apio-architect-jaxrs-json/src/main/java/com/liferay/apio/architect/jaxrs/json/internal/writer/BinaryResourceBodyWriter.java
index c58db61..21e67b5e 100644
--- a/modules/apps/foundation/apio-architect/apio-architect-jaxrs-json/src/main/java/com/liferay/apio/architect/jaxrs/json/internal/writer/BinaryResourceBodyWriter.java
+++ b/modules/apps/foundation/apio-architect/apio-architect-jaxrs-json/src/main/java/com/liferay/apio/architect/jaxrs/json/internal/writer/BinaryResourceBodyWriter.java
@@ -66,7 +66,7 @@
 				genericType, Try.class);
 
 		return classTry.filter(
-			InputStream.class::equals
+			BinaryFile.class::equals
 		).isSuccess();
 	}
 
