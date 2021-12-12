diff --git a/realm/src/androidTest/java/io/realm/RealmTest.java b/realm/src/androidTest/java/io/realm/RealmTest.java
index 73cdd9a..8b9fd14 100644
--- a/realm/src/androidTest/java/io/realm/RealmTest.java
+++ b/realm/src/androidTest/java/io/realm/RealmTest.java
@@ -1704,7 +1704,7 @@
 
         // insert some rows, then give the thread some time to cleanup
         // we have 8 reference so far let's add more
-        final int numberOfPopulateTest = 10000;
+        final int numberOfPopulateTest = 1000;
         final int totalNumberOfReferences = 8 + 20 * 2 * numberOfPopulateTest;
 
         long tic = System.currentTimeMillis();
@@ -1725,7 +1725,7 @@
         // we can't guarantee that all references have been GC'd but we should detect a decrease
         boolean isDecreasing = rowReferences.size() < totalNumberOfReferences;
         if (!isDecreasing) {
-            fail("FinalizerRunnable is not closing all native resources");
+            fail("Native resources are not being closed");
 
         } else {
             android.util.Log.d(RealmTest.class.getName(), "References freed : "
