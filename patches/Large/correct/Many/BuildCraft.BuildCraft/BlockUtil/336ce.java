diff --git a/common/buildcraft/lib/misc/BlockUtil.java b/common/buildcraft/lib/misc/BlockUtil.java
index 4ed0081..75160d0 100644
--- a/common/buildcraft/lib/misc/BlockUtil.java
+++ b/common/buildcraft/lib/misc/BlockUtil.java
@@ -423,26 +423,26 @@
     }
 
     public static boolean blockStatesWithoutBlockEqual(IBlockState a, IBlockState b, Collection<IProperty<?>> ignoredProperties) {
-        return Sets.union(new HashSet<>(a.getPropertyKeys()), new HashSet<>(b.getPropertyKeys())).stream()
+        return Sets.intersection(new HashSet<>(a.getPropertyKeys()), new HashSet<>(b.getPropertyKeys())).stream()
                 .filter(property -> !ignoredProperties.contains(property))
                 .allMatch(property -> Objects.equals(a.getValue(property), b.getValue(property)));
     }
 
     public static boolean blockStatesWithoutBlockEqual(IBlockState a, IBlockState b) {
-        return Sets.union(new HashSet<>(a.getPropertyKeys()), new HashSet<>(b.getPropertyKeys())).stream()
+        return Sets.intersection(new HashSet<>(a.getPropertyKeys()), new HashSet<>(b.getPropertyKeys())).stream()
                 .allMatch(property -> Objects.equals(a.getValue(property), b.getValue(property)));
     }
 
     public static boolean blockStatesEqual(IBlockState a, IBlockState b, Collection<IProperty<?>> ignoredProperties) {
         return a.getBlock() == b.getBlock() &&
-                Sets.union(new HashSet<>(a.getPropertyKeys()), new HashSet<>(b.getPropertyKeys())).stream()
+                Sets.intersection(new HashSet<>(a.getPropertyKeys()), new HashSet<>(b.getPropertyKeys())).stream()
                 .filter(property -> !ignoredProperties.contains(property))
                 .allMatch(property -> Objects.equals(a.getValue(property), b.getValue(property)));
     }
 
     public static boolean blockStatesEqual(IBlockState a, IBlockState b) {
         return a.getBlock() == b.getBlock() &&
-                Sets.union(new HashSet<>(a.getPropertyKeys()), new HashSet<>(b.getPropertyKeys())).stream()
+                Sets.intersection(new HashSet<>(a.getPropertyKeys()), new HashSet<>(b.getPropertyKeys())).stream()
                 .allMatch(property -> Objects.equals(a.getValue(property), b.getValue(property)));
     }
 
