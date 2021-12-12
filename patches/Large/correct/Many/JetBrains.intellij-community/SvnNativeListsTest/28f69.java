diff --git a/plugins/svn4idea/testSource/org/jetbrains/idea/svn/SvnNativeListsTest.java b/plugins/svn4idea/testSource/org/jetbrains/idea/svn/SvnNativeListsTest.java
index 3739d15..9ec9da3 100644
--- a/plugins/svn4idea/testSource/org/jetbrains/idea/svn/SvnNativeListsTest.java
+++ b/plugins/svn4idea/testSource/org/jetbrains/idea/svn/SvnNativeListsTest.java
@@ -72,7 +72,7 @@
 
     ensureAddedToNativeList();
 
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "A a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "A a.txt");
   }
 
   private void ensureAddedToNativeList() {
@@ -104,7 +104,7 @@
     sleepABit();
     ensureAddedToNativeList();
 
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "D a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "D a.txt");
   }
 
   @Test
@@ -128,7 +128,7 @@
     sleepABit();
     ensureAddedToNativeList();
 
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "M a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "M a.txt");
   }
 
   @Test
@@ -153,17 +153,17 @@
     sleepABit();
     ensureAddedToNativeList();
 
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "M a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "M a.txt");
 
     renameFileInCommand(file, "b.txt");
     myDirtyScopeManager.markEverythingDirty();
     myChangeListManager.ensureUpToDate(false);
     sleepABit();
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "A + b.txt", "D a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "A + b.txt", "D a.txt");
 
     ensureAddedToNativeList();
 
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "A + b.txt", "D a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "A + b.txt", "D a.txt");
   }
 
   @Test
@@ -189,7 +189,7 @@
     sleepABit();
     ensureAddedToNativeList();
 
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "A + b.txt", "D a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "A + b.txt", "D a.txt");
   }
 
   @Test
@@ -215,17 +215,17 @@
     sleepABit();
     ensureAddedToNativeList();
 
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "A + b.txt", "D a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "A + b.txt", "D a.txt");
 
     renameFileInCommand(file, "c.txt");
     myDirtyScopeManager.markEverythingDirty();
     myChangeListManager.ensureUpToDate(false);
     sleepABit();
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "A + c.txt", "D a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "A + c.txt", "D a.txt");
 
     ensureAddedToNativeList();
 
-    verify(runSvn("status"), "", "--- Changelist 'newOne':", "A + c.txt", "D a.txt");
+    verifySorted(runSvn("status"), "", "--- Changelist 'newOne':", "A + c.txt", "D a.txt");
   }
 
   private void sleepABit() {
