diff --git a/python/openapi/src/com/jetbrains/python/packaging/PyRequirement.java b/python/openapi/src/com/jetbrains/python/packaging/PyRequirement.java
index 607af5d..c65ddbb 100644
--- a/python/openapi/src/com/jetbrains/python/packaging/PyRequirement.java
+++ b/python/openapi/src/com/jetbrains/python/packaging/PyRequirement.java
@@ -288,7 +288,7 @@
 
   @NotNull
   private static List<PyRequirement> parse(@NotNull String s, @Nullable VirtualFile anchor, @NotNull Set<VirtualFile> visited) {
-    final List<PyRequirement> result = new ArrayList<PyRequirement>();
+    final Set<PyRequirement> result = new LinkedHashSet<PyRequirement>();
     for (String line : StringUtil.splitByLines(s)) {
       final String trimmed = line.trim();
       if (!trimmed.isEmpty()) {
@@ -301,7 +301,7 @@
         }
       }
     }
-    return result;
+    return new ArrayList<PyRequirement>(result);
   }
 
   @NotNull
