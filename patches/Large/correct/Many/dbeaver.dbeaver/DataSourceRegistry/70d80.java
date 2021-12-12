diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DataSourceRegistry.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DataSourceRegistry.java
index 12b830c..964f218 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DataSourceRegistry.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/registry/DataSourceRegistry.java
@@ -660,7 +660,7 @@
             for (String propName : prefStore.preferenceNames()) {
                 String propValue = prefStore.getString(propName);
                 String defValue = prefStore.getDefaultString(propName);
-                if (propValue == null) {
+                if (propValue == null || CommonUtils.equalObjects(propValue, defValue)) {
                     continue;
                 }
                 xml.startElement(RegistryConstants.TAG_CUSTOM_PROPERTY);
