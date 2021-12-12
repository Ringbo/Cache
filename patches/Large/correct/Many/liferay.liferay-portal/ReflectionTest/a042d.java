diff --git a/portal-impl/test/integration/com/liferay/portal/security/pacl/test/ReflectionTest.java b/portal-impl/test/integration/com/liferay/portal/security/pacl/test/ReflectionTest.java
index b9bcc46..2e191d4 100644
--- a/portal-impl/test/integration/com/liferay/portal/security/pacl/test/ReflectionTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/security/pacl/test/ReflectionTest.java
@@ -44,7 +44,7 @@
 
 	@BeforeClass
 	public static void setUpClass() {
-		Assume.assumeTrue(JavaDetector.isJDK7());
+		Assume.assumeTrue("JDK is not 7", JavaDetector.isJDK7());
 	}
 
 	@Test
