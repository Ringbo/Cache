diff --git a/core/cas-server-core-services/src/test/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDaoTests.java b/core/cas-server-core-services/src/test/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDaoTests.java
index 3846107..fd04d3b 100644
--- a/core/cas-server-core-services/src/test/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDaoTests.java
+++ b/core/cas-server-core-services/src/test/java/org/apereo/cas/services/AbstractResourceBasedServiceRegistryDaoTests.java
@@ -174,7 +174,7 @@
                 (AnonymousRegisteredServiceUsernameAttributeProvider) r3.getUsernameAttributeProvider();
         final ShibbolethCompatiblePersistentIdGenerator ss =
                 (ShibbolethCompatiblePersistentIdGenerator) anon.getPersistentIdGenerator();
-        assertEquals(ss.getSalt(), "helloworld");
+        assertEquals("helloworld", ss.getSalt());
         assertEquals(r2, r3);
     }
 
@@ -496,10 +496,10 @@
         this.dao.save(r);
         this.dao.load();
         assertNotNull(this.dao.findServiceById(r.getId()));
-        assertEquals(r.getProperties().size(), 2);
+        assertEquals(2, r.getProperties().size());
         assertNotNull(r.getProperties().get("field1"));
 
         final RegisteredServiceProperty prop = r.getProperties().get("field1");
-        assertEquals(prop.getValues().size(), 2);
+        assertEquals(2, prop.getValues().size());
     }
 }
