diff --git a/core/cas-server-core-configuration/src/main/java/org/apereo/cas/configuration/support/Beans.java b/core/cas-server-core-configuration/src/main/java/org/apereo/cas/configuration/support/Beans.java
index b113d95..f9bfda2 100644
--- a/core/cas-server-core-configuration/src/main/java/org/apereo/cas/configuration/support/Beans.java
+++ b/core/cas-server-core-configuration/src/main/java/org/apereo/cas/configuration/support/Beans.java
@@ -181,7 +181,7 @@
             final Map<String, List<Object>> pdirMap = new HashMap<>();
             p.getAttributes().entrySet().forEach(entry -> {
                 final String[] vals = org.springframework.util.StringUtils.commaDelimitedListToStringArray(entry.getValue());
-                pdirMap.put(entry.getKey(), Lists.newArrayList((String[]) vals));
+                pdirMap.put(entry.getKey(), Lists.newArrayList((Object[]) vals));
             });
             dao.setBackingMap(pdirMap);
             return dao;
