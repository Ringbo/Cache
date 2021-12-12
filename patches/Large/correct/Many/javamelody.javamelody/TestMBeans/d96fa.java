diff --git a/javamelody-core/src/test/java/net/bull/javamelody/internal/model/TestMBeans.java b/javamelody-core/src/test/java/net/bull/javamelody/internal/model/TestMBeans.java
index 45dc4a9..268a869 100644
--- a/javamelody-core/src/test/java/net/bull/javamelody/internal/model/TestMBeans.java
+++ b/javamelody-core/src/test/java/net/bull/javamelody/internal/model/TestMBeans.java
@@ -71,17 +71,15 @@
 		}
 	}
 
-	/** Test.
-	 * @throws JMException e */
+	/** Test. */
 	@Test
-	public void testGetTomcatThreadPools() throws JMException {
+	public void testGetTomcatThreadPools() {
 		assertNotNull("getTomcatThreadPools", MBeansAccessor.getTomcatThreadPools());
 	}
 
-	/** Test.
-	 * @throws JMException e */
+	/** Test. */
 	@Test
-	public void testGetTomcatGlobalRequestProcessors() throws JMException {
+	public void testGetTomcatGlobalRequestProcessors() {
 		assertNotNull("getTomcatGlobalRequestProcessors",
 				MBeansAccessor.getTomcatGlobalRequestProcessors());
 	}
