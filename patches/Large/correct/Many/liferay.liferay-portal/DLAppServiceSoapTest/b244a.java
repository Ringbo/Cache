diff --git a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/http/DLAppServiceSoapTest.java b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/http/DLAppServiceSoapTest.java
index f7ffaa2..fac6364 100644
--- a/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/http/DLAppServiceSoapTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/documentlibrary/service/http/DLAppServiceSoapTest.java
@@ -40,7 +40,7 @@
 public class DLAppServiceSoapTest {
 
 	@BeforeClass
-	public static void setUp() throws Exception {
+	public void setUp() throws Exception {
 		String name = "Test Folder";
 		String description = "This is a test folder.";
 
@@ -64,7 +64,7 @@
 	}
 
 	@AfterClass
-	public static void tearDown() throws Exception {
+	public void tearDown() throws Exception {
 		try {
 			if (_folder != null) {
 				getDLAppServiceSoap().deleteFolder(_folder.getFolderId());
