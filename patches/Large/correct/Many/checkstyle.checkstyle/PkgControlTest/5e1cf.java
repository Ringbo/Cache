diff --git a/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/PkgControlTest.java b/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/PkgControlTest.java
index f794a00..3dea603 100644
--- a/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/PkgControlTest.java
+++ b/src/test/java/com/puppycrawl/tools/checkstyle/checks/imports/PkgControlTest.java
@@ -30,7 +30,7 @@
     private final PkgControl pcCommon = new PkgControl(pcRoot, "common");
 
     @Before
-    public void setUp() throws Exception {
+    public void setUp() {
         pcRoot.addGuard(new Guard(false, false, "org.springframework", false, false));
         pcRoot.addGuard(new Guard(false, false, "org.hibernate", false, false));
         pcRoot.addGuard(new Guard(true, false, "org.apache.commons", false, false));
