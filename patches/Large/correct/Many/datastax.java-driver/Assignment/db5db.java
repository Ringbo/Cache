diff --git a/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Assignment.java b/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Assignment.java
index 895c3ea..5d3e0a5 100644
--- a/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Assignment.java
+++ b/driver-core/src/main/java/com/datastax/driver/core/querybuilder/Assignment.java
@@ -70,7 +70,7 @@
         void appendTo(StringBuilder sb, List<ByteBuffer> variables) {
             appendName(name, sb).append("=");
             appendName(name, sb).append(isIncr ? "+" : "-");
-            appendValue(value, sb);
+            appendValue(value, sb, variables);
         }
 
         @Override
@@ -91,7 +91,7 @@
         @Override
         void appendTo(StringBuilder sb, List<ByteBuffer> variables) {
             appendName(name, sb).append("=");
-            appendValue(value, sb);
+            appendValue(value, sb, variables);
             sb.append("+");
             appendName(name, sb);
         }
@@ -140,7 +140,7 @@
         void appendTo(StringBuilder sb, List<ByteBuffer> variables) {
             appendName(name, sb).append("=");
             appendName(name, sb).append(isAdd ? "+" : "-");
-            appendValue(collection, sb);
+            appendValue(collection, sb, variables);
         }
 
         @Override
