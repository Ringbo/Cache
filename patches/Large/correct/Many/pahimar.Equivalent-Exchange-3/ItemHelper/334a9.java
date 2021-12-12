diff --git a/src/main/java/com/pahimar/ee3/util/ItemHelper.java b/src/main/java/com/pahimar/ee3/util/ItemHelper.java
index c3197e9..3d1a873 100644
--- a/src/main/java/com/pahimar/ee3/util/ItemHelper.java
+++ b/src/main/java/com/pahimar/ee3/util/ItemHelper.java
@@ -180,7 +180,7 @@
      */
     public static boolean equals(ItemStack first, ItemStack second)
     {
-        return (displayNameComparator.compare(first, second) == 0);
+        return (baseComparator.compare(first, second) == 0);
     }
 
     public static boolean equalsIgnoreStackSize(ItemStack itemStack1, ItemStack itemStack2)
@@ -219,7 +219,7 @@
 
     public static int compare(ItemStack itemStack1, ItemStack itemStack2)
     {
-        return displayNameComparator.compare(itemStack1, itemStack2);
+        return baseComparator.compare(itemStack1, itemStack2);
     }
 
     public static String toString(ItemStack itemStack)
