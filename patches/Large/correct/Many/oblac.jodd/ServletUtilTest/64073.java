diff --git a/mod/jodd/test/jodd/servlet/ServletUtilTest.java b/mod/jodd/test/jodd/servlet/ServletUtilTest.java
index 5f0a006..3b98d54 100644
--- a/mod/jodd/test/jodd/servlet/ServletUtilTest.java
+++ b/mod/jodd/test/jodd/servlet/ServletUtilTest.java
@@ -8,15 +8,15 @@
 
 	public void testPrepareParameters() {
 		String[] p = new String[] {"one", "", " three ", null, "five"};
-		p = ServletUtil.prepareParameters(p, true, false, false, false);
+		p = ServletUtil.prepareParameters(p, true, false, false);
 		assertEquals("three", p[2]);
 		assertNotNull(p[1]);
 		assertNull(p[3]);
-		p = ServletUtil.prepareParameters(p, true, true, false, false);
+		p = ServletUtil.prepareParameters(p, true, true, false);
 		assertNull(p[1]);
 		assertNull(p[3]);
 
-		p = ServletUtil.prepareParameters(new String[] {"", null, "   "}, true, true, true, false);
+		p = ServletUtil.prepareParameters(new String[] {"", null, "   "}, true, true, true);
 		assertNull(p);
 	}
 }
