diff --git a/subprojects/base-services/src/main/java/org/gradle/api/JavaVersion.java b/subprojects/base-services/src/main/java/org/gradle/api/JavaVersion.java
index 72f464f..0a0ed3c 100644
--- a/subprojects/base-services/src/main/java/org/gradle/api/JavaVersion.java
+++ b/subprojects/base-services/src/main/java/org/gradle/api/JavaVersion.java
@@ -87,7 +87,7 @@
 
     public static JavaVersion forClassVersion(int classVersion) {
         int index = classVersion - 45; //class file versions: 1.1 == 45, 1.2 == 46...
-        if (index > 0 && index < values().length) {
+        if (index >= 0 && index < values().length) {
             return values()[index];
         }
         throw new IllegalArgumentException(String.format("Could not determine java version from '%d'.", classVersion));
