diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/HiddenFieldCheck.java b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/HiddenFieldCheck.java
index 5a4d380..b0598b1 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/HiddenFieldCheck.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/checks/coding/HiddenFieldCheck.java
@@ -543,7 +543,7 @@
          * @param staticType is this a static inner type (class or enum).
          * @param frameName name associated with the frame, which can be a
          */
-        public FieldFrame(FieldFrame parent, boolean staticType, String frameName) {
+        FieldFrame(FieldFrame parent, boolean staticType, String frameName) {
             this.parent = parent;
             this.staticType = staticType;
             this.frameName = frameName;
