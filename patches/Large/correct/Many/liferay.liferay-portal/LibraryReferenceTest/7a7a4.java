diff --git a/portal-kernel/test/unit/com/liferay/portal/library/LibraryReferenceTest.java b/portal-kernel/test/unit/com/liferay/portal/library/LibraryReferenceTest.java
index ce4e837..fe6794d 100644
--- a/portal-kernel/test/unit/com/liferay/portal/library/LibraryReferenceTest.java
+++ b/portal-kernel/test/unit/com/liferay/portal/library/LibraryReferenceTest.java
@@ -112,7 +112,7 @@
 
 	@Test
 	public void testLibJarsInNetBeans() {
-		testMissingJarReferences(_netBeansJars, _NETBEANS_XML_FILE_NAME);
+		testMissingJarReferences(_netBeansJars, _NETBEANS_PROPERTIES_FILE_NAME);
 	}
 
 	@Test
@@ -134,7 +134,8 @@
 
 	@Test
 	public void testNetBeansJarsInLib() {
-		testNonexistentJarReferences(_netBeansJars, _NETBEANS_XML_FILE_NAME);
+		testNonexistentJarReferences(
+			_netBeansJars, _NETBEANS_PROPERTIES_FILE_NAME);
 	}
 
 	@Test
