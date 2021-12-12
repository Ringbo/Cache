diff --git a/flink-libraries/flink-cep/src/test/java/org/apache/flink/cep/nfa/NFAITCase.java b/flink-libraries/flink-cep/src/test/java/org/apache/flink/cep/nfa/NFAITCase.java
index 6ffd5d2..2391d54 100644
--- a/flink-libraries/flink-cep/src/test/java/org/apache/flink/cep/nfa/NFAITCase.java
+++ b/flink-libraries/flink-cep/src/test/java/org/apache/flink/cep/nfa/NFAITCase.java
@@ -378,9 +378,9 @@
 		timeoutPattern4.put("start", Collections.singletonList(new Event(2, "start", 1.0)));
 
 		expectedTimeoutPatterns.add(Tuple2.of(timeoutPattern1, 11L));
-		expectedTimeoutPatterns.add(Tuple2.of(timeoutPattern2, 13L));
+		expectedTimeoutPatterns.add(Tuple2.of(timeoutPattern2, 12L));
 		expectedTimeoutPatterns.add(Tuple2.of(timeoutPattern3, 11L));
-		expectedTimeoutPatterns.add(Tuple2.of(timeoutPattern4, 13L));
+		expectedTimeoutPatterns.add(Tuple2.of(timeoutPattern4, 12L));
 
 		Pattern<Event, ?> pattern = Pattern.<Event>begin("start").where(new SimpleCondition<Event>() {
 			private static final long serialVersionUID = 7907391379273505897L;
