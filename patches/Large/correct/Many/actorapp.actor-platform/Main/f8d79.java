diff --git a/actor-apps/build-tools/configen/src/main/java/im/actor/config/Main.java b/actor-apps/build-tools/configen/src/main/java/im/actor/config/Main.java
index 024b463..93a365d 100644
--- a/actor-apps/build-tools/configen/src/main/java/im/actor/config/Main.java
+++ b/actor-apps/build-tools/configen/src/main/java/im/actor/config/Main.java
@@ -71,7 +71,7 @@
             // Variant values
             if (platformData.containsKey("variants")) {
                 Map<String, Object> variants = (Map<String, Object>) platformData.get(variant);
-                if (platformData.containsKey(variant)) {
+                if (variants.containsKey(variant)) {
                     Map<String, Object> variantData = (Map<String, Object>) variants.get(variant);
 
                     for (String key : variantData.keySet()) {
