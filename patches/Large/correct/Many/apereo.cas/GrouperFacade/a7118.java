diff --git a/support/cas-server-support-grouper-core/src/main/java/org/apereo/cas/grouper/GrouperFacade.java b/support/cas-server-support-grouper-core/src/main/java/org/apereo/cas/grouper/GrouperFacade.java
index 168e45d..dd6b96b 100644
--- a/support/cas-server-support-grouper-core/src/main/java/org/apereo/cas/grouper/GrouperFacade.java
+++ b/support/cas-server-support-grouper-core/src/main/java/org/apereo/cas/grouper/GrouperFacade.java
@@ -59,7 +59,7 @@
 
             if (results == null || results.length == 0) {
                 LOGGER.warn("Subject id [{}] could not be located.", subjectId);
-                return new ArrayList<>();
+                return new ArrayList<>(0);
             }
             LOGGER.debug("Found [{}] groups for [{}]", results.length, subjectId);
             return CollectionUtils.wrapList(results);
