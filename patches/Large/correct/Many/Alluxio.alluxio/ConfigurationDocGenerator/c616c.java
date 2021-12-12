diff --git a/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java b/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java
index f3eb1a6..7c89f08 100644
--- a/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java
+++ b/shell/src/main/java/alluxio/cli/ConfigurationDocGenerator.java
@@ -140,7 +140,7 @@
   /**
    * PropertyKey Comparator inner class.
    */
-  private class PropertyKeyComparator implements Comparator<PropertyKey> {
+  private final class PropertyKeyComparator implements Comparator<PropertyKey> {
     private PropertyKeyComparator() {
     } // prevent instantiation
 
