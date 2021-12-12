diff --git a/flink-java/src/main/java/org/apache/flink/api/java/operators/JoinOperator.java b/flink-java/src/main/java/org/apache/flink/api/java/operators/JoinOperator.java
index 6ffbd1b..2efe7e9 100644
--- a/flink-java/src/main/java/org/apache/flink/api/java/operators/JoinOperator.java
+++ b/flink-java/src/main/java/org/apache/flink/api/java/operators/JoinOperator.java
@@ -925,13 +925,13 @@
 		public void join(T1 in1, T2 in2, Collector<R> out) {
 			for(int i=0; i<fields.length; i++) {
 				if(isFromFirst[i]) {
-					if(fields[i] >= 0) {
+					if(fields[i] >= 0 && in1 != null) {
 						outTuple.setField(((Tuple)in1).getField(fields[i]), i);
 					} else {
 						outTuple.setField(in1, i);
 					}
 				} else {
-					if(fields[i] >= 0) {
+					if(fields[i] >= 0 && in2 != null) {
 						outTuple.setField(((Tuple)in2).getField(fields[i]), i);
 					} else {
 						outTuple.setField(in2, i);
