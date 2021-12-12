diff --git a/aws-java-sdk-dynamodb/src/main/java/com/amazonaws/services/dynamodbv2/document/Item.java b/aws-java-sdk-dynamodb/src/main/java/com/amazonaws/services/dynamodbv2/document/Item.java
index 286dbd6..f60a998 100644
--- a/aws-java-sdk-dynamodb/src/main/java/com/amazonaws/services/dynamodbv2/document/Item.java
+++ b/aws-java-sdk-dynamodb/src/main/java/com/amazonaws/services/dynamodbv2/document/Item.java
@@ -908,7 +908,7 @@
     public Item withJSON(String attrName, String json) {
         checkInvalidAttribute(attrName, json);
         attributes.put(attrName,
-            valueConformer.transform(Jackson.fromJsonString(json, Map.class)));
+            valueConformer.transform(Jackson.fromJsonString(json, Object.class)));
         return this;
     }
 
