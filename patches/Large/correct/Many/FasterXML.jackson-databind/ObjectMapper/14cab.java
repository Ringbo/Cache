diff --git a/src/main/java/com/fasterxml/jackson/databind/ObjectMapper.java b/src/main/java/com/fasterxml/jackson/databind/ObjectMapper.java
index e89a237..b229b42 100644
--- a/src/main/java/com/fasterxml/jackson/databind/ObjectMapper.java
+++ b/src/main/java/com/fasterxml/jackson/databind/ObjectMapper.java
@@ -2495,7 +2495,7 @@
      * @param t The class to generate schema for
      */
     public void acceptJsonFormatVisitor(JavaType javaType, JsonFormatVisitorWrapper visitor) throws JsonMappingException {
-    	if (t == null) {
+    	if (javaType == null) {
     		throw new IllegalArgumentException("class must be provided");
     	}
     	
