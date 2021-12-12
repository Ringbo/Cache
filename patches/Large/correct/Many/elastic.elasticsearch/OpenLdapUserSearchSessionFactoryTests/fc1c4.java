diff --git a/x-pack/qa/openldap-tests/src/test/java/org/elasticsearch/xpack/security/authc/ldap/OpenLdapUserSearchSessionFactoryTests.java b/x-pack/qa/openldap-tests/src/test/java/org/elasticsearch/xpack/security/authc/ldap/OpenLdapUserSearchSessionFactoryTests.java
index ae73c14..a4351b6 100644
--- a/x-pack/qa/openldap-tests/src/test/java/org/elasticsearch/xpack/security/authc/ldap/OpenLdapUserSearchSessionFactoryTests.java
+++ b/x-pack/qa/openldap-tests/src/test/java/org/elasticsearch/xpack/security/authc/ldap/OpenLdapUserSearchSessionFactoryTests.java
@@ -51,7 +51,7 @@
     private static final String LDAPCACERT_PATH = "/ca.crt";
 
     @Before
-    public void init() throws Exception {
+    public void init() {
         Path caPath = getDataPath(LDAPCACERT_PATH);
         /*
          * Prior to each test we reinitialize the socket factory with a new SSLService so that we get a new SSLContext.
@@ -60,7 +60,7 @@
          */
         globalSettings = Settings.builder()
             .put("path.home", createTempDir())
-            .put("xpack.security.authc.realms.ldap.ssl.certificate_authorities", caPath)
+            .put("xpack.security.authc.realms.ldap.oldap-test.ssl.certificate_authorities", caPath)
             .build();
         threadPool = new TestThreadPool("LdapUserSearchSessionFactoryTests");
     }
