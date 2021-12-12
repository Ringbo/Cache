diff --git a/hazelcast/src/main/java/com/hazelcast/instance/BuildInfo.java b/hazelcast/src/main/java/com/hazelcast/instance/BuildInfo.java
index 712c532..5fae029 100644
--- a/hazelcast/src/main/java/com/hazelcast/instance/BuildInfo.java
+++ b/hazelcast/src/main/java/com/hazelcast/instance/BuildInfo.java
@@ -80,14 +80,14 @@
         Matcher matcher = VERSION_PATTERN.matcher(version);
         if (matcher.matches()) {
             try {
-                int calculatedVersion = MAJOR_VERSION_MULTIPLIER * Integer.valueOf(matcher.group(1))
-                        + MINOR_VERSION_MULTIPLIER * Integer.valueOf(matcher.group(2));
+                int calculatedVersion = MAJOR_VERSION_MULTIPLIER * Integer.parseInt(matcher.group(1))
+                        + MINOR_VERSION_MULTIPLIER * Integer.parseInt(matcher.group(2));
 
                 int groupCount = matcher.groupCount();
                 if (groupCount >= PATCH_GROUP_COUNT) {
                     String patchVersionString = matcher.group(PATCH_GROUP_COUNT);
                     if (null != patchVersionString && !patchVersionString.startsWith("-")) {
-                        calculatedVersion += Integer.valueOf(patchVersionString);
+                        calculatedVersion += Integer.parseInt(patchVersionString);
                     }
                 }
                 return calculatedVersion;
