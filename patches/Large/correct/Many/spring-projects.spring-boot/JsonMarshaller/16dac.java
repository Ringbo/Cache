diff --git a/spring-boot-tools/spring-boot-configuration-processor/src/main/java/org/springframework/boot/configurationprocessor/metadata/JsonMarshaller.java b/spring-boot-tools/spring-boot-configuration-processor/src/main/java/org/springframework/boot/configurationprocessor/metadata/JsonMarshaller.java
index 0a35c94..b247a9b 100644
--- a/spring-boot-tools/spring-boot-configuration-processor/src/main/java/org/springframework/boot/configurationprocessor/metadata/JsonMarshaller.java
+++ b/spring-boot-tools/spring-boot-configuration-processor/src/main/java/org/springframework/boot/configurationprocessor/metadata/JsonMarshaller.java
@@ -50,7 +50,7 @@
 
 	public void write(ConfigurationMetadata metadata, OutputStream outputStream)
 			throws IOException {
-		JSONObject object = new JSONObject();
+		JSONObject object = new JSONOrderedObject();
 		object.put("groups", toJsonArray(metadata, ItemType.GROUP));
 		object.put("properties", toJsonArray(metadata, ItemType.PROPERTY));
 		object.put("hints", toJsonArray(metadata.getHints()));
