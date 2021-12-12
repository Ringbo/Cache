diff --git a/portal-kernel/test/unit/com/liferay/portal/kernel/settings/LocationVariableResolverTest.java b/portal-kernel/test/unit/com/liferay/portal/kernel/settings/LocationVariableResolverTest.java
index 4ba1f25..c453597 100644
--- a/portal-kernel/test/unit/com/liferay/portal/kernel/settings/LocationVariableResolverTest.java
+++ b/portal-kernel/test/unit/com/liferay/portal/kernel/settings/LocationVariableResolverTest.java
@@ -44,10 +44,10 @@
 		_mockResourceManager = new MockResourceManager(
 			"En un lugar de la Mancha...");
 
-		_mockSettingsFactory = mock(SettingsFactory.class);
+		_mockSettingsLocatorHelper = mock(SettingsLocatorHelper.class);
 
 		_locationVariableResolver = new LocationVariableResolver(
-			_mockResourceManager, _mockSettingsFactory);
+			_mockResourceManager, _mockSettingsLocatorHelper);
 	}
 
 	@Test
@@ -115,7 +115,7 @@
 		);
 
 		when(
-			_mockSettingsFactory.getServerSettings("com.liferay.portal")
+			_mockSettingsLocatorHelper.getServerSettings("com.liferay.portal")
 		).thenReturn(
 			mockSettings
 		);
@@ -129,6 +129,6 @@
 
 	private LocationVariableResolver _locationVariableResolver;
 	private MockResourceManager _mockResourceManager;
-	private SettingsFactory _mockSettingsFactory;
+	private SettingsLocatorHelper _mockSettingsLocatorHelper;
 
 }
\ No newline at end of file
