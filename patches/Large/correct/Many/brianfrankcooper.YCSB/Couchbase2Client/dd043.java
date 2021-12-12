diff --git a/couchbase2/src/main/java/com/yahoo/ycsb/db/couchbase2/Couchbase2Client.java b/couchbase2/src/main/java/com/yahoo/ycsb/db/couchbase2/Couchbase2Client.java
index 7833466..73e44a0 100644
--- a/couchbase2/src/main/java/com/yahoo/ycsb/db/couchbase2/Couchbase2Client.java
+++ b/couchbase2/src/main/java/com/yahoo/ycsb/db/couchbase2/Couchbase2Client.java
@@ -856,7 +856,7 @@
       for (Iterator<Map.Entry<String, JsonNode>> jsonFields = json.fields(); jsonFields.hasNext();) {
         Map.Entry<String, JsonNode> jsonField = jsonFields.next();
         String name = jsonField.getKey();
-        if (checkFields && fields.contains(name)) {
+        if (checkFields && !fields.contains(name)) {
           continue;
         }
         JsonNode jsonValue = jsonField.getValue();
