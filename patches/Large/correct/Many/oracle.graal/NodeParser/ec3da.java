diff --git a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/NodeParser.java b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/NodeParser.java
index dc482c5..6d9557a 100644
--- a/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/NodeParser.java
+++ b/graal/com.oracle.truffle.dsl.processor/src/com/oracle/truffle/dsl/processor/parser/NodeParser.java
@@ -939,12 +939,12 @@
         boolean changed = false;
         Map<String, Integer> counts = new HashMap<>();
         for (String s1 : signatures) {
-            Integer count = counts.get(s1);
+            Integer count = counts.get(s1.toLowerCase());
             if (count == null) {
                 count = 0;
             }
             count++;
-            counts.put(s1, count);
+            counts.put(s1.toLowerCase(), count);
         }
 
         for (String s : counts.keySet()) {
@@ -954,7 +954,7 @@
                 int number = 0;
                 for (ListIterator<String> iterator = signatures.listIterator(); iterator.hasNext();) {
                     String s2 = iterator.next();
-                    if (s.equals(s2)) {
+                    if (s.equalsIgnoreCase(s2)) {
                         iterator.set(s2 + number);
                         number++;
                     }
