diff --git a/flink-libraries/flink-cep/src/main/java/org/apache/flink/cep/nfa/NFA.java b/flink-libraries/flink-cep/src/main/java/org/apache/flink/cep/nfa/NFA.java
index deee0a1..5624db9 100644
--- a/flink-libraries/flink-cep/src/main/java/org/apache/flink/cep/nfa/NFA.java
+++ b/flink-libraries/flink-cep/src/main/java/org/apache/flink/cep/nfa/NFA.java
@@ -1132,7 +1132,7 @@
 				int length = in.readInt();
 
 				byte[] serCondition = new byte[length];
-				in.read(serCondition);
+				in.readFully(serCondition);
 
 				ByteArrayInputStream bais = new ByteArrayInputStream(serCondition);
 				ObjectInputStream ois = new ObjectInputStream(bais);
