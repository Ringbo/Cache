diff --git a/mod/jodd-wot/test/jodd/petite/WireTest.java b/mod/jodd-wot/test/jodd/petite/WireTest.java
index 4a18cba..059b307 100644
--- a/mod/jodd-wot/test/jodd/petite/WireTest.java
+++ b/mod/jodd-wot/test/jodd/petite/WireTest.java
@@ -76,7 +76,7 @@
 		assertNotNull(boo.zoo);
 		assertSame(boo.zoo.boo, boo);
 		assertEquals(3, boo.getFoo().hello());
-		assertEquals(1, boo.getFoo().getCounter());
+		assertEquals(2, boo.getFoo().getCounter());		// '2' because the first time we getBean('boo') the wiring occurred before exception was throwed!
 	}
 
 	public void testCreate() {
