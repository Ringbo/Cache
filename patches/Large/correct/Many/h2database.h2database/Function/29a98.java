diff --git a/h2/src/main/org/h2/expression/Function.java b/h2/src/main/org/h2/expression/Function.java
index f79e3e0..90c85d1 100644
--- a/h2/src/main/org/h2/expression/Function.java
+++ b/h2/src/main/org/h2/expression/Function.java
@@ -1386,7 +1386,7 @@
             String regexp = v1.getString();
             String replacement = v2.getString();
             String regexpMode = v3 == null || v3.getString() == null ? "" :
-                    v2.getString();
+                    v3.getString();
             int flags = makeRegexpFlags(regexpMode);
             try {
                 result = ValueString.get(
