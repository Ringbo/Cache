diff --git a/jOOQ-meta/src/main/java/org/jooq/util/AbstractDatabase.java b/jOOQ-meta/src/main/java/org/jooq/util/AbstractDatabase.java
index dd4eb2b..90d248a 100644
--- a/jOOQ-meta/src/main/java/org/jooq/util/AbstractDatabase.java
+++ b/jOOQ-meta/src/main/java/org/jooq/util/AbstractDatabase.java
@@ -1309,7 +1309,14 @@
                      && (     definedType.getScale() != 0
                      ||   !p.matcher(definedType.getType() + "(" + definedType.getPrecision() + ")").matches())
                      && ( !p.matcher(definedType.getType() + "(" + definedType.getPrecision() + "," + definedType.getScale() + ")").matches() )
-                     && ( !p.matcher(definedType.getType() + "(" + definedType.getPrecision() + ", " + definedType.getScale() + ")").matches() )) {
+                     && ( !p.matcher(definedType.getType() + "(" + definedType.getPrecision() + ", " + definedType.getScale() + ")").matches() )
+
+                     // [#5872] We should match user-defined types as well, in case of which the type might be reported
+                     //         as USER-DEFINED (in PostgreSQL)
+                     && ( StringUtils.isBlank(definedType.getUserType())
+                     ||   !p.matcher(definedType.getUserType()).matches()
+                     &&   !p.matcher(definedType.getQualifiedUserType().toString().replace("\"", "")).matches() )
+                ) {
                     continue forcedTypeLoop;
                 }
             }
