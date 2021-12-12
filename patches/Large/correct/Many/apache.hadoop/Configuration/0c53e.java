diff --git a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java
index b2128e7..2145415 100644
--- a/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java
+++ b/hadoop-common-project/hadoop-common/src/main/java/org/apache/hadoop/conf/Configuration.java
@@ -2332,17 +2332,17 @@
   
   /**
    * A unique class which is used as a sentinel value in the caching
-   * for getClassByName. {@see Configuration#getClassByNameOrNull(String)}
+   * for getClassByName. {@link Configuration#getClassByNameOrNull(String)}
    */
   private static abstract class NegativeCacheSentinel {}
 
   public static void dumpDeprecatedKeys() {
     for (Map.Entry<String, DeprecatedKeyInfo> entry : deprecatedKeyMap.entrySet()) {
-      String newKeys = "";
+      StringBuilder newKeys = new StringBuilder();
       for (String newKey : entry.getValue().newKeys) {
-        newKeys += newKey + "\t";
+        newKeys.append(newKey).append("\t");
       }
-      System.out.println(entry.getKey() + "\t" + newKeys);
+      System.out.println(entry.getKey() + "\t" + newKeys.toString());
     }
   }
 }
