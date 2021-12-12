diff --git a/lucene/core/src/test/org/apache/lucene/search/spans/TestPayloadSpans.java b/lucene/core/src/test/org/apache/lucene/search/spans/TestPayloadSpans.java
index 54a111d..34f7dda 100644
--- a/lucene/core/src/test/org/apache/lucene/search/spans/TestPayloadSpans.java
+++ b/lucene/core/src/test/org/apache/lucene/search/spans/TestPayloadSpans.java
@@ -276,7 +276,7 @@
         Collection<byte[]> payloads = spans.getPayload();
 
         for (final byte [] payload : payloads) {
-          payloadSet.add(new String(payload));
+          payloadSet.add(new String(payload, "UTF-8"));
         }
       }
     }
@@ -311,7 +311,7 @@
       while (spans.next()) {
         Collection<byte[]> payloads = spans.getPayload();
         for (final byte[] payload : payloads) {
-          payloadSet.add(new String(payload));
+          payloadSet.add(new String(payload, "UTF-8"));
         }
       }
     }
@@ -347,7 +347,7 @@
         Collection<byte[]> payloads = spans.getPayload();
 
         for (final byte [] payload : payloads) {
-          payloadSet.add(new String(payload));
+          payloadSet.add(new String(payload, "UTF-8"));
         }
       }
     }
@@ -383,7 +383,7 @@
       System.out.println("Num payloads:" + payloads.size());
     for (final byte [] bytes : payloads) {
       if(VERBOSE)
-        System.out.println(new String(bytes));
+        System.out.println(new String(bytes, "UTF-8"));
     }
     reader.close();
     directory.close();
@@ -456,7 +456,7 @@
         for (final byte [] bytes : payload) {
           if(VERBOSE)
             System.out.println("doc:" + spans.doc() + " s:" + spans.start() + " e:" + spans.end() + " "
-              + new String(bytes));
+              + new String(bytes, "UTF-8"));
         }
 
         assertEquals(numPayloads[cnt],payload.size());
@@ -505,9 +505,9 @@
 
         if (!nopayload.contains(token)) {
           if (entities.contains(token)) {
-            payloadAtt.setPayload(new BytesRef((token + ":Entity:"+ pos ).getBytes()));
+            payloadAtt.setPayload(new BytesRef(token + ":Entity:"+ pos ));
           } else {
-            payloadAtt.setPayload(new BytesRef((token + ":Noise:" + pos ).getBytes()));
+            payloadAtt.setPayload(new BytesRef(token + ":Noise:" + pos ));
           }
         }
         pos += posIncrAtt.getPositionIncrement();
