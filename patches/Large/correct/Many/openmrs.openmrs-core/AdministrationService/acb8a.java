diff --git a/api/src/main/java/org/openmrs/api/AdministrationService.java b/api/src/main/java/org/openmrs/api/AdministrationService.java
index 3650ae2..94e559c 100644
--- a/api/src/main/java/org/openmrs/api/AdministrationService.java
+++ b/api/src/main/java/org/openmrs/api/AdministrationService.java
@@ -56,7 +56,7 @@
 	 * @should find object given valid uuid
 	 * @should return null if no object found with given uuid
 	 */
-	public GlobalProperty getGlobalPropertyByUuid(String uuid) throws APIException;
+	public GlobalProperty getGlobalPropertyByUuid(String uuid);
 	
 	/**
 	 * Get a listing or important variables used in openmrs
@@ -66,7 +66,7 @@
 	 */
 	
 	@Authorized(PrivilegeConstants.VIEW_ADMIN_FUNCTIONS)
-	public SortedMap<String, String> getSystemVariables() throws APIException;
+	public SortedMap<String, String> getSystemVariables();
 	
 	/**
 	 * Get a map of all the System Information. Java, user, time, runtime properties, etc
@@ -75,7 +75,7 @@
 	 * @should return all system information
 	 */
 	@Authorized(PrivilegeConstants.VIEW_ADMIN_FUNCTIONS)
-	public Map<String, Map<String, String>> getSystemInformation() throws APIException;
+	public Map<String, Map<String, String>> getSystemInformation();
 	
 	/**
 	 * Gets the global property that has the given <code>propertyName</code>.
@@ -90,7 +90,7 @@
 	 * @should get property value given valid property name
 	 * @should get property in case insensitive way
 	 */
-	public String getGlobalProperty(String propertyName) throws APIException;
+	public String getGlobalProperty(String propertyName);
 	
 	/**
 	 * Gets the global property that has the given <code>propertyName</code>
@@ -106,7 +106,7 @@
 	 * @should return default value if property name does not exist
 	 * @should not fail with null default value
 	 */
-	public String getGlobalProperty(String propertyName, String defaultValue) throws APIException;
+	public String getGlobalProperty(String propertyName, String defaultValue);
 	
 	/**
 	 * Gets the global property that has the given <code>propertyName</code>
@@ -144,7 +144,7 @@
 	 * @should return all global properties in the database
 	 */
 	@Authorized(PrivilegeConstants.GET_GLOBAL_PROPERTIES)
-	public List<GlobalProperty> getAllGlobalProperties() throws APIException;
+	public List<GlobalProperty> getAllGlobalProperties();
 	
 	/**
 	 * Save the given list of global properties to the database.
@@ -157,7 +157,7 @@
 	 * @should save properties with case difference only
 	 */
 	@Authorized(PrivilegeConstants.MANAGE_GLOBAL_PROPERTIES)
-	public List<GlobalProperty> saveGlobalProperties(List<GlobalProperty> props) throws APIException;
+	public List<GlobalProperty> saveGlobalProperties(List<GlobalProperty> props);
 	
 	/**
 	 * Completely remove the given global property from the database
@@ -167,7 +167,7 @@
 	 * @should delete global property from database
 	 */
 	@Authorized(PrivilegeConstants.PURGE_GLOBAL_PROPERTIES)
-	public void purgeGlobalProperty(GlobalProperty globalProperty) throws APIException;
+	public void purgeGlobalProperty(GlobalProperty globalProperty);
 	
 	/**
 	 * Completely remove the given global properties from the database
@@ -177,7 +177,7 @@
 	 * @should delete global properties from database
 	 */
 	@Authorized(PrivilegeConstants.PURGE_GLOBAL_PROPERTIES)
-	public void purgeGlobalProperties(List<GlobalProperty> globalProperties) throws APIException;
+	public void purgeGlobalProperties(List<GlobalProperty> globalProperties);
 	
 	/**
 	 * Save the given global property to the database. If the global property already exists,
@@ -202,7 +202,7 @@
 	 * @should fail if global property being updated does not already exist
 	 * @should update a global property whose typed value is handled by a custom datatype
 	 */
-	public void updateGlobalProperty(String propertyName, String propertyValue) throws IllegalStateException;
+	public void updateGlobalProperty(String propertyName, String propertyValue);
 	
 	/**
 	 * Save the given global property to the database
@@ -217,7 +217,7 @@
 	 * @should evict all entries of search locale cache
 	 */
 	@Authorized(PrivilegeConstants.MANAGE_GLOBAL_PROPERTIES)
-	public GlobalProperty saveGlobalProperty(GlobalProperty gp) throws APIException;
+	public GlobalProperty saveGlobalProperty(GlobalProperty gp);
 	
 	/**
 	 * Allows code to be notified when a global property is created/edited/deleted.
@@ -246,7 +246,7 @@
 	 * @should execute sql containing group by
 	 */
 	@Authorized(PrivilegeConstants.SQL_LEVEL_ACCESS)
-	public List<List<Object>> executeSQL(String sql, boolean selectOnly) throws APIException;
+	public List<List<Object>> executeSQL(String sql, boolean selectOnly);
 	
 	/**
 	 * Get the implementation id stored for this server Returns null if no implementation id has
@@ -256,7 +256,7 @@
 	 * @should return null if no implementation id is defined yet
 	 */
 	@Authorized(PrivilegeConstants.MANAGE_IMPLEMENTATION_ID)
-	public ImplementationId getImplementationId() throws APIException;
+	public ImplementationId getImplementationId();
 	
 	/**
 	 * Set the given <code>implementationId</code> as this implementation's unique id
@@ -273,7 +273,7 @@
 	 * @should set uuid on implementation id global property
 	 */
 	@Authorized(PrivilegeConstants.MANAGE_IMPLEMENTATION_ID)
-	public void setImplementationId(ImplementationId implementationId) throws APIException;
+	public void setImplementationId(ImplementationId implementationId);
 	
 	/**
 	 * Gets the list of locales which the administrator has allowed for use on the system. This is
@@ -313,7 +313,7 @@
 	 * @return property value in the type of the default value
 	 * @since 1.7
 	 */
-	public <T> T getGlobalPropertyValue(String propertyName, T defaultValue) throws APIException;
+	public <T> T getGlobalPropertyValue(String propertyName, T defaultValue);
 	
 	/**
 	 * @param aClass class of object getting length for
@@ -334,7 +334,7 @@
 	 * @should fail for an invalid object
 	 * @should throw throw APIException if the input is null
 	 */
-	public void validate(Object object, Errors errors) throws APIException;
+	public void validate(Object object, Errors errors);
 
 	/**
 	 * Returns a list of locales used by the user when searching.
@@ -344,7 +344,7 @@
 	 * @return
 	 * @throws APIException
      */
-	public List<Locale> getSearchLocales(Locale currentLocale, User user) throws APIException;
+	public List<Locale> getSearchLocales(Locale currentLocale, User user);
 
 	/**
 	 * Returns a list of locales used by the user when searching.
@@ -359,7 +359,7 @@
 	 * @should exclude not allowed locales
 	 * @should cache results for a user
 	 */
-	public List<Locale> getSearchLocales() throws APIException;
+	public List<Locale> getSearchLocales();
 	
 	/**
 	 * Used by Spring to set the http client for accessing the openmrs implementation service
