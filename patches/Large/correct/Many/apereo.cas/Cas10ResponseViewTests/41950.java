diff --git a/support/cas-server-support-validation/src/test/java/org/apereo/cas/web/view/Cas10ResponseViewTests.java b/support/cas-server-support-validation/src/test/java/org/apereo/cas/web/view/Cas10ResponseViewTests.java
index 24ce2ce..62b9320 100644
--- a/support/cas-server-support-validation/src/test/java/org/apereo/cas/web/view/Cas10ResponseViewTests.java
+++ b/support/cas-server-support-validation/src/test/java/org/apereo/cas/web/view/Cas10ResponseViewTests.java
@@ -27,13 +27,13 @@
     private Map<String, Object> model;
 
     @Before
-    public void setUp() throws Exception {
+    public void setUp() {
         this.model = new HashMap<>();
         final List<Authentication> list = new ArrayList<>();
         list.add(CoreAuthenticationTestUtils.getAuthentication("someothername"));
         this.model.put("assertion", new DefaultAssertionBuilder(
                 CoreAuthenticationTestUtils.getAuthentication()).with(list).with(
-                CoreAuthenticationTestUtils.getService("TestService")).with(true));
+                CoreAuthenticationTestUtils.getService("TestService")).with(true).build());
     }
 
     @Test
