diff --git a/graylog2-server/src/test/java/org/graylog2/inputs/gelf/GELFProcessorTest.java b/graylog2-server/src/test/java/org/graylog2/inputs/gelf/GELFProcessorTest.java
index 547b1da..d6e8baf 100644
--- a/graylog2-server/src/test/java/org/graylog2/inputs/gelf/GELFProcessorTest.java
+++ b/graylog2-server/src/test/java/org/graylog2/inputs/gelf/GELFProcessorTest.java
@@ -60,7 +60,7 @@
         assertEquals(usedTimestamp, (Double) lm.getField("timestamp"), 1e-8);
         assertEquals("ü", lm.getField("_lol_utf8"));
         assertEquals("bar", lm.getField("_foo"));
-        assertEquals(13, lm.getFields().size());
+        assertEquals(11, lm.getFields().size());
     }
 
     @Test
@@ -90,7 +90,7 @@
         assertEquals(1, serverStub.callsToProcessBufferInserter);
         assertNull(lm.getField("id"));
         assertEquals("foo", lm.getField("_something"));
-        assertEquals(8, lm.getFields().size());
+        assertEquals(5, lm.getFields().size());
     }
     
     @Test
@@ -105,6 +105,6 @@
 
         assertEquals(1, serverStub.callsToProcessBufferInserter);
         assertEquals("{\"foo\":\"zomg\"}", lm.getField("_lol"));
-        assertEquals(8, lm.getFields().size());
+        assertEquals(5, lm.getFields().size());
     }
 }
\ No newline at end of file
