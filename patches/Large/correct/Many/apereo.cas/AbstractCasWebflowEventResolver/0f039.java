diff --git a/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/resolver/impl/AbstractCasWebflowEventResolver.java b/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/resolver/impl/AbstractCasWebflowEventResolver.java
index 8cd25bb..0967b8d 100644
--- a/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/resolver/impl/AbstractCasWebflowEventResolver.java
+++ b/core/cas-server-core-webflow/src/main/java/org/apereo/cas/web/flow/resolver/impl/AbstractCasWebflowEventResolver.java
@@ -397,7 +397,7 @@
             return CollectionUtils.wrapSet(event);
         }
         LOGGER.debug("Provider [{}] could not be verified", provider);
-        return new HashSet<>();
+        return new HashSet<>(0);
     }
 
     private Set<Event> resolveEventViaAttribute(final Principal principal,
