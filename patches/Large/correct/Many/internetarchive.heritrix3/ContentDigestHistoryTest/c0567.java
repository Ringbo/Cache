diff --git a/modules/src/test/java/org/archive/modules/recrawl/ContentDigestHistoryTest.java b/modules/src/test/java/org/archive/modules/recrawl/ContentDigestHistoryTest.java
index 9212e35..5b1acff 100644
--- a/modules/src/test/java/org/archive/modules/recrawl/ContentDigestHistoryTest.java
+++ b/modules/src/test/java/org/archive/modules/recrawl/ContentDigestHistoryTest.java
@@ -146,7 +146,7 @@
         curi1.setContentDigest("sha1", Base32.decode("orfjublpcrnymm4seg5uk6vfoeu7kw6c"));
 
         assertTrue(loader().shouldProcess(curi1));
-        assertTrue(storer().shouldProcess(curi1));
+        assertFalse(storer().shouldProcess(curi1));
         
         assertEquals("sha1:ORFJUBLPCRNYMM4SEG5UK6VFOEU7KW6C", historyStore().persistKeyFor(curi1));
 
