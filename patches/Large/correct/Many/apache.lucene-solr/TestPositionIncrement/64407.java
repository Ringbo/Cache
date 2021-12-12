diff --git a/lucene/core/src/test/org/apache/lucene/search/TestPositionIncrement.java b/lucene/core/src/test/org/apache/lucene/search/TestPositionIncrement.java
index 19e9341..89571d6 100644
--- a/lucene/core/src/test/org/apache/lucene/search/TestPositionIncrement.java
+++ b/lucene/core/src/test/org/apache/lucene/search/TestPositionIncrement.java
@@ -254,7 +254,7 @@
       for (byte[] bytes : payloads) {
         count++;
         if (VERBOSE) {
-          System.out.println("  payload: " + new String(bytes));
+          System.out.println("  payload: " + new String(bytes, "UTF-8"));
         }
       }
     }
@@ -281,7 +281,7 @@
     Collection<byte[]> pls = psu.getPayloadsForQuery(snq);
     count = pls.size();
     for (byte[] bytes : pls) {
-      String s = new String(bytes);
+      String s = new String(bytes, "UTF-8");
       //System.out.println(s);
       sawZero |= s.equals("pos: 0");
     }
