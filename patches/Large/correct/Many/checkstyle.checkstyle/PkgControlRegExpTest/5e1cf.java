diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/PkgControlRegExpTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/PkgControlRegExpTest.java
index c3148ca..6bd51d6 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/PkgControlRegExpTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/PkgControlRegExpTest.java
@@ -30,7 +30,7 @@
     private final PkgControl pcCommon = new PkgControl(pcRoot, "common");
 
     @Before
-    public void setUp() throws Exception {
+    public void setUp() {
         pcRoot.addGuard(new Guard(false, false, ".*\\.(spring|lui)framework", false, true));
         pcRoot.addGuard(new Guard(false, false, "org\\.hibernate", false, true));
         pcRoot.addGuard(new Guard(true, false, "org\\.(apache|lui)\\.commons", false, true));
