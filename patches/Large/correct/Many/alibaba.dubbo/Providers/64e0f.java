diff --git a/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/governance/module/screen/Providers.java b/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/governance/module/screen/Providers.java
index 3dfa20c..d8356c2 100644
--- a/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/governance/module/screen/Providers.java
+++ b/dubbo-admin/src/main/java/com/alibaba/dubbo/governance/web/governance/module/screen/Providers.java
@@ -130,7 +130,7 @@
      */
     private Map<String, Set<String>> getServiceAppMap(List<Provider> providers) {
         Map<String, Set<String>> serviceAppMap = new HashMap<String, Set<String>>();
-        if (providers != null && providers.size() >= 0) {
+        if (providers != null && providers.size() > 0) {
             for (Provider provider : providers) {
                 Set<String> appSet;
                 String service = provider.getService();
