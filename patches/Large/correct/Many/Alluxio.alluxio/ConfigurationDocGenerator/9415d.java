diff --git a/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java b/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java
index 7c89f08..19e3da4 100644
--- a/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java
+++ b/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java
@@ -80,7 +80,7 @@
       }
 
       //Sort defaultKeys
-      Comparator<PropertyKey> pC = new ConfigurationDocGenerator().new PropertyKeyComparator();
+      Comparator<PropertyKey> pC = new PropertyKeyComparator();
       List<PropertyKey> dfkeys = new ArrayList<>(defaultKeys);
       Collections.sort(dfkeys, pC);
 
@@ -140,7 +140,7 @@
   /**
    * PropertyKey Comparator inner class.
    */
-  private final class PropertyKeyComparator implements Comparator<PropertyKey> {
+  private static final class PropertyKeyComparator implements Comparator<PropertyKey> {
     private PropertyKeyComparator() {
     } // prevent instantiation
 
