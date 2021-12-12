diff --git a/configserver/src/test/java/com/yahoo/vespa/config/server/ModelContextImplTest.java b/configserver/src/test/java/com/yahoo/vespa/config/server/ModelContextImplTest.java
index e4c336a..aed0a6a 100644
--- a/configserver/src/test/java/com/yahoo/vespa/config/server/ModelContextImplTest.java
+++ b/configserver/src/test/java/com/yahoo/vespa/config/server/ModelContextImplTest.java
@@ -48,8 +48,7 @@
                         null,
                         false,
                         Zone.defaultZone(),
-                        rotations,
-                        false),
+                        rotations),
                 Optional.empty(),
                 new Version(6), 
                 new Version(6));
