diff --git a/core/src/main/java/org/apache/mahout/cf/taste/impl/common/FastMap.java b/core/src/main/java/org/apache/mahout/cf/taste/impl/common/FastMap.java
index 4db265b..d5ad329 100644
--- a/core/src/main/java/org/apache/mahout/cf/taste/impl/common/FastMap.java
+++ b/core/src/main/java/org/apache/mahout/cf/taste/impl/common/FastMap.java
@@ -52,7 +52,7 @@
   private int numEntries;
   private int numSlotsUsed;
   private int maxSize;
-  private final BitSet recentlyAccessed;
+  private BitSet recentlyAccessed;
   private final boolean countingAccesses;
 
   /**
@@ -90,7 +90,7 @@
     values = (V[]) new Object[hashSize];
     this.maxSize = maxSize;
     this.countingAccesses = maxSize != Integer.MAX_VALUE;
-    this.recentlyAccessed = countingAccesses ? new BitSet(maxSize) : null;
+    this.recentlyAccessed = countingAccesses ? new BitSet(hashSize) : null;
   }
 
   /**
@@ -301,7 +301,7 @@
     numEntries = 0;
     numSlotsUsed = 0;
     if (countingAccesses) {
-      recentlyAccessed.clear();
+      recentlyAccessed = new BitSet(newHashSize);
     }
     keys = (K[]) new Object[newHashSize];
     values = (V[]) new Object[newHashSize];
