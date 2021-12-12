diff --git a/src/web/core/src/test/java/org/geoserver/web/data/store/CoverageStoreEditPageTest.java b/src/web/core/src/test/java/org/geoserver/web/data/store/CoverageStoreEditPageTest.java
index 2dbd1af..91f3801 100644
--- a/src/web/core/src/test/java/org/geoserver/web/data/store/CoverageStoreEditPageTest.java
+++ b/src/web/core/src/test/java/org/geoserver/web/data/store/CoverageStoreEditPageTest.java
@@ -139,10 +139,10 @@
         tester.clickLink("rasterStoreForm:save");
         tester.assertNoErrorMessage();
 
-        assertNull(store.getId());
+        assertNotNull(store.getId());
         assertEquals("foo", store.getName());
         assertNotNull(catalog.getStoreByName(coverageStore.getName(), CoverageStoreInfo.class));
-        assertNull(catalog.getStoreByName("foo", CoverageStoreInfo.class));
+        assertNotNull(catalog.getStoreByName("foo", CoverageStoreInfo.class));
 
     }
 }
