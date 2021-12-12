diff --git a/flink-java/src/main/java/org/apache/flink/api/java/typeutils/AvroTypeInfo.java b/flink-java/src/main/java/org/apache/flink/api/java/typeutils/AvroTypeInfo.java
index bf580d1..ed03627 100644
--- a/flink-java/src/main/java/org/apache/flink/api/java/typeutils/AvroTypeInfo.java
+++ b/flink-java/src/main/java/org/apache/flink/api/java/typeutils/AvroTypeInfo.java
@@ -54,7 +54,7 @@
 		PojoTypeInfo pti =  (PojoTypeInfo) ti;
 		List<PojoField> newFields = new ArrayList<PojoField>(pti.getTotalFields());
 
-		for(int i = 0; i < pti.getTotalFields(); i++) {
+		for(int i = 0; i < pti.getArity(); i++) {
 			PojoField f = pti.getPojoFieldAt(i);
 			TypeInformation newType = f.type;
 			// check if type is a CharSequence
