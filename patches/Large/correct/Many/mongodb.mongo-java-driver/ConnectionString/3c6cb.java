diff --git a/driver-core/src/main/com/mongodb/ConnectionString.java b/driver-core/src/main/com/mongodb/ConnectionString.java
index 7cd5f8f..1bd599f 100644
--- a/driver-core/src/main/com/mongodb/ConnectionString.java
+++ b/driver-core/src/main/com/mongodb/ConnectionString.java
@@ -487,7 +487,7 @@
                 authSource = value;
             } else if (key.equals("gssapiservicename")) {
                 gssapiServiceName = value;
-            } else if (key.endsWith("authmechanismproperties")) {
+            } else if (key.equals("authmechanismproperties")) {
                 authMechanismProperties = value;
             }
         }
