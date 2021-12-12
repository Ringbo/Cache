diff --git a/common/src/main/java/org/broadleafcommerce/common/site/service/SiteServiceImpl.java b/common/src/main/java/org/broadleafcommerce/common/site/service/SiteServiceImpl.java
index d55b9f4..7f5028e 100644
--- a/common/src/main/java/org/broadleafcommerce/common/site/service/SiteServiceImpl.java
+++ b/common/src/main/java/org/broadleafcommerce/common/site/service/SiteServiceImpl.java
@@ -262,7 +262,7 @@
         if (persistentSite == null) {
             return null;
         }
-        NonPersistentSiteTheadLocalCache cache = NonPersistentSiteTheadLocalCache.getSitesCache();
+        NonPersistentSiteThreadLocalCache cache = NonPersistentSiteThreadLocalCache.getSitesCache();
         Site clone = cache.getSites().get(persistentSite.getId());
         if (clone == null) {
             clone = persistentSite.clone();
