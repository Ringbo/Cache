diff --git a/actor-apps/build-tools/configen/src/main/java/im/actor/config/Main.java b/actor-apps/build-tools/configen/src/main/java/im/actor/config/Main.java
index dbdc7f8..7f14843 100644
--- a/actor-apps/build-tools/configen/src/main/java/im/actor/config/Main.java
+++ b/actor-apps/build-tools/configen/src/main/java/im/actor/config/Main.java
@@ -77,7 +77,7 @@
                     for (String key : variantData.keySet()) {
                         // Override keys
                         res.remove(key);
-                        res.put(key, convertToJson(platformData.get(key)));
+                        res.put(key, convertToJson(variantData.get(key)));
                     }
                 }
             }
