diff --git a/components/fabric8-cdi/src/test/java/io/fabric8/cdi/weld/ExtensionTest.java b/components/fabric8-cdi/src/test/java/io/fabric8/cdi/weld/ExtensionTest.java
index 660a4d1..3d7dfb8 100644
--- a/components/fabric8-cdi/src/test/java/io/fabric8/cdi/weld/ExtensionTest.java
+++ b/components/fabric8-cdi/src/test/java/io/fabric8/cdi/weld/ExtensionTest.java
@@ -108,7 +108,7 @@
                             .setHeader("Content-Type", "application/json")
                             .setBody("{}");
                 } else {
-                    return new MockResponse().setResponseCode(401);
+                    return new MockResponse().setResponseCode(404);
                 }
             }
         });
@@ -183,7 +183,7 @@
 
 
     @Test
-    public void testNestingFacvtories() {
+    public void testNestingFactories() {
         Assert.assertNotNull(nestingFactoryBean);
         Assert.assertNotNull(nestingFactoryBean.getConsoleConnection());
         Assert.assertNotNull(nestingFactoryBean.getAppLibraryConnection());
