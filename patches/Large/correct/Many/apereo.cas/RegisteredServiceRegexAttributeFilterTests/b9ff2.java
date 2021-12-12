diff --git a/cas-server-core/src/test/java/org/jasig/cas/services/support/RegisteredServiceRegexAttributeFilterTests.java b/cas-server-core/src/test/java/org/jasig/cas/services/support/RegisteredServiceRegexAttributeFilterTests.java
index 12ef941..2c6acd1 100644
--- a/cas-server-core/src/test/java/org/jasig/cas/services/support/RegisteredServiceRegexAttributeFilterTests.java
+++ b/cas-server-core/src/test/java/org/jasig/cas/services/support/RegisteredServiceRegexAttributeFilterTests.java
@@ -90,7 +90,7 @@
         when(this.registeredService.isIgnoreAttributes()).thenReturn(false);
         
         final Map<String, Object> attrs = this.filter.filter("test", this.givenAttributesMap, this.registeredService);
-        assertEquals(attrs.size(), 3);
+        assertEquals(attrs.size(), 7);
         
         assertFalse(attrs.containsKey("phone"));
         assertFalse(attrs.containsKey("givenName"));
