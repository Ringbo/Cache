diff --git a/test/com/facebook/buck/testutil/endtoend/EndToEndWorkspace.java b/test/com/facebook/buck/testutil/endtoend/EndToEndWorkspace.java
index 2466d2b..79a94e1 100644
--- a/test/com/facebook/buck/testutil/endtoend/EndToEndWorkspace.java
+++ b/test/com/facebook/buck/testutil/endtoend/EndToEndWorkspace.java
@@ -128,7 +128,7 @@
       if (entry.getKey() == "NO_BUCKD" && buckdEnabled) continue;
       environmentBuilder.put(entry.getKey(), entry.getValue());
     }
-    if (buckdEnabled) {
+    if (!buckdEnabled) {
       environmentBuilder.put("NO_BUCKD", "1");
     }
     environmentBuilder.putAll(environmentOverrides);
