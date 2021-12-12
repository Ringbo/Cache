diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java b/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java
index c0fbf2f..64f4805 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java
@@ -346,7 +346,7 @@
         final List<String> propertyRefs = new ArrayList<>();
         parsePropertyString(value, fragments, propertyRefs);
 
-        final StringBuilder sb = new StringBuilder();
+        final StringBuilder sb = new StringBuilder(256);
         final Iterator<String> fragmentsIterator = fragments.iterator();
         final Iterator<String> propertyRefsIterator = propertyRefs.iterator();
         while (fragmentsIterator.hasNext()) {
